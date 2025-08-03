import React from "react";

const Header = () => {
  const element = "Office Space";

  const items = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai",
      image: "image1.jpg",
    },
    {
      name: "SBN",
      rent: 65000,
      address: "Bangalore",
      image: "image2.jpg",
    },
    {
      name: "IPW",
      rent: 40000,
      address: "Delhi",
      image: "image3.jpg",
    },

  ];

  return (
    <>
      <div>
        <h1>{element} , at Affordable Range</h1>
        <div style={{display: "flex"}}>
          {items.map((item) => {
            return (
              <div key={item.name}>
                <img
                  src={item.image}
                  alt="Office Space"
                  width="25%"
                  height="25%"
                />
                <h1>Name: {item.name}</h1>
                <h3 style={{ color: item.rent <= 60000 ? "Red" : "Green" }}>
                  Rent Rs. {item.rent}
                </h3>
                <h3>Address: {item.address}</h3>
              </div>
            );
          })}
        </div>
      </div>
    </>
  );
};

export default Header;
