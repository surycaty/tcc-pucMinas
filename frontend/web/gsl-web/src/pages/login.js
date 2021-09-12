import React from "react";

export default class Login extends React.Component {

    submitForm = () => {
        this.props.history.push("/home");
    }

    render() {
        return(
            <div className="login">
                <fieldset>
                    <legend>Login</legend>

                    <label>Username:</label>
                    <input name="username" type="text" />
                    <br className="clearBoth" />

                    <label>Password:</label>
                    <input name="password" type="password" />
                    <br className="clearBoth" />

                    <button onClick={this.submitForm}>Login</button>
                </fieldset>
            </div>
        );
    }
}