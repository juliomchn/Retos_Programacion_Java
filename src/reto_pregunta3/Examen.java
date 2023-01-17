package reto_pregunta3;

public class Examen {

    private String nombreApellidosAlumno;

    private float nota;

    public Examen() {
    }

    public Examen(String nombreApellidosAlumno, float nota) {
        this.nombreApellidosAlumno = nombreApellidosAlumno;
        this.nota = nota;
    }

    public String getNombreApellidosAlumno() {
        return nombreApellidosAlumno;
    }

    public void setNombreApellidosAlumno(String nombreApellidosAlumno) {
        this.nombreApellidosAlumno = nombreApellidosAlumno;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String mostrarDatos(){

        return "Examen [nombreApellidosAlumno: " + nombreApellidosAlumno + ", nota: " + nota + "]";
    }

}
