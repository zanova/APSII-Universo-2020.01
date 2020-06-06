using PadraoObserverII.Canais;
using PadraoObserverII.Revistas;
using PadraoObserverII.Agencias;
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

            VaiQueDa VaiQueDa = new VaiQueDa();
            VaiQueDa.AdicionarObservados(Galileu);
            VaiQueDa.AdicionarObservados(QuatroRodas);
            VaiQueDa.AdicionarObservados(SuperInteressante);
            VaiQueDa.AdicionarObservados(Veja);
            VaiQueDa.AdicionarObservados(VoceSabia);

            Universo Universo = new Universo();
            Universo.AdicionarObservados(Globo);
            Universo.AdicionarObservados(GloboSat);
            Universo.AdicionarObservados(Viva);

            Gov Gov = new Gov();
            Gov.AdicionarObservados(Globo);
            Gov.AdicionarObservados(GloboSat);
            Gov.AdicionarObservados(Viva);
            Gov.AdicionarObservados(Galileu);
            Gov.AdicionarObservados(QuatroRodas);
            Gov.AdicionarObservados(SuperInteressante);
            Gov.AdicionarObservados(Veja);
            Gov.AdicionarObservados(VoceSabia);

            Sistemas Sistema = new Sistemas();
            Sistema.AdicionarObservados(Globo);
            Sistema.AdicionarObservados(Veja);

            Console.WriteLine("Canais assistidos e revistas assinadas");
            Console.WriteLine();

            VaiQueDa.SalvarEstado();
            Console.WriteLine();

            Universo.SalvarEstado();
            Console.WriteLine();

            Gov.SalvarEstado();
            Console.WriteLine();

            Sistema.SalvarEstado();
            Console.WriteLine();

        }
    }
}
