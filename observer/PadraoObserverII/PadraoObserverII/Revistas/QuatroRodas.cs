using PadraoObserverII.Interface;
using System;

namespace PadraoObserverII.Revistas
{
    class QuatroRodas : IObserverRevista
    {
        public void Atualizar(Agencia entrada)
        {
            Console.WriteLine(entrada.Nome + ": Notícias da Revista Quatro Rodas!");
        }
    }
}
