import Button from "@restart/ui/esm/Button";
import React from "react";
import { Col, Container, Form, Row } from "react-bootstrap";

export default class OrderRegister extends React.Component {

    render() {
        return(
            <Container>

                <h3 className="header">New Order</h3>
                
                <Form action="/order/1/detail">

                    <Row>
                        <Col sm="12">
                            <Form.Label>Name</Form.Label>
                            <Form.Control type="text" placeholder="Enter Name" />
                        </Col>
                    </Row>

                    <Row>
                        <Col sm="6">
                            <Form.Label>Origin Street</Form.Label>
                            <Form.Control type="text" placeholder="Enter Origin Street" />
                        </Col>
                        <Col>
                            <Form.Label>Origin Number</Form.Label>
                            <Form.Control type="text" placeholder="Enter Origin Number" />
                        </Col>
                    </Row>

                    <Row>
                        <Col xs={7}>
                        <Form.Label>Origin City</Form.Label>
                            <Form.Control placeholder="Enter Origin City" />
                        </Col>
                        <Col>
                            <Form.Label>Origin State</Form.Label>
                            <Form.Control placeholder="Enter Origin State" />
                        </Col>
                        <Col>
                            <Form.Label>Origin Zip</Form.Label>
                            <Form.Control placeholder="Enter Origin Zip" />
                        </Col>
                    </Row>

                    <Row>
                        <Col sm="6">
                            <Form.Label>Destionation Street</Form.Label>
                            <Form.Control type="text" placeholder="Enter Destionation Street" />
                        </Col>
                        <Col>
                            <Form.Label>Destionation Number</Form.Label>
                            <Form.Control type="text" placeholder="Enter Destionation Number" />
                        </Col>
                    </Row>

                    <Row>
                        <Col xs={7}>
                        <Form.Label>Destionation City</Form.Label>
                            <Form.Control placeholder="Enter Destionation City" />
                        </Col>
                        <Col>
                            <Form.Label>Destionation State</Form.Label>
                            <Form.Control placeholder="Enter Destionation State" />
                        </Col>
                        <Col>
                            <Form.Label>Destionation Zip</Form.Label>
                            <Form.Control placeholder="Enter Destionation Zip" />
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