package servicios;

import dto.Docente;
import dto.Universidad;

import java.util.ArrayList;

public class GestionUniversidad {

    private Universidad launiversidad;

    public void crear(Universidad universidad){
        if(this.launiversidad == null)
            this.launiversidad = new Universidad();
        this.launiversidad = universidad;

    }
    public void adicionarDocente(Docente docente){
       this.launiversidad.getDocentes().add(docente);
    }
}
