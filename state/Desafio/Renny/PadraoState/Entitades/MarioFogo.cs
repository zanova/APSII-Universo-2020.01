using PadraoState.Interfaces;

namespace PadraoState.Entitades
{
    class MarioFogo : MarioState
    {
        public MarioFogo()
        {
            System.Console.WriteLine("Mario Fogo");
        }

        public MarioState LevarDano()
        {
            return new MarioGrande();
        }

        public MarioState PegarCogumelo()
        {
            System.Console.Write("Pontos +1000 - ");
            return new MarioFogo();
        }

        public MarioState PegarFlor()
        {
            System.Console.Write("Pontos +1000 - ");
            return new MarioFogo();
        }

        public MarioState PegarPena()
        {
            return new MarioFogo();
        }
    }
}
