using System;

namespace Strategy
{
    class Program
    {
        static void Main(string[] args)
        {
            int opc = 1;
            char resp = 's';
            Preco calcular;
            do
            {
                Console.Write("Informe o preço: ");
                double preco = double.Parse(Console.ReadLine());
                Console.WriteLine("Informe a forma de pagamento: ");
                Console.WriteLine("1 - Público");
                Console.WriteLine("2 - Credito");
                Console.WriteLine("3 - Vip");
                opc = int.Parse(Console.ReadLine());
                switch (opc)
                {
                    case 1:
                        calcular = new PrecoPublico();
                        Console.WriteLine($"Preço do ingresso: {calcular.calcularPreco(preco)}");
                        break;
                    case 2:
                        calcular = new PrecoCredito();
                        Console.WriteLine($"Preço do ingresso: {calcular.calcularPreco(preco)}");
                        break;
                    case 3:
                        calcular = new PrecoVip();
                        Console.WriteLine($"Preço do ingresso: {calcular.calcularPreco(preco)}");
                        break;
                    default:
                        Console.WriteLine("Opção invalida!");
                        break;
                }
                Console.Write("Deseja continuar [s/n]: ");
                resp = char.Parse(Console.ReadLine().ToLower());
            } while (resp == 's');
            Console.ReadLine();
        }
    }
}