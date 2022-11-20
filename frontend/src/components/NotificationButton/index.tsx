import axios from 'axios';
import icon from '../../assets/img/notification-icon.svg';
import { BASE_URL } from '../../utils/request';
import './styles.css';

type Props = {
  saleId: number;
}

function handleClick(saleId: number): void {
  axios(`${BASE_URL}/api/v1/sales/${saleId}/notification`)
  .then(response => {
    console.log("sucesso");    
  });
}

function NotificationButton( {saleId}: Props) {
  return (
    <div className="red-btn" onClick={() => handleClick(saleId)}>
      <img src={icon} alt="Botão notificar" />
    </div>
  );
}

export default NotificationButton;
