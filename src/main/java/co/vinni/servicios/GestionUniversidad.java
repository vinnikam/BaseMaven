package co.vinni.servicios;

import co.vinni.dto.Docente;
import co.vinni.dto.Universidad;
import lombok.Getter;
import lombok.Setter;

@Getter
public class GestionUniversidad {

    private Universidad laUniversidad;

    public void crear(Universidad universidad){
        if (this.laUniversidad == null)
            this.laUniversidad = new Universidad();
        this.laUniversidad = universidad;
    }
    public void adicionarDocente (Docente docente){
        this.laUniversidad.getDocentes().add(docente);
    }

}
