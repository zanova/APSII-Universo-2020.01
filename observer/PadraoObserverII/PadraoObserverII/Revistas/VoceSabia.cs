using PadraoObserverII.Interface;
using System;

namespace PadraoObserverII.Revistas
{
    class VoceSabia : IObservar
    {
        public void Atualizar(Agencia entrada)
        {
            Console.WriteLine(entrada.Nome + ": Notícias da Revista Você Sabia!");
        }
    }
}
