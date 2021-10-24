import React from "react";
import { Switch, Route } from "react-router";
import Home from "../../pages/home";
import Login from "../../pages/login";
import OrderDetail from "../../pages/order/detail";
import OrderUpdate from "../../pages/order/update";
import OrderList from "../../pages/order/list";
import OrderRegister from "../../pages/order/register";
import UserAccount from "../../pages/user/account";
import UserRegister from "../../pages/user/register";

export default class Content extends React.Component {

    render() {
        return(
            <Switch>
                <Route exact path="/" component={Login} />
                <Route path="/home" component={Home} />
                <Route path="/user/register" component={UserRegister} />
                <Route path="/user/account" component={UserAccount} />
                <Route path="/order/register" component={OrderRegister} />
                <Route path="/order/list" component={OrderList} />
                <Route path="/order/:idOrder/detail" component={OrderDetail} />
                <Route path="/order/:idOrder/update" component={OrderUpdate} />
            </Switch>
        );
    }
}