using PadraoState.Interfaces;
using System;

namespace PadraoState.Entitades
{
    class MarioGrande : MarioState
    {
        public MarioGrande()
        {
            Console.WriteLine("Mario Grande");
        }

        public MarioState LevarDano()
        {
            return new MarioPequeno();
        }

        public MarioState PegarCogumelo()
        {
            Console.Write("Pontos +1000 - ");
            return new MarioGrande();
        }

        public MarioState PegarFlor()
        {
            return new MarioFogo();
        }

        public MarioState PegarPena()
        {
            return new MarioPena();
        }
    }
}
