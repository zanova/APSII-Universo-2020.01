namespace Strategy
{
    class PrecoCredito : Preco
    {
        public double calcularPreco(double valor)
        {
            return valor * 1.2;
        }
    }
}
