import BotaoSmS from "./components/BotaoSmS"
import Cabecalho from "./components/Cabecalho"
import CardVendas from "./components/CardVendas"

function App() {
  return (
    <>
      <Cabecalho></Cabecalho>

      <main>
        <section id="vendas">
          <div className="vendas-conteiner">
            <CardVendas></CardVendas>

          </div>
        </section>
      </main>
    </>
  )
}

export default App
