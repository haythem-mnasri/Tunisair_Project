import React, { Component, lazy, Suspense } from 'react';
import { Badge, Card, CardBody, CardHeader, Col, Pagination, PaginationItem, PaginationLink, Row, Table } from 'reactstrap';
import axios from 'axios';



class Dashboard extends Component {
  state = {
    avions : [],
    
  }


  componentDidMount() {
    console.log('Recuperation des données : meetings')
    axios.get('http://localhost:8083/avions').then((response)=>{
      this.setState({
        avions : response.data._embedded.avions
      })
      //   console.log(this.state.avions._embedded.chef_Escales[0].nom)

    });
  }


  render() {





    return (
      <div className="animated fadeIn">
        <center>
          <Col xs="12" lg="6">
            <Card>
              <CardHeader>
                <i className="fa fa-align-justify"></i> Simple Table
              </CardHeader>
              <CardBody>
                <Table responsive>
                  <thead>
                  <tr>
                    <th>Réference</th>
                    <th>Version</th>
                    <th>Longueur</th>
                    <th>Autonomie</th>
                  </tr>
                  </thead>
                  <tbody>
                  {
                    this.state.avions.map((a,index) => {



                      return (
                        <tr key = {index}>

                          <td>{a.ref}</td>
                          <td>{a.version}</td>
                          <td>{a.longueur}</td>
                          <td>{a.autonomie}</td>
                          <td>
                            <Badge color="success">Active</Badge>
                          </td>
                        </tr>
                      )
                    })
                  }
                  </tbody>
                </Table>
                <Pagination>
                  <PaginationItem>
                    <PaginationLink previous tag="button"></PaginationLink>
                  </PaginationItem>
                  <PaginationItem active>
                    <PaginationLink tag="button">1</PaginationLink>
                  </PaginationItem>
                  <PaginationItem>
                    <PaginationLink tag="button">2</PaginationLink>
                  </PaginationItem>
                  <PaginationItem>
                    <PaginationLink tag="button">3</PaginationLink>
                  </PaginationItem>
                  <PaginationItem>
                    <PaginationLink tag="button">4</PaginationLink>
                  </PaginationItem>
                  <PaginationItem>
                    <PaginationLink next tag="button"></PaginationLink>
                  </PaginationItem>
                </Pagination>
              </CardBody>
            </Card>
          </Col>


        </center>

      </div>
    );
  }
}


export default Dashboard;
