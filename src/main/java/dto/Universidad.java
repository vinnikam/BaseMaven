package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Universidad {
    private String nombre;
    private String identificacion;
    private List<Docente> docentes;

    public Universidad(){
            this.docentes = new ArrayList<>();
    }


}
