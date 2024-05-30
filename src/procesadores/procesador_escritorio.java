package procesadores;

public class procesador_escritorio extends procesador{
    String socket;
    public procesador_escritorio() {

    }
    public procesador_escritorio(String socket) {
        this.socket = socket;
    }

    public procesador_escritorio(int nucleos, Double consumo, Double velocidad, String nombre, String socket) {
        super(nucleos, consumo, velocidad, nombre);
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
    //imprimir datos
    public void imprimir_datos_escritorio(){
        System.out.println(socket);
    }
}
