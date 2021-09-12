import React from "react";
import { Nav, Navbar, NavDropdown } from "react-bootstrap";

export default class NavMenu extends React.Component {

    render() {
        return (
            <Navbar bg="light" expand="lg" variant="gray">
                <Navbar.Brand href="/home">SGL - Boa Entrega</Navbar.Brand>
                <Navbar.Toggle aria-controls="navbarScroll" />
                <Navbar.Collapse id="navbarScroll">
                    <Nav className="mr-auto my-2 my-lg-0"
                        style={{ maxHeight: '100px' }}
                        navbarScroll>
                        <Nav.Link href="/home">Home</Nav.Link>
                        <NavDropdown title="Order" id="navbarScrollingDropdown">
                            <NavDropdown.Item href="/order/register">Add Order</NavDropdown.Item>
                            <NavDropdown.Item href="/order/list">List Order</NavDropdown.Item>
                        </NavDropdown>
                        <Nav.Link href="/user/account">Account</Nav.Link>
                    </Nav>

                </Navbar.Collapse>
            </Navbar>
        );
    }
}