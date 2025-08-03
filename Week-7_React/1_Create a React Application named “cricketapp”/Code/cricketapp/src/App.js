import "./App.css";
import ListofPlayers from "./Components/ListofPlayers";
import players from "./Data/players.json";
import ScoreBelow70 from "./Components/ScoreBelow70";
import ListOfIndianPlayers from "./Components/ListOfIndianPlayers";
import OddAndEvenPlayers from "./Components/OddAndEvenPlayers";

const T20players = ["First Player", "Second Player", "Third Player"];
const RanjiTrophyPlayers = ["Forth Player", "Fifth Player", "Sixth Player"];
export const IndianPlayers = [...T20players, ...RanjiTrophyPlayers];

function App() {
  var flag = true;
  if (flag === true) {
    return (
      <div>
        <h1>List Of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List Of Players Having Score Less Than 70</h1>
        <ScoreBelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <div>
          <h1>Indian Team</h1>
          <OddAndEvenPlayers players={players}/>
        </div>
        <hr/>
        <div>
          <h1>List of Indian Players Merged:</h1>
          <ListOfIndianPlayers IndianPlayers={IndianPlayers}/>
        </div>
      </div>
    );
  }
}

export default App;
