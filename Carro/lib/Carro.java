// Definindo a classe Carro
public class Carro {
    String cor;
    String modelo;
    int ano;
    boolean ignicaoLigada = false;

    // Criando método para acelerar o carro
    void acelerar() {
        if (ignicaoLigada) {
            System.out.println(divisor);
            System.out.println("O carro está acelerando!");
            System.out.println(divisor);
        } else {
            System.out.println(divisor);
            System.out.println("O carro está desligado. Ligue a ignição primeiro.");
            System.out.println(divisor);
        }
        
    }
    String divisor = "*********************************";
    // Criando método para ligar a ignição
    void ligarIgnicao() {
        if (ignicaoLigada==true){
            System.out.println(divisor);
            System.out.println("O carro já está ligado!");
            System.out.println(divisor);
        } else{
        ignicaoLigada = true;
        System.out.println(divisor);
        System.out.println("O carro foi ligado!");
        System.out.println(divisor);
    }
    }

    // Criando método para desligar a ignição
    void desligarIgnicao() {
        if (ignicaoLigada==false) {
            System.out.println(divisor);
            System.out.println("O carro já está desligado.");
            System.out.println(divisor);
        } else {
            ignicaoLigada = false;
            System.out.println(divisor);
            System.out.println("O carro foi desligado.");
            System.out.println(divisor);
        }
    }
}
