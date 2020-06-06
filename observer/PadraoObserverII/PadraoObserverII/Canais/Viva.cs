using PadraoObserverII.Interface;
using System;

namespace PadraoObserverII.Canais
{
    class Viva : IObserverCanal
    {
        public void Atualizar(Agencia entrada)
        {
            Console.WriteLine(entrada.Nome + ": Canal VIVA!");
        }
    }
}
