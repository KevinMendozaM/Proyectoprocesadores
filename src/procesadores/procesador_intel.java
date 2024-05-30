package procesadores;

public class procesador_intel extends procesador{

    String tarjeta_video;
    public procesador_intel() {

    }
    public procesador_intel(String tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }

    public String getTarjeta_video() {
        return tarjeta_video;
    }

    public void setTarjeta_video(String tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }
    //imprimir datos
    public void imprimir_datos_escritorio(){
        System.out.println(tarjeta_video);
    }
}
