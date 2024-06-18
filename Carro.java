// criar a classe carro 

public class Carro {
    String nome; 
    String marca;
    int ano; 
    int vel;  

    // criar os MÉTODOS da classe CARRO --> Quais são as ações que a classe pode realizar 

    void acelerar(int aceleracao) {
        vel+=aceleracao;
    }

    void frear(int reduzir) {
        vel -=reduzir;
    }

    void buzinar() {
        System.out.println("Bibibibi");
     }
    



} // fim da classe CARRO 