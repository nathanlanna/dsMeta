import Header from "./components/Header"
import SalesCard from "./components/Main/SalesCard"


function App() {
  return (<>
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
