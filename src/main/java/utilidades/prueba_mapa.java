package utilidades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class prueba_mapa {

    //CREAR MAPAS
    public static void main(String[] args) {
        Map<String, Integer> puntuacionesDulce = new HashMap<>();

        //INSERTAR VALORES EN UN MAPA
        puntuacionesDulce.put("Donuts", 6);
        puntuacionesDulce.put("Palmera", 8);
        puntuacionesDulce.put("Napolitana", 9);
        puntuacionesDulce.put("Gofre", 10);

        //ORDENAR ALFABETICAMENTE ELEMENTOS DE UN MAPA
        System.out.println(puntuacionesDulce.keySet().stream().sorted().collect(Collectors.toList()));

        //MODIFICAR ELEMENTOS MAPA
        puntuacionesDulce.replace("Donuts", 7);

        //ELIMINAR ELEMENTOS MAPA
        puntuacionesDulce.remove("Gofre");

        //TAMAÑO DE UN MAPA
        System.out.println(puntuacionesDulce.size());

        //OBTENER VALOR PARA UNA CLAVE
        Integer puntuacionDonut = puntuacionesDulce.get("Donuts");

        //SABER SI UN MAPA CONTIENE UN ELEMENTO
        System.out.println(puntuacionesDulce.containsKey("Donuts"));
        System.out.println(puntuacionesDulce.containsValue(16));


        List<String> sabores = List.of("Chocolate", "Huevo", "KitKat");
        for(String sabor : sabores){
            System.out.println(sabor);
        }


        System.out.println(puntuacionesDulce);

    }
}
