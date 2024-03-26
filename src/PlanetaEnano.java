public class PlanetaEnano extends CuerpoCeleste {
    private String nombre;
    private double periodoOrbital;

    public PlanetaEnano(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.PLANETA_ENANO);
    }
}
