import "./style.css"
import logo from "../../assets/Img/logo.svg"

function Header(){
    return(
        <header>
            <div className="dsmeta-logo-container">
            <img src={logo} alt="DSMeta" />
            <h1>DSMeta</h1>
            <p>
              Desenvolvido por
              <a href="https://www.instagram.com/prof_nathann/">@prof_nathann.ig</a>
            </p>
            </div>
        </header>
        
    )
}
export default Header;