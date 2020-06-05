using PadraoState.Entitades;

namespace PadraoState
{
    class Program
    {
        static void Main(string[] args)
        {
            Mario mario = new Mario();
            mario.PegarCogumelo();
            mario.PegarPena();
            mario.LevarDano();
            mario.PegarFlor();
            mario.PegarFlor();
            mario.LevarDano();
            mario.LevarDano();
            mario.PegarPena();
            mario.LevarDano();
            mario.LevarDano();
            mario.LevarDano();
        }
    }
}
