import React from 'react';
import { FlatList, View } from 'react-native';
import styled, { ThemeProvider } from 'styled-components/native';

export default class OrderListScreen extends React.Component {

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
    let dataSource = [
      {
        id: 1,
        name: 'Computer'
      },
      {
        id: 2,
        name: 'Monitor 22"'
      },
      {
        id: 3,
        name: 'Kit Mouse Keyboard'
      }
    ]

    return (
      <Container>
        <ThemeProvider theme={this.theme}>
          <Container>
            <Titlebar>
              <Title>Order List</Title>
            </Titlebar>
            <Container>
              <FlatList data={dataSource}
                keyExtractor={item => item.id}
                renderItem={({item}) => 
                  <View>
                    <Text onPress={() => this.props.navigation.navigate('OrderDetail')}>
                      {item.id} - {item.name}
                    </Text>
                  </View>
                }
              />      
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

const Text = styled.Text`
  font-size: 18px;
`;