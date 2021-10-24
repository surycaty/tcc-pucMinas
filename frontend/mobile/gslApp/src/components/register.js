import React from 'react';
import { Button } from 'react-native';
import { TextInput } from 'react-native-gesture-handler';
import styled, { ThemeProvider } from 'styled-components/native';

export default class RegisterScreen extends React.Component {

  state = {
    isLoading: false,
    userLogin: {},
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
              <Title>Register</Title>
            </Titlebar>
            <Container>
              <TextInput placeholder="Full Name" autoFocus />
              <TextInput placeholder="Street" />
              <TextInput placeholder="Number" />
              <TextInput placeholder="Zip Code" />
              <TextInput placeholder="Username" />
              <TextInput secureTextEntry={true} placeholder="Password" />
              <TextInput secureTextEntry={true} placeholder="Repeat Password" />
              <ButtonGroup>
                <Button title="Save" onPress={() => this.props.navigation.navigate('OrderList')}/>
                <Button title="Cancel" onPress={() => this.props.navigation.navigate('Login')}/>
              </ButtonGroup>
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

const ButtonGroup = styled.View`
  
`;
