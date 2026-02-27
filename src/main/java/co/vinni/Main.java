package co.vinni;

import co.vinni.dto.Docente;
import co.vinni.dto.Universidad;
import co.vinni.servicios.GestionUniversidad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universidad univer = new Universidad();
        univer.setNombre("Universidad Libre");
        univer.setDireccion("Sede el bosque");

        Docente doc1 = new Docente();
        doc1.setNombre("Kevin");

        GestionUniversidad gestion1 = new GestionUniversidad(Universidad);

        gestion1.crear(univer);
        gestion1.adicionarDocente(doc1);

        System.out.println(gestion1);


    }
}
