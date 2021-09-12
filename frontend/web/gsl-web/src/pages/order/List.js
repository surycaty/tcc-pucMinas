import React from "react";
import SmartDataTable from 'react-smart-data-table'
import 'react-smart-data-table/dist/react-smart-data-table.css'

export default class OrderList extends React.Component {

      fetchDataImpl = [
        { "id": "1", "name": "Computer", "detail": "link" },
        { "id": "2", "name": "HD SSD", "detail": "link" },
        { "id": "3", "name": "Kit Mouse Keyboard", "detail": "link" },
      ]
      

    render() {
        return(
            <div>
                <h2>Minha Order List</h2>
                <SmartDataTable
                    data={this.fetchDataImpl}
                    
                />
         </div>

        );
    }
}