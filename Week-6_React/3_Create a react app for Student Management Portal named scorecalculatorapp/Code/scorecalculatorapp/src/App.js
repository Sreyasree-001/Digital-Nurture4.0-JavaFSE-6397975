import './App.css';
import CalculateScore from './Components/CalculateScore'

function App() {
  return (
    <>
    <div>
      <CalculateScore
      Name={"Sreyasree Sasmal"}
      School={"ABC Public School"}
      total={284}
      goal={3}
      />
    </div>
    </>
  );
}

export default App;
