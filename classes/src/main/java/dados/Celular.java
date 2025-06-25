package dados;

public class Celular {

    public String marca;
    public String modelo;
    public int bateria = 100;


    public void ligar(){
        System.out.println("Iniciando o Dispositivo " + modelo);
    }

    public void desligar(){
        System.out.println("Desligando o Dispositivo! "+modelo);
    }

    public void usar(int consumo){
        if(bateria - consumo >= 5){
            bateria -= consumo;
            System.out.println("O dispositivo tem bateria suficiente!");
        }else{
            System.out.println("O dispositivo precisa ser carregado");
        }

    }
}

