import logo from './logo.svg';
import './App.css';
//import { BrowserRouter } from 'react-router-dom';
import Home from './Pages/home'
import { BrowserRouter, Route, Routes, Link } from 'react-router-dom'

function App() {



  return (
    <div className="App">
<Home/>
{/* <BrowserRouter >
        
        <Routes>         
        <Route exact path="/home" element={<Home />} />
        </Routes>
        </BrowserRouter> */}
    </div>
  );
}

export default App;
