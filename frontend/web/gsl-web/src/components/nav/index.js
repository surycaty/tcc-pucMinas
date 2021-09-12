import React from "react";
import { Link } from "react-router-dom";
import "./styles.css"

export default class Nav extends React.Component {

    render() {
        return (
            <nav className="navMain">
                <ul>
                    <li>
                        <Link to="/home">Home</Link>
                    </li>
                    <li>Order
                        <ul>
                            <li>
                                <Link to="/order/register">Add</Link>
                            </li>
                            <li>
                                <Link to="/order/list">List</Link>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
        );
    }
}