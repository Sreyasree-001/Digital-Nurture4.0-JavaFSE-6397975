import React from "react";

const OddAndEvenPlayers = ({ players }) => {
  return (
    <>
      <div>
        <h1>Odd Players</h1>
        {players
          .filter((player) => player.country === "India")
          .map(({ name }, index) =>
            (index + 1) % 2 !== 0 ? (
              <li key={name}>
                Mr. {name} {index + 1}
              </li>
            ) : null
          )}
      </div>
      <hr />
      <div>
        <h1>Even Players</h1>
        {players
          .filter((player) => player.country === "India")
          .map(({ name }, index) =>
            (index + 1) % 2 === 0 ? (
              <li key={name}>
                Mr. {name} {index + 1}
              </li>
            ) : null
          )}
      </div>
    </>
  );
};

export default OddAndEvenPlayers;
