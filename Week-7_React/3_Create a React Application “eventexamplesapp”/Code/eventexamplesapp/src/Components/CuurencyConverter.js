import React, { useState } from "react";

const CuurencyConverter = () => {
  const [number, setNumber] = useState(0);
  const [currency, setCurrency] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    if(currency.toLocaleLowerCase()==="euro")
    {
        const newNum = 80 * number;
        alert("Converting to Euro...Amount is: "+ newNum);
    }
    else alert("Invalid currency!");
  }

  return (
    <>
      <div style={{ marginTop: "50px", maxWidth: "500px" }}>
        
        <form
          style={{
            display: "flex",
            flexDirection: "column",
            width:"70%",
            alignItems:"center"
          }}
        >
            <h1 style={{ color: "green" }}>Cuurency Converter !!!</h1>
          <div>
            <label htmlFor="amount">Amount: </label>
            <input
              type="number"
              name="amount"
              id="amount"
              required
              value={number}
              onChange={(e) => setNumber(e.target.value)}
            />
          </div>
          <div>
            <label htmlFor="currency">Cuurency: </label>
            <input
              type="text"
              name="currency"
              id="currency"
              required
              value={currency}
              onChange={(e) => setCurrency(e.target.value)}
            />
          </div>
          <div >
            <button onClick={handleSubmit}>Submit</button>
          </div>
        </form>
      </div>
    </>
  );
};

export default CuurencyConverter;
