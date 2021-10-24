import Button from "@restart/ui/esm/Button";
import React from "react";
import { Col, Form, Row } from "react-bootstrap";
import Container from 'react-bootstrap/Container';

export default class OrderUpdate extends React.Component {
      

    render() {
        return(
            <Container>

                <h3 className="header">Order Update</h3>
                
                <Form action="/order/list">

                    <Row>
                        <Form.Label column sm="2">Name</Form.Label>
                        <Col sm="10">
                            <Form.Control defaultValue="Computer" />
                        </Col>
                    </Row>

                    <Row>
                        <Form.Label column sm="2">Origin Street</Form.Label>
                        <Col sm="4">
                            <Form.Control defaultValue="Rua 1" />
                        </Col>
                        
                        <Form.Label column sm="2">Origin Number</Form.Label>
                        <Col sm="4">
                            <Form.Control defaultValue="100" />
                        </Col>
                    </Row>

                    <Row>
                        <Form.Label column sm="2">Origin City</Form.Label>
                        <Col xs={2}>
                            <Form.Control defaultValue="São Paulo" />
                        </Col>

                        <Form.Label column sm="2">Origin State</Form.Label>
                        <Col sm="2">
                            <Form.Control defaultValue="SP" />
                        </Col>

                        <Form.Label column sm="2">Origin Zip</Form.Label>
                        <Col sm="2">
                            <Form.Control defaultValue="05700000" />
                        </Col>
                    </Row>

                    <Row>
                        <Form.Label column sm="2">Destination Street</Form.Label>
                        <Col sm="4">
                            <Form.Control defaultValue="Rua 2" />
                        </Col>
                        
                        <Form.Label column sm="2">Destination Number</Form.Label>
                        <Col sm="4">
                            <Form.Control defaultValue="200" />
                        </Col>
                    </Row>

                    <Row>
                        <Form.Label column sm="2">Destination City</Form.Label>
                        <Col xs={2}>
                            <Form.Control defaultValue="Fortaleza" />
                        </Col>

                        <Form.Label column sm="2">Destination State</Form.Label>
                        <Col sm="2">
                            <Form.Control defaultValue="CE" />
                        </Col>

                        <Form.Label column sm="2">Destination Zip</Form.Label>
                        <Col sm="2">
                            <Form.Control defaultValue="05700123" />
                        </Col>
                    </Row>

                    <Row>
                        <Form.Label column sm="2">Status</Form.Label>
                        <Col sm="2">
                            <Form.Select  >
                                <option>Open this select menu</option>
                                <option value="Not Found">Not Found</option>
                                <option value="In Transit">In Transit</option>
                                <option value="Pick Up">Pick Up</option>
                                <option value="Undelivered" >Undelivered</option>
                                <option value="Delivered" >Delivered</option>
                                <option value="Alert" >Alert</option>
                                <option value="Expired" >Expired</option>
                            </Form.Select>
                        </Col>
                    </Row>

                    <Row>
                        <Col sm="2">
                            <Button type="submit" className="btn btn-secondary btn-block">Back</Button>
                        </Col>
                        <Col sm="2">
                            <Button type="submit" className="btn btn-primary btn-block">Save</Button>
                        </Col>
                    </Row>
                    
                </Form>
            
            </Container>
        );
    }
}