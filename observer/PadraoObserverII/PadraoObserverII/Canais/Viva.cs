using PadraoObserverII.Interface;
using System;

namespace PadraoObserverII.Canais
{
    class Viva : IObservar
    {
        public void Atualizar(Agencia entrada)
        {
            Console.WriteLine(entrada.Nome + ": Canal VIVA!");
        }
    }
}
