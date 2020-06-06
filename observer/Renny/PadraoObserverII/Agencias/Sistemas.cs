using PadraoObserverII.Interface;
using System;
using System.Collections.Generic;
using System.Text;

namespace PadraoObserverII.Agencias
{
    class Sistemas : Agencia
    {
        public List<IObservar> Observados = new List<IObservar>();

        public Sistemas() : base("Sistemas")
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
