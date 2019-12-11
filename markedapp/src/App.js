import React /*{Components}*/ from 'react';
import About from './Pages/about';
import NavBar from './Components/navBar';
import Home from './Pages/home';
import Article from './Pages/articlesPage';
import {Route,BrowserRouter } from 'react-router-dom';
import './App.css';
import articlesPage from './Pages/articlesPage';
function App (){
    return(
      <BrowserRouter>
     <div >
       <NavBar/>
      <Route path='/' Component={Home} exact/>
      <Route path='/about' Component={About} />
      <Route path='/article' Component={Article} />
      <Route path='/article/name' Component={articlesPage} />
     </div> 
   </BrowserRouter>
    );
}

export default App;
