package co.vinni.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Universidad {
    private String nombre;
    private String direccion;
    private List<Docente> docentes;

    public Universidad(){
        this.docentes = new ArrayList<>();
    }
}
