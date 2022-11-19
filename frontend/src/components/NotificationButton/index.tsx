import axios from "axios";
import icon from "../../assets/Img/notify-Icon.svg";
import { BASE_URL } from "../../utils/request";
import "./style.css"

type Props= {
    saleId: number;
}

function NotificationButton({saleId}:Props) {
    return (
        <div className="dsmeta-red-btn" onClick={()=> handleClick(saleId)}>
            <img src= {icon} alt="notificar"></img>
        </div>
    )
}
export default NotificationButton

function handleClick(id: number) {
    axios.get(`${BASE_URL}/sales/${id}/notification`)
      .then(resposta => {
        console.log("SUCESS");
})
}
