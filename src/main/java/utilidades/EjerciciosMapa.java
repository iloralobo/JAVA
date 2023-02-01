package utilidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjerciciosMapa {

    public static void main(String[] args) {


        //EJERCICIO 1

        Map<String , Integer> seleccionesMundial = new HashMap<>();
        seleccionesMundial.put("Brasil", 5);
        seleccionesMundial.put("Alemania", 4);
        seleccionesMundial.put("Italia", 4);
        seleccionesMundial.put("Argentina", 3);
        seleccionesMundial.put("Francia", 2);
        seleccionesMundial.put("Uruguay", 2);
        seleccionesMundial.put("Inglaterra", 1);
        seleccionesMundial.put("España", 1);
        System.out.println(seleccionesMundial);

        //EJERCICIO 2

        Map<String, List<String>> seleccionesJug = new HashMap<>();
        seleccionesJug.put("Brasil", List.of("Alisson","Militao","Casemiro","Vinicius","Neymar"));
        seleccionesJug.put("Alemania", List.of("Ter Stegen","Kimmich","Sané","Gnabry","Muller"));
        seleccionesJug.put("Italia", List.of("Donnarumma","Chiellini","Mancini","Insigne","Inmobile"));
        seleccionesJug.put("Argentina", List.of("Rulli","Acuña","Di Maria","Messi","Papu"));
        seleccionesJug.put("Francia", List.of("Areola","Kounde","Camavinga","Griezmann","Mbapé"));
        seleccionesJug.put("Uruguay", List.of("Muslera","Cáceres","Valverde","Cavani","Luis Suárez"));
        seleccionesJug.put("Inglaterra", List.of("Ramsdale","Maguire","Rice","Sterling","Kane"));
        seleccionesJug.put("España", List.of("Unai Simón","Laporte","Asencio","Sarabia","Morata"));
        System.out.println(seleccionesJug);

        //EJERCICIO 3

        Integer numMundiales = 0;
        for (Integer Mundiales : seleccionesMundial.values()){
            numMundiales += Mundiales;
        }
        System.out.println(numMundiales);

        //EJERCICIO 4

        Map<String , Integer> seleccionesTamanyo = new HashMap<>();
        for(String seleccion : seleccionesJug.keySet()){
            seleccionesTamanyo.put(seleccion,seleccionesJug.get(seleccion).size());
        }
        System.out.println(seleccionesTamanyo);

        //EJERCICIO 5

        Map<String, List<String>> jugadoresBrasil = new HashMap<>();
        jugadoresBrasil.put("PT", List.of("Alisson"));
        jugadoresBrasil.put("DF", List.of("Militao"));
        jugadoresBrasil.put("MC", List.of("Casemiro"));
        jugadoresBrasil.put("DL", List.of("Vinicius","Neymar"));
        Map<String, List<String>> jugadoresAlemania = new HashMap<>();
        jugadoresAlemania.put("PT", List.of("Ter Stegen"));
        jugadoresAlemania.put("DF", List.of("Kimmich"));
        jugadoresAlemania.put("MC", List.of("Sané"));
        jugadoresAlemania.put("DL", List.of("Gnabry","Muller"));
        Map<String, List<String>> jugadoresItalia = new HashMap<>();
        jugadoresItalia.put("PT", List.of("Donnarumma"));
        jugadoresItalia.put("DF", List.of("Chiellini"));
        jugadoresItalia.put("MC", List.of("Mancini"));
        jugadoresItalia.put("DL", List.of("Insigne","Inmobile"));
        Map<String, List<String>> jugadoresArgentina = new HashMap<>();
        jugadoresArgentina.put("PT", List.of("Rulli"));
        jugadoresArgentina.put("DF", List.of("Acuña"));
        jugadoresArgentina.put("MC", List.of("Papu"));
        jugadoresArgentina.put("DL", List.of("Di Maria","Messi"));
        Map<String, List<String>> jugadoresFrancia = new HashMap<>();
        jugadoresFrancia.put("PT", List.of("Areola"));
        jugadoresFrancia.put("DF", List.of("Kounde"));
        jugadoresFrancia.put("MC", List.of("Camavinga"));
        jugadoresFrancia.put("DL", List.of("Griezmann","Mbapé"));
        Map<String, List<String>> jugadoresUruguay = new HashMap<>();
        jugadoresUruguay.put("PT", List.of("Muslera"));
        jugadoresUruguay.put("DF", List.of("Cáceres"));
        jugadoresUruguay.put("MC", List.of("Valverde"));
        jugadoresUruguay.put("DL", List.of("Cavani","Luis Suárez"));
        Map<String, List<String>> jugadoresInglaterra = new HashMap<>();
        jugadoresInglaterra.put("PT", List.of("Ramsdale"));
        jugadoresInglaterra.put("DF", List.of("Maguire"));
        jugadoresInglaterra.put("MC", List.of("Rice"));
        jugadoresInglaterra.put("DL", List.of("Sterling","Kane"));
        Map<String, List<String>> jugadoresEspaya = new HashMap<>();
        jugadoresEspaya.put("PT", List.of("Unai Simón"));
        jugadoresEspaya.put("DF", List.of("Laporte"));
        jugadoresEspaya.put("MC", List.of("Asencio"));
        jugadoresEspaya.put("DL", List.of("Sarabia","Morata"));

        Map<String, Map<String, List<String>>> seleccionesJugPosicion = new HashMap<>();

        seleccionesJugPosicion.put("Brasil", jugadoresBrasil);
        seleccionesJugPosicion.put("Alemania", jugadoresAlemania);
        seleccionesJugPosicion.put("Italia", jugadoresItalia);
        seleccionesJugPosicion.put("Argentina", jugadoresArgentina);
        seleccionesJugPosicion.put("Francia", jugadoresFrancia);
        seleccionesJugPosicion.put("Uruguay", jugadoresUruguay);
        seleccionesJugPosicion.put("Inglaterra", jugadoresInglaterra);
        seleccionesJugPosicion.put("España", jugadoresEspaya);

        System.out.println(seleccionesJugPosicion);

        //EJERCICIO 6


        Map<String , List<String>> seleccionesNumJug = new HashMap<>();

        for(Map seleccion : seleccionesJugPosicion.values()){
            seleccionesNumJug.put(seleccion, seleccionesJug.get(seleccion).size() );
        }








    }


}
