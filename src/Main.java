import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    private static Set<CuerpoCeleste> planetas= new HashSet<>();
    private static Set<CuerpoCeleste> lunas=new HashSet<>();


    public static void main(String[] args) {

        Main main= new Main();

        CuerpoCeleste mercurio= new CuerpoCeleste("Mercurio", 88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(mercurio);
        sistemaSolar.put(mercurio.getNombre(), mercurio);

        CuerpoCeleste venus= new CuerpoCeleste("Venus", 255,  CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(venus);
        sistemaSolar.put(venus.getNombre(), venus);

        CuerpoCeleste tierra= new CuerpoCeleste("La Tierra", 365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(tierra);
        sistemaSolar.put(tierra.getNombre(), tierra);

        CuerpoCeleste marte = new CuerpoCeleste("Marte", 687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(marte);
        sistemaSolar.put(marte.getNombre(), marte);

        CuerpoCeleste jupiter= new CuerpoCeleste("Jupiter", 4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(jupiter);
        sistemaSolar.put(jupiter.getNombre(), jupiter);

        CuerpoCeleste saturno= new CuerpoCeleste("Saturno", 10759, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(saturno);
        sistemaSolar.put(saturno.getNombre(), saturno);

        CuerpoCeleste urano= new CuerpoCeleste("Urano", 30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(urano);
        sistemaSolar.put(urano.getNombre(), urano);

        CuerpoCeleste neptuno= new CuerpoCeleste("Neptuno", 165, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(neptuno);
        sistemaSolar.put(neptuno.getNombre(), neptuno);

        CuerpoCeleste pluton= new CuerpoCeleste("Pluton", 248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(pluton);
        sistemaSolar.put(pluton.getNombre(), pluton);


        CuerpoCeleste luna= new CuerpoCeleste("Luna", 27, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(luna.getNombre(), luna);
        tierra.addSatelite(luna);

        CuerpoCeleste deimos= new CuerpoCeleste("Deimos", 1.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(deimos.getNombre(), deimos);
        marte.addSatelite(deimos);

        CuerpoCeleste phobos= new CuerpoCeleste("Phobos", 0.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(phobos.getNombre(), phobos);
        marte.addSatelite(phobos);





        CuerpoCeleste lo= new CuerpoCeleste("Lo", 1.8, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(lo.getNombre(), lo);
        jupiter.addSatelite(lo);


        CuerpoCeleste europa= new CuerpoCeleste("Europa", 3.5, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(europa.getNombre(), europa);
        jupiter.addSatelite(europa);

        CuerpoCeleste ganymede= new CuerpoCeleste("Ganymede", 7.1, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(ganymede.getNombre(), ganymede);
        jupiter.addSatelite(ganymede);

        CuerpoCeleste callisto= new CuerpoCeleste("Callisto", 16.7, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(callisto.getNombre(), callisto);
        jupiter.addSatelite(callisto);



        //VI- PRINT TODOS LOS PLANETAS

        System.out.println("VI. PRINT PLANETAS ");
        System.out.println("---------------------");

        for (CuerpoCeleste planetas: planetas) {
            System.out.println(planetas.toString());
        }



        System.out.println("");

        //VII. MAPA DE MARTE Y SUS LUNAS
        CuerpoCeleste mars = sistemaSolar.get("Marte");

        if (mars!=null && !mars.getSatelites().isEmpty()){
            System.out.println("VII. Lunas de Marte");
            System.out.println("--------------------------");
            for (CuerpoCeleste moon: mars.getSatelites()){
                System.out.println(moon.getNombre());

            }
        } else {
            System.out.println("Marte no tiene lunas");
        }


        //VIII. PRINT DE TODAS LAS LUNAS
        for (CuerpoCeleste moon: main.planetas){
            lunas.addAll(moon.getSatelites()); // Agregamos las lunas al SetLunas (Obtenemos las lunas con getSatelites)
        }
        System.out.println();
        System.out.println("VIII. Unión de las Lunas - IX. Print Lunas ");
        System.out.println("---------------------");
        for (CuerpoCeleste moon: lunas){
            System.out.println(moon.getNombre() + " " + moon.getTipoCuerpo() + " " + moon.getPeriodoOrbital());

        }


       /* //PRINT DE TODOS LOS CUERPOS CELESTES DEL SISTEMA SOLAR
        System.out.println();
        System.out.println("MAPA SISTEMA SOLAR");
        System.out.println("---------------------");
        for (Map.Entry<String, CuerpoCeleste> map: main.sistemaSolar.entrySet()){
            System.out.println(map);
        }

        System.out.println();
*/

        //X. Pluton-884 (No sale en la lista de planeta el nuevo pluton añadido
        /*CuerpoCeleste pluton2=  new CuerpoCeleste("Pluton", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA );
        planetas.add(pluton2);


        System.out.println("VI. PRINT PLANETAS SIN EL NUEVO PLUTON - NO SE PERMITEN DUPLICADOS ");
        System.out.println("---------------------");

        for (CuerpoCeleste planetas: planetas) {
            System.out.println(planetas.toString());
        }
        */


        System.out.println();

        //XI - XII - Pluton como planeta enano? Tampoco, habria que crear otro hashset de planetaenanos

        Set<CuerpoCeleste> planetasEnano=new HashSet<>();
        CuerpoCeleste plutonEnano=  new CuerpoCeleste("Pluton", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO );
        planetasEnano.add(plutonEnano);
        planetas.add(plutonEnano); 


        System.out.println("VI. PRINT PLANETAS PLUTON ENANO ");
        System.out.println("---------------------");

        for (CuerpoCeleste planetas: planetasEnano) {
            System.out.println(planetas.toString());
        }

        //Diferencia entre planetas y planetasEnanos

        Set<CuerpoCeleste> dif = new HashSet<>(planetas);
        dif.removeAll(planetasEnano);


        //Interseccion entre planetas y planetasEnanos

        Set<CuerpoCeleste> inter = new HashSet<>(planetas);
        inter.retainAll(planetasEnano);


        System.out.println();
        System.out.println("Diferencia entre Planetas y Planetas Enanos");
        System.out.println("Los cuerpos celestes considerados como Planetas");
        System.out.println("-------------------------------------------");
        for (CuerpoCeleste cp: dif){
            System.out.println(cp.getNombre());
        }

        System.out.println();
        System.out.println("Interseccion entre Planetas y Planetas Enanos");
        System.out.println("Cuerpos celestes considerados como Planetas Enanos (Y a la vez planetas");
        System.out.println("-------------------------------------------");
        for (CuerpoCeleste cp: inter){
            System.out.println(cp.getNombre());
        }




















    }







    }





