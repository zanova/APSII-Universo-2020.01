using PadraoObserverII.Interface;
using System;

namespace PadraoObserverII.Revistas
{
    class Veja : IObserverRevista
    {
        public void Atualizar(Agencia entrada)
        {
            Console.WriteLine(entrada.Nome + ": Notícias da Revista Veja!");
        }
    }
}
