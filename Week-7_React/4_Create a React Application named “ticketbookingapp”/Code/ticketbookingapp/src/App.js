import './App.css';
import Greeting from './Components/Greeting';
import { useState } from 'react';


function App() {
  const [isLogged, setIsLogged] = useState(false);
  return (
    <>
    <div>
    <Greeting isLoggedIn={isLogged}/>
    {
      isLogged ? 
      <>
      <button onClick={() => setIsLogged(false)}>Logout</button>
      </> : 
      <>
      <button onClick={() => setIsLogged(true)}>Login</button></>
    }
    </div>
    </>
  );
}

export default App;
