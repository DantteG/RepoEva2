package crud_prueba_alumnos.crudalumnos.Alumnos.Profesores;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Profesores {

    @Entity
    @Table (name = "Profesores")

    public class profesores{

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long Id;

        private String nombre;
        private String apellido;
        private String asignatura;



        public profesores(Long id, String nombre, String apellido, String asignatura, boolean jefatura) {
            this.Id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.asignatura = asignatura;
        }

        public Long getId() {
            return Id;
        }

        public void setId(Long id) {
            this.Id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getAsignatura() {
            return asignatura;
        }

        public void setAsignatura(String asignatura) {
            this.asignatura = asignatura;
        }



    }


    
}
