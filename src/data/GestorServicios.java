package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    public void mostrarServiciosDePrueba() {

        RutaGastronomica ruta1 = new RutaGastronomica(
                "Sabores de Puerto Varas", 4, 5);

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta Gastronómica de Frutillar", 3, 4);

        PaseoLacustre paseo1 = new PaseoLacustre(
                "Navegación por el Lago Llanquihue", 2, "Catamarán");

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Paseo Lacustre hacia Ensenada", 3, "Lancha turística");

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Historia y Patrimonio de Puerto Varas", 2, "Iglesia Sagrado Corazón de Jesús");

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Recorrido Cultural por Frutillar", 3, "Teatro del Lago");

        System.out.println("======================================");
        System.out.println(" Servicios turísticos Llanquihue Tour ");
        System.out.println("======================================");
        System.out.println();

        System.out.println(ruta1.toString());
        System.out.println(ruta2.toString());
        System.out.println();

        System.out.println(paseo1.toString());
        System.out.println(paseo2.toString());
        System.out.println();

        System.out.println(excursion1.toString());
        System.out.println(excursion2.toString());
    }
}
