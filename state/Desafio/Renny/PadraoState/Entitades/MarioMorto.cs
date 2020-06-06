using PadraoState.Interfaces;
using System;

namespace PadraoState.Entitades
{
    class MarioMorto : MarioState
    {
        public MarioMorto()
        {
            Console.WriteLine("Mario Morto");
        }

        public MarioState LevarDano()
        {
            return new MarioMorto();
        }

        public MarioState PegarCogumelo()
        {
            return new MarioMorto();
        }

        public MarioState PegarFlor()
        {
            return new MarioMorto();
        }

        public MarioState PegarPena()
        {
            return new MarioMorto();
        }
    }
}
