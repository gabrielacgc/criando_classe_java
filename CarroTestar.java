public class CarroTestar {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro(); 
        c1.nome = "Clio"; 
        c1.marca = "Renault"; 
        c1.ano = 2018;


        c1.acelerar(50);
        System.out.println("Velocidade: " + c1.vel + "KM/h");

        c1.frear(30);
        System.out.println("Velocidade Reduzida" + c1.vel + "km/h");
    }

}
