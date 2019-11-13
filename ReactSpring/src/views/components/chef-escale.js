import React, { Component } from 'react'; 
import { Badge, Card, CardBody, CardHeader, Col, Pagination, PaginationItem, PaginationLink, Row, Table } from 'reactstrap';
import axios from 'axios';
export default class chef_escale extends Component {
    state = {
        avions : [],
        
      }
    
    
      componentDidMount() {
        console.log('Recuperation des données : meetings')
        axios.get('http://localhost:8084/chef_Escales').then((response)=>{
         this.setState({
           avions : response.data._embedded.chef_Escales
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
                        <th>nom</th>
                        <th>prenom</th>
                        <th>age</th>
                        <th>annee_experience</th>
                        <th>salaire</th>
                        <th>nationalite</th>
                        <th>type_contrat</th>
                        <th>salle_embarquemment</th>

                      </tr>
                      </thead>
                      <tbody>
                      {
                        this.state.avions.map((a,index) => {



                          return (
                            <tr key = {index}>

                              <td>{a.nom}</td>
                              <td>{a.prenom}</td>
                              <td>{a.age}</td>
                              <td>{a.annee_experience}</td>
                              <td>{a.salaire}</td>
                              <td>{a.nationalite}</td>
                              <td>{a.type_contrat}</td>
                              <td>{a.salle_embarquemment}</td>




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
