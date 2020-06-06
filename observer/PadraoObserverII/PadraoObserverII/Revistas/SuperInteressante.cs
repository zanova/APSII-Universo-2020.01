using PadraoObserverII.Interface;
using System;

namespace PadraoObserverII.Revistas
{
    class SuperInteressante : IObservar
    {
        public void Atualizar(Agencia entrada)
        {
            Console.WriteLine(entrada.Nome + ": Notícias da Revista Super Interessante!");
        }
    }
}
