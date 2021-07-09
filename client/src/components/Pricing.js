import React from 'react';
import { Link } from 'react-router-dom';

const Pricing = () => {
  return (
    <div>
      <table className="ui collapsing selectable celled striped table">
        <thead>
          <tr>
            <th colspan="2">Cennik</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>Pierwsza godzina</td>
            <td>15 zł</td>
          </tr>
          <tr>
            <td>Od 2 do 4 godziny</td>
            <td>20 zł</td>
          </tr>
          <tr>
            <td>Od 5 do 6 godziny</td>
            <td>25 zł</td>
          </tr>
          <tr>
            <td>Cały dzień</td>
            <td>150 zł</td>
          </tr>
          <tr>
            <td>Więcej niż jeden dzień</td>
            <td>
              Prosimy o <Link to="/contact">kontakt</Link>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  );
};

export default Pricing;
