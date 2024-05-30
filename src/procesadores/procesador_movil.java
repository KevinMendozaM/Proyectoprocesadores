package procesadores;

public class procesador_movil extends procesador{
    boolean optimizaion_energia;
    public procesador_movil() {

    }

    public procesador_movil(boolean optimizaion_energia) {
        this.optimizaion_energia = optimizaion_energia;
    }

    public procesador_movil(int nucleos, Double consumo, Double velocidad, String nombre, boolean optimizaion_energia) {
        super(nucleos, consumo, velocidad, nombre);
        this.optimizaion_energia = optimizaion_energia;
    }

    public boolean isOptimizaion_energia() {
        return optimizaion_energia;
    }

    public void setOptimizaion_energia(boolean optimizaion_energia) {
        this.optimizaion_energia = optimizaion_energia;
    }
    //imprimir_datos
    public void imprimir_datos_moviles(){
        System.out.println(optimizaion_energia);
    }
}
