import * as Icon from 'react-bootstrap-icons';

const Footer = () => {
    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <p className="text-light">Aplicação desenvolvida por Raphael Scandura</p>
                <p className="text-light"><a href="https://www.linkedin.com/in/raphaelscandura/" target="_blank" rel="noreferrer"><Icon.Linkedin color="gray" size={32} /></a>      <a href="https://github.com/raphaelscandura" target="_blank" rel="noreferrer"><Icon.Github color = "gray" size={32} /></a></p>
                <p className="text-light"><small><strong>Semana Spring e React </strong><br />
                    Evento promovido pela escola DevSuperior: <a href="https://instagram.com/devsuperior.ig" target="_blank" rel="noreferrer">@devsuperior.ig</a></small></p>
            </div>
        </footer>
    );
}

export default Footer;