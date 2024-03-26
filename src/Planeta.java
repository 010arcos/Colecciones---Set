public class Planeta extends CuerpoCeleste {
    private String nombrePlaneta;
    private double periodoOrbital;


    public Planeta(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.PLANETA);

    }

    public boolean addSatelite(CuerpoCeleste luna) {
        if (luna.getTipoCuerpo()== TipoCuerpoCeleste.LUNA) {
            super.addSatelite(luna); // llamo al metodo de añadir satelite de la clase padre
            return true; // se añadio con exito
        } else {
            return false; // no se añadio
        }
    }


}


