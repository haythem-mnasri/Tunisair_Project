import React from 'react';


const Dashboard = React.lazy(() => import('./views/Dashboard'));
const chefs = React.lazy(() => import('./views/components/chef-escale'));

const ingenieurs = React.lazy(() => import('./views/components/ingenieurs'));
const pilotes = React.lazy(() => import('./views/components/pilotes'));


// https://github.com/ReactTraining/react-router/tree/master/packages/react-router-config
const routes = [
  { path: '/', exact: true, name: 'Home' },
 
  { path: '/avion', name: 'avion', component: Dashboard },
  { path: '/chefs', name: 'Dashboard', component: chefs },
  { path: '/ingenieurs', name: 'Dashboard', component: ingenieurs },
  { path: '/pilotes', name: 'Dashboard', component: pilotes },
 
];

export default routes;
