import React from "react";
import Nav from "../nav";
import "./styles.css"

export default class Header extends React.Component {

    render() {
        return(
            <header className="header">
                <Nav />
            </header>
        );
    }
}