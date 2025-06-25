CREATE SEQUENCE Transactions_seq START WITH 1000 INCREMENT BY 1;

CREATE OR REPLACE PROCEDURE TransferFunds (
    from_account_id IN NUMBER,
    to_account_id   IN NUMBER,
    transfer_amount IN NUMBER
) IS
    insufficient_balance EXCEPTION;
    v_balance NUMBER;
BEGIN

    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = from_account_id
    FOR UPDATE;

    IF v_balance < transfer_amount THEN
        RAISE insufficient_balance;
    END IF;

    UPDATE Accounts
    SET Balance = Balance - transfer_amount,
        LastModified = SYSDATE
    WHERE AccountID = from_account_id;

    UPDATE Accounts
    SET Balance = Balance + transfer_amount,
        LastModified = SYSDATE
    WHERE AccountID = to_account_id;


EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance.');
        ROLLBACK;
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
        ROLLBACK;
END;
/

