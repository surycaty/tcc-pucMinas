import React from 'react';
import { Text } from 'react-native';
import styled, { ThemeProvider } from 'styled-components/native';


export default class HomeScreen extends React.Component {

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
                <Title>Home</Title>
            </Titlebar>
            <Container>
              <Text>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                when an unknown printer took a galley of type and scrambled it to make a type 
                specimen book. It has survived not only five centuries, but also the leap into 
                electronic typesetting, remaining essentially unchanged. It was popularised in 
                the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, 
                and more recently with desktop publishing software like Aldus PageMaker including 
                versions of Lorem Ipsum.
              </Text>
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
  color: #fff;
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