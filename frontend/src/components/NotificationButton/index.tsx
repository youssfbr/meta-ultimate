import icon from '../../assets/img/notification-icon.svg';
import './styles.css';

function NotificationButton() {
  return (
    <div className="red-btn">
      <img src={icon} alt="Botão notificar" />
    </div>
  );
}

export default NotificationButton;
