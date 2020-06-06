using System.Collections.Generic;
using PadraoObserverII.Interface;

namespace PadraoObserverII
{
    public class Agencia
    {

        private readonly static List<IObserverRevista> ObserveRevista = new List<IObserverRevista>();
        private readonly static List<IObserverCanal> ObserveCanal = new List<IObserverCanal>();

        public string Nome { get; set; }

        public Agencia(string nome)
        {
            Nome = nome;
        }

        public Agencia ObterEstadoRevista()
        {
            return this;
        }

        public Agencia ObterEstadoCanal()
        {
            return this;
        }

        public void SalvarEstadoRevista()
        {
            AvisarEditora();
        }

        public void SalvarEstadoCanal()
        {
            AvisarEmissora();
        }

        public static void AdicionarObservadorRevista(IObserverRevista observer)
        {
            Agencia.ObserveRevista.Add(observer);
        }

        public static void AdicionarObservadorCanal(IObserverCanal observer)
        {
            Agencia.ObserveCanal.Add(observer);
        }

        public static void RemoverRevista(IObserverRevista observer)
        {
            Agencia.ObserveRevista.Remove(observer);
        }

        public static void RemoverCanal(IObserverCanal observer)
        {
            Agencia.ObserveCanal.Remove(observer);
        }

        public void AvisarEditora()
        {
            foreach (IObserverRevista revista in ObserveRevista) {
                revista.Atualizar(this);
            }
        }

        public void AvisarEmissora()
        {
            foreach (IObserverCanal canal in ObserveCanal)
            {
                canal.Atualizar(this);
            }
        }
    }
}
