import Button from "@restart/ui/esm/Button";
import React from "react";
import { Col, Container, Form, Row } from "react-bootstrap";
import { Link } from "react-router-dom";

export default class Login extends React.Component {

    submitForm = () => {
        this.props.history.push("/home");
    }

    render() {
        return(
            <Container>

                <h3 className="header">Sign In</h3>
                
                <Form action="/home">

                    <Row>
                        <Col sm="6">
                            <Form.Label>Username</Form.Label>
                            <Form.Control type="text" placeholder="Enter Username" />
                        </Col>
                    </Row>

                    <Row>
                        <Col sm="6">
                            <Form.Label>Password</Form.Label>
                            <Form.Control type="password" placeholder="Enter password" />
                        </Col>
                    </Row>

                    <Row>
                        <Col sm="6">
                            <Form.Group className="mb-3" id="formGridCheckbox">
                                <Form.Check type="checkbox" label="Remember me" />
                            </Form.Group>
                        </Col>
                    </Row>

                    <Row>
                        <Col sm="6">
                            <Button type="submit" className="btn btn-primary btn-block">Submit</Button>
                            <p className="forgot-password text-right">
                                Forgot <Link to="#">password</Link> or new <Link to="/user/register">register</Link>
                            </p>
                        </Col>
                    </Row>
                </Form>
            </Container>
        );
    }
}