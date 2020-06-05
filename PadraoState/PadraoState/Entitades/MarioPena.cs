using PadraoState.Interfaces;
using System;

namespace PadraoState.Entitades
{
    class MarioPena : MarioState
    {
        public MarioPena()
        {
            Console.WriteLine("Mario Pena");
        }

        public MarioState LevarDano()
        {
            return new MarioGrande();
        }

        public MarioState PegarCogumelo()
        {
            Console.Write("Pontos +1000 - ");
            return new MarioPena();
        }

        public MarioState PegarFlor()
        {
            return new MarioFogo();
        }

        public MarioState PegarPena()
        {
            Console.Write("Pontos +1000 - ");
            return new MarioPena();
        }
    }
}
