namespace Strategy
{
    class PrecoVip : Preco
    {
        public double calcularPreco(double valor)
        {
            return valor * 0.8;
        }
    }
}
