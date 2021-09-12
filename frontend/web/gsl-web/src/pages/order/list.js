import React from "react";
import { Container, Table } from "react-bootstrap";
import { Link } from "react-router-dom";

export default class OrderList extends React.Component {

    render() {
        return(
            <Container>
                <h2 className="header">Order List</h2>

                <Table striped bordered hover>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Name</th>
                            <th>Status</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>Computer</td>
                        <td>Done</td>
                        <td><Link to="/order/1/detail">Details</Link></td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Monitor 22"</td>
                        <td>Done</td>
                        <td><Link to="/order/2/detail">Details</Link></td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Kit Mouse Keyboard</td>
                        <td>Done</td>
                        <td><Link to="/order/3/detail">Details</Link></td>
                    </tr>
                </tbody>
                </Table>
            </Container>

        );
    }
}