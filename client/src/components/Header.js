import React from 'react';
import { Link } from 'react-router-dom';

const Header = () => {
  return (
    <div className="ui secondary pointing menu">
      <Link to="/bicycles" className="item">
        Rowery
      </Link>
      <Link to="/stations" className="item">
        Stacje
      </Link>
      <Link to="/pricing" className="item">
        Cennik
      </Link>
      <Link to="/contact" className="item">
        Kontakt
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
