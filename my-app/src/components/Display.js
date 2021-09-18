import React, { Component } from 'react';
import axios from 'axios';


class Display extends Component {
constructor(props) {
    super(props)

    this.state = {
         userslist:[]
    }
}

   componentDidMount(){

    axios.get('/users').then(response => {
       
        console.log(response.data[0])
        this.setState({userslist: response.data})
    
    }).catch(error => {console.log(error)})
   }
  render() {

    const{ userslist} = this.state
    return (
    
       
        <div style={ {marginTop: 20}} >User List{userslist.length ?
        userslist.map(ele => <div key={ele.id}> 
        <dl>
      Id: {ele.iduser}   First Name: {ele.firstname}   Last Name:  {ele.last_name}  Email:  {ele.email} Gender: {ele.gender} Ipaddress:  {ele.ip_address}</dl></div>):
        null
        }
            
              
              
             </div>
    );
  }
}

export default Display;