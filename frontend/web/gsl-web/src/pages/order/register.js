import React from "react";

export default class OrderRegister extends React.Component {

    render() {
        return(
            <div>
                <fieldset>
                    <legend>Register New Order</legend>

                    <div>
                        <label>Name</label>
                        <input type="text" />
                    </div>

                    <div className="formHalf">
                        
                        <div>
                            <label>Origin</label>
                            <input type="text" />
                        </div>

                        <div>
                            <label>Destination</label>
                            <input type="text" />
                        </div>
                    </div>

                </fieldset>
            </div>
        );
    }
}