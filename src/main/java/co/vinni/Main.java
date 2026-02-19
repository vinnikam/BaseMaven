package co.vinni;

import co.vinni.dto.Docente;
import co.vinni.dto.Universidad;
import co.vinni.servicios.GestionUniversidad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad();
        uni.setNombre("Unilibre");
        uni.setDireccion("El bosque");

        Docente docente = new Docente();
        docente.setNombre("Vinni");

        GestionUniversidad gestionUniversidad = new GestionUniversidad();

        gestionUniversidad.crear(uni);
        gestionUniversidad.adicionarDocente(docente);

        System.out.println(gestionUniversidad.getLaUniversidad().getNombre());
        System.out.println(gestionUniversidad.getLaUniversidad().getDireccion());
        for (Docente docente1 : gestionUniversidad.getLaUniversidad().getDocentes())
        {
            System.out.println("Docente : "+docente1.getNombre());

        }


    }
}
