import dados.Celular;

public class App {

    public static void main(String[] args) {
        Celular celular1 = new Celular();
            celular1.marca = "Sansumg";
            celular1.modelo = "A34";

        Celular celular2 = new Celular();
            celular2.marca = "Iphone";
            celular2.modelo = "XS";

            celular1.ligar();
            celular1.desligar();

            celular1.usar(96);





    }
}
