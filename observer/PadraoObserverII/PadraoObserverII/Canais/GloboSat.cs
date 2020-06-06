using PadraoObserverII.Interface;
using System;

namespace PadraoObserverII.Canais
{
    class GloboSat : IObserverCanal
    {
        public void Atualizar(Agencia entrada)
        {
            Console.WriteLine(entrada.Nome + ": Canal Globo SAT!");
        }
    }
}
