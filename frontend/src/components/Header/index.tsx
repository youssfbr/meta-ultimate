import logo from '../../assets/img/logo.svg';
import './styles.css';

function Header() {
  return (
    <header>  
      <img src={logo} alt="logo meta" />
      <h1>Meta</h1>
      <p>Desenvolvido por <a href="https://github.com/youssfbr">@youssfbr</a></p>   
    </header>
  );
}

export default Header;
