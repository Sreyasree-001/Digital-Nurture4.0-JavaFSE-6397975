SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
    v_new_balance NUMBER;
BEGIN
    FOR acc IN (
        SELECT AccountID, Balance
        FROM Accounts
        WHERE AccountType = 'Savings'
    ) LOOP
        v_new_balance := acc.Balance + (acc.Balance * 0.01);
        
        DBMS_OUTPUT.PUT_LINE('Account ID: ' || acc.AccountID);
        DBMS_OUTPUT.PUT_LINE('Old Balance: ' || acc.Balance);
        DBMS_OUTPUT.PUT_LINE('New Balance: ' || v_new_balance);

        UPDATE Accounts
        SET Balance = v_new_balance,
            LastModified = SYSDATE
        WHERE AccountID = acc.AccountID;
    END LOOP;
    COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/
