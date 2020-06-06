using System;
using System.Collections.Generic;
using System.Text;

namespace PadraoObserverII.Interface
{
    public interface IObserverCanal
    {
        public void Atualizar(Agencia entrada);
    }
}
