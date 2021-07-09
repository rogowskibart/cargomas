import React from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';
import BicycleList from './BicycleList';
import Contact from './Contact';
import Pricing from './Pricing';
import StationList from './StationList';

const App = () => {
  return (
    <div>
      <BrowserRouter>
        <div>
          <Route path="/bicycles" exact component={BicycleList} />
          <Route path="/pricing" exact component={Pricing} />
          <Route path="/contact" exact component={Contact} />
          <Route path="/stations" exact component={StationList} />
        </div>
      </BrowserRouter>
    </div>
  );
};

export default App;
