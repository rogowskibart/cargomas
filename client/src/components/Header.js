import React from 'react';
import { Link } from 'react-router-dom';

const Header = () => {
  return (
    <div className="ui secondary pointing menu">
      <Link to="/bicycles" className="item">
        Bicycles
      </Link>
      <Link to="/stations" className="item">
        Stations
      </Link>
      <Link to="/pricing" className="item">
        Pricing
      </Link>
      <Link to="/contact" className="item">
        Contact
      </Link>
      <div className="right menu">
        <Link to="/login" className="item">
          Log in
        </Link>
      </div>
    </div>
  );
};

export default Header;
