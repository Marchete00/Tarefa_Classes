import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
            // Instanciando o carro
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Digite o modelo do seu carro:");
            String respostamodelo = scanner.nextLine();

            System.out.println("Digite a cor do seu carro:");
            String respostacor = scanner.nextLine();

            System.out.println("Digite o ano do seu carro:");
            int respostaano = scanner.nextInt();

            Carro meuCarro = new Carro();
            meuCarro.cor = respostacor;
            meuCarro.modelo = respostamodelo;
            meuCarro.ano = respostaano;

            String divisor = "*********************************";
            System.out.println(divisor);
            System.out.println("Seu carro é um " + meuCarro.modelo + " Na cor " + meuCarro.cor + " do ano de "+ meuCarro.ano);
            System.out.println(divisor);

            int respostapg1=0;

            while (respostapg1!=4) {
                System.out.println("O que gostaria de fazer? \n1. Ligar o Carro\n2. Acelerar o Carro\n3.Desligar o Carro\n4.Finalizar Simulação");
                respostapg1 = scanner.nextInt();
                if (respostapg1 == 1) { // Agora está correto
                    meuCarro.ligarIgnicao();
                } else if (respostapg1 == 2) {
                    meuCarro.acelerar();
                } else if (respostapg1 == 3) {
                    meuCarro.desligarIgnicao();
                } else if (respostapg1 == 4) {
                    System.out.println(divisor);
                    System.out.println("Simulação finalizada!");
                    System.out.println(divisor);
                } else {
                    System.out.println("Opção inválida.");
                }
            }


            scanner.close();
        }
}
