using PadraoObserverII.Interface;

namespace PadraoObserverII
{
    public abstract class Agencia
    {
        public string Nome { get; set; }

        protected Agencia(string nome)
        {
            Nome = nome;
        }

        public abstract void AdicionarObservados(IObservar observer);

        public abstract void Notificar();

        public abstract void RemoverItem(IObservar observer);

        public abstract void SalvarEstado();
    }
}
