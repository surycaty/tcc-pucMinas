import React from "react";
import { Switch, Route } from "react-router";
import Home from "../../pages/home";
import Login from "../../pages/login";
import OrderList from "../../pages/order/List";
import OrderRegister from "../../pages/order/register";

export default class Content extends React.Component {

    render() {
        return(
            <Switch>
                <Route exact path="/" component={Login} />
                <Route path="/home" component={Home} />
                <Route path="/order/register" component={OrderRegister} />
                <Route path="/order/list" component={OrderList} />
            </Switch>
        );
    }
}