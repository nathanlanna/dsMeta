import icon from "../../assets/Img/notify-Icon.svg";
import "./style.css"
function NotificationButton() {
    return (
        <div className="dsmeta-red-btn">
            <img src= {icon} alt="notificar"></img>
        </div>
    )
}
export default NotificationButton