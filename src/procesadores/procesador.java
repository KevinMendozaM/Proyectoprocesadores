package procesadores;

public class procesador {
    int nucleos;
    Double consumo, velocidad;
    String nombre;

    public procesador() {

    }

    public procesador(int nucleos, Double consumo, Double velocidad, String nombre) {
        this.nucleos = nucleos;
        this.consumo = consumo;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }
    //setters y getters

    public int getNucleos() {
        return nucleos;
    }

    public Double getConsumo() {
        return consumo;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos personalizados

    public void imprimir_datos() {
        System.out.println("Nucleos: " + nucleos);
        System.out.println("Consumo: " + consumo);
        System.out.println("VeLocidad: " + velocidad);
        System.out.println("Nombre: " + nombre);
    }
}