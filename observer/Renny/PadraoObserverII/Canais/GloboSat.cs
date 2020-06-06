using PadraoObserverII.Interface;
using System;

namespace PadraoObserverII.Canais
{
    class GloboSat : IObservar
    {
        public void Atualizar(Agencia entrada)
        {
            Console.WriteLine(entrada.Nome + ": Canal Globo SAT!");
        }
    }
}
