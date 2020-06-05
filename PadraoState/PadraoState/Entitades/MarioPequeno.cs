using PadraoState.Interfaces;

namespace PadraoState.Entitades
{
    class MarioPequeno : MarioState
    {
        public MarioPequeno()
        {
            System.Console.WriteLine("Mario Pequeno");
        }        
        public MarioState PegarCogumelo()
        {
            return new MarioGrande();
        }

        public MarioState LevarDano()
        {
            return new MarioMorto();
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
