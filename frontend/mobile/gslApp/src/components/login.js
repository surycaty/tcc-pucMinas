import React from 'react';
import { Button, Text, View } from 'react-native';
import { TextInput } from 'react-native-gesture-handler';
import styled, { ThemeProvider } from 'styled-components/native';

export default class LoginScreen extends React.Component {

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
                <Title>Login</Title>
            </Titlebar>
            <Container>
              <TextInput placeholder="username" autoFocus />
              <TextInput secureTextEntry={true} placeholder="password" />
              <View>
                <Button title="Login" onPress={() => this.props.navigation.navigate('Home')}/>
                <Text>New register <Text style={{color: 'blue'}}
                    onPress={() => this.props.navigation.navigate('Register')}>here</Text>
                </Text>
              </View>
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