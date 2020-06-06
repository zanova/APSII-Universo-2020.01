using PadraoObserverII.Interface;
using System;

namespace PadraoObserverII.Revistas
{
    class Galileu : IObservar
    {
        public void Atualizar(Agencia entrada)
        {
            Console.WriteLine(entrada.Nome + ": Notícias da Revista Galileu!");
        }
    }
}
