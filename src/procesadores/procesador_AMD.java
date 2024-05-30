package procesadores;

public class procesador_AMD extends procesador{

    String sensor_temperatura;
    public procesador_AMD() {

    }
    public procesador_AMD(String sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }

    public String getSensor_temperatura() {
        return sensor_temperatura;
    }

    public void setSensor_temperatura(String sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }
    //imprimir datos
    public void imprimir_datos_escritorio(){
        System.out.println("sensor de temperatura: " + sensor_temperatura);
    }
}