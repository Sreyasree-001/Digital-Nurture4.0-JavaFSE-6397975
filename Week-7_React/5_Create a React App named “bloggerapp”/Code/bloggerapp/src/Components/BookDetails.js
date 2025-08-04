import React from "react";
import { books } from "./data";

const BookDetails = () => {
  return (
    <div>
      {books.map((item) => {
        return (
          <div key={item.id}>
            <h2>{item.bname}</h2>
            <h3>{item.price}</h3>
          </div>
        );
      })}
    </div>
  );
};

export default BookDetails;
