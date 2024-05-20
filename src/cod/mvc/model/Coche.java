package cod.mvc.model;

public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public String getModelo() {
        return modelo;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }
}
