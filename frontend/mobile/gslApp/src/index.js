import { createAppContainer } from 'react-navigation';
import { createStackNavigator } from 'react-navigation-stack';
import LoginScreen from './components/login';
import RegisterScreen from './components/register';
import OrderListScreen from './components/order-list';
import OrderDetailScreen from './components/order-detail';


const NavigationStack = createStackNavigator({

  Login: {
    screen: LoginScreen,
    navigationOptions: { headerShown: false, }
  },
  Register: {
    screen: RegisterScreen,
    navigationOptions: { headerShown: false, }
  },
  OrderList: {
    screen: OrderListScreen,
    navigationOptions: { headerShown: false, }
  },
  OrderDetail: {
    screen: OrderDetailScreen,
    navigationOptions: { headerShown: false, }
  }
});

const Routes = createAppContainer(NavigationStack);

export default Routes;
