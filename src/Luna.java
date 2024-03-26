public class Luna extends CuerpoCeleste {
    private String nombre;
    private double periodoOrbital;

    public Luna(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.LUNA);
    }
}