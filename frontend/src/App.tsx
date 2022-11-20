import Header from "./components/Header"
import SalesCard from "./components/Main/SalesCard"
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

function App() {
  return (<>
  <ToastContainer/>
    <Header></Header>
    <main>
      <section className="sales">
        <div className="dsmeta-container">
          <SalesCard></SalesCard>
        </div>
      </section>
    </main>

  </>
  )
}

export default App
