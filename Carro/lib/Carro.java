// Definindo a classe Carro
public class Carro {
    String cor;
    String modelo;
    int ano;
    boolean ignicaoLigada = false;

    // Criando método para acelerar o carro
    void acelerar() {
        if (ignicaoLigada) {
            System.out.println("O carro está acelerando!");
        } else {
            System.out.println("O carro está desligado. Ligue a ignição primeiro.");
        }
        
    }

    // Criando método para ligar a ignição
    void ligarIgnicao() {
        ignicaoLigada = true;
        System.out.println("O carro foi ligado!");
    }

    // Criando método para desligar a ignição
    void desligarIgnicao() {
        if (ignicaoLigada) {
        ignicaoLigada = false;
        System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
}
