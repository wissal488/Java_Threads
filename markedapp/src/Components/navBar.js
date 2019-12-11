import React from 'react';
//import 'bootstrap/dist/css/bootstrap.css';
import {Link} from 'react-router-dom';

class NavBar extends React.Component{
    render(){
        return(
         <div>
        <ul>
            <li><Link to='/'>Home</Link></li>
            <li><Link to='/About'>About</Link></li>
            <li><Link to='/Article'>Article</Link></li>
        </ul>
        </div>
        );
    }
}
export default NavBar;