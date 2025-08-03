import React from 'react'
import UserGreeting from './UserGreeting';
import GuestGreeting from './GuestGreeting';

function Greeting({isLoggedIn}){
    //const isLoggedIn = false;

    if(isLoggedIn){
        return <UserGreeting/>
    }
    else return <GuestGreeting/>
}

export default Greeting