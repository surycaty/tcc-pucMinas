import React from 'react';
import { Button, Picker, StyleSheet, Text, View } from 'react-native';
import { TextInput } from 'react-native-gesture-handler';
import styled, { ThemeProvider } from 'styled-components/native';

export default class OrderDetailScreen extends React.Component {

  state = {
    isLoading: false,
    error: null,
    refreshing: false,
  };

  theme = {
    margin: 0,
    padding: 0,
    boxSizing: 'border-box',
  };

  render() {
    return (
      <Container>
        <ThemeProvider theme={this.theme}>
          <Container>
            <Titlebar>
              <Title>Order Detail</Title>
            </Titlebar>
            <Container>
              <Text>Name:</Text>
              <TextInput editable={false} defaultValue="Computer" />
              
              <Text>Origin:</Text>
              <Row>
                <Col6 editable={false} defaultValue="Street 1" />
                <Col4 editable={false}  defaultValue="100" />
              </Row>

              <Text>Destination:</Text>
              <Row>
                <Col6 editable={false} defaultValue="Street 2" />
                <Col4 editable={false}  defaultValue="200" />
              </Row>

              <Text>Status:</Text>
              <Picker style={{ width: 150 }}>
                <Picker.Item label="Not Found" value="Not Found" />
                <Picker.Item label="In Transit" value="In Transit" />
                <Picker.Item label="Pick Up" value="Pick Up" />
                <Picker.Item label="Undelivered" value="Undelivered" />
                <Picker.Item label="Delivered" value="Delivered" />
                <Picker.Item label="Alert" value="Alert" />
                <Picker.Item label="Expired" value="Expired" />
              </Picker>

              <Button title="Update" onPress={() => this.props.navigation.navigate('Home')}/>
            </Container>
          </Container>
        </ThemeProvider>
      </Container>
    );
  }
}

const Container = styled.View`
  flex: 1;
  background-color: white;
  padding: 5px;
`;

const Titlebar = styled.View`
  width: 100%;
  margin-top: 26px;
  border-top-left-radius: 14px;
  border-top-right-radius: 14px;
  overflow: hidden;
  align-items: flex-end;
  flex-direction: row;
  display: flex;
  justify-content: center;
`;

const Title = styled.Text`
  font-size: 40px;
  font-weight: 500;
  color: #b8bece;
`;

const Row = styled.View`
  flex-direction: row;
  flex-wrap: wrap;
`;

const Col6 = styled.TextInput`
  width: 60%;
`;

const Col4 = styled.TextInput`
  width: 40%;
`;