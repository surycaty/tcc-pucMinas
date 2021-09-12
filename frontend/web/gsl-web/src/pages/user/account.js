import Button from "@restart/ui/esm/Button";
import React from "react";
import { Col, Container, Form, Row } from "react-bootstrap";

export default class UserAccount extends React.Component {
      

    render() {
        return(
            <Container>

                <h3 className="header">Account</h3>
                
                <Form action="/user/account">

                    <Row>
                        <Col sm="12">
                            <Form.Label>Full Name</Form.Label>
                            <Form.Control type="text" placeholder="Enter Full Name" defaultValue="Adriano Almeida" />
                        </Col>
                    </Row>

                    <Row>
                        <Col sm="8">
                            <Form.Label>Street</Form.Label>
                            <Form.Control type="text" placeholder="Enter Street" defaultValue="Rua 1" />
                        </Col>
                        <Col>
                            <Form.Label>Number</Form.Label>
                            <Form.Control type="text" placeholder="Enter Number" defaultValue="100" />
                        </Col>
                    </Row>

                    <Row className="g-2">
                        <Col>
                            <Form.Label>Username</Form.Label>
                            <Form.Control type="text" placeholder="Enter Username" defaultValue="adriano" />
                        </Col>

                        <Col>
                            <Form.Label>Password</Form.Label>
                            <Form.Control type="password" placeholder="Enter password" defaultValue="123456" />
                        </Col>
                    </Row>

                    <Row>
                        <Col sm="6">
                            <Button type="submit" className="btn btn-primary btn-block">Submit</Button>
                        </Col>
                    </Row>
                    
                </Form>
            
            </Container>
        );
    }
}