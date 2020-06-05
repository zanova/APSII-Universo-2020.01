using PadraoState.Interfaces;

namespace PadraoState.Entitades
{
    class Mario
    {
        protected MarioState Estado;

        public Mario()
        {
            Estado = new MarioPequeno();
        }

        public void PegarCogumelo()
        {
            Estado = Estado.PegarCogumelo();
        }

        public void PegarFlor()
        {
            Estado = Estado.PegarFlor();
        }

        public void PegarPena()
        {
            Estado = Estado.PegarPena();
        }

        public void LevarDano()
        {
            Estado = Estado.LevarDano();
        }
    }
}
