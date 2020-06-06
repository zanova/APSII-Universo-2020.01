using PadraoObserverII.Canais;
using PadraoObserverII.Revistas;
using System;

namespace PadraoObserverII
{
    class Program
    {
        static void Main(string[] args)
        {
            Globo Globo = new Globo();
            GloboSat GloboSat = new GloboSat();
            Viva Viva = new Viva();

            Galileu Galileu = new Galileu();
            QuatroRodas QuatroRodas = new QuatroRodas();
            SuperInteressante SuperInteressante = new SuperInteressante();
            Veja Veja = new Veja();
            VoceSabia VoceSabia = new VoceSabia();

            Agencia.AdicionarObservadorCanal(Globo);
            Agencia.AdicionarObservadorCanal(GloboSat);
            Agencia.AdicionarObservadorCanal(Viva);
            Agencia.AdicionarObservadorRevista(Galileu);
            Agencia.AdicionarObservadorRevista(QuatroRodas);
            Agencia.AdicionarObservadorRevista(SuperInteressante);
            Agencia.AdicionarObservadorRevista(Veja);
            Agencia.AdicionarObservadorRevista(VoceSabia);

            Console.WriteLine("Canais assistidos e revistas assinadas");
            Console.WriteLine();

            Agencia VaiQueDa = new Agencia("Vai Que Da");
            VaiQueDa.SalvarEstadoRevista();
            Console.WriteLine();

            Agencia Universo = new Agencia("Universo");
            Universo.SalvarEstadoCanal();
            Console.WriteLine();

            Agencia GOV = new Agencia("GOV");
            GOV.SalvarEstadoCanal();
            GOV.SalvarEstadoRevista();
            Console.WriteLine();

            Agencia Sistemas = new Agencia("Sistemas");
            Agencia.RemoverRevista(Galileu);
            Agencia.RemoverRevista(QuatroRodas);
            Agencia.RemoverRevista(SuperInteressante);
            Agencia.RemoverRevista(VoceSabia);

            Sistemas.SalvarEstadoRevista();

            Agencia.RemoverCanal(GloboSat);
            Agencia.RemoverCanal(Viva);

            Sistemas.SalvarEstadoCanal();
        }
    }
}
