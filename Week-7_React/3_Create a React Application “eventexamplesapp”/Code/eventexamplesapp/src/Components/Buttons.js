import React, { useState } from "react";

const Buttons = () => {
  const [count, setCount] = useState(0);

  const handleIncrement = () => {
    setCount(count+1);
    alert("Hello Member !!")
  }

  const handleDecement = () => {
    setCount(count-1);
  }

  return (
    <>
      <div >
        <h1>{count}</h1>
        <button onClick={handleIncrement}>Increment</button><br/>
        <button onClick={handleDecement}>Decrement</button><br/>
        <button onClick={() => alert("Welcome")}>Say Welcome</button><br/>
        <button onClick={() => alert("I was clicked")}>Click on me</button><br/>
      </div>
    </>
  );
};

export default Buttons;
