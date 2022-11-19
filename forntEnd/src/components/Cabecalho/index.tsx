import './style.css';
import logo from '../../assets/img/logo.svg';

function Cabecalho() {
    return (
        <div className="cabecalho">
            <img src={logo} alt="logoCabecalho" />
            <h1>Compras Vendas</h1>
            <p>
                Desenvolvido por
                <a href='https://github.com/MauroDegaspari'>@MauroDegaspari</a>
            </p>

        </div>
    )
}

export default Cabecalho;