using PadraoObserverII.Interface;
using System.Collections.Generic;

namespace PadraoObserverII.Agencias
{
    class VaiQueDa : Agencia
    {
        public List<IObservar> Observados = new List<IObservar>();

        public VaiQueDa() : base("Vai Que Da")
        {
        }
        public override void AdicionarObservados(IObservar observer)
        {
            Observados.Add(observer);
        }

        public override void Notificar()
        {
            foreach (IObservar item in Observados)
            {
                item.Atualizar(this);
            }
        }

        public override void RemoverItem(IObservar observer)
        {
            Observados.Add(observer);
        }

        public override void SalvarEstado()
        {
            Notificar();
        }
    }
}
