public class Persona {
    private int dni;
    private int edad;
    private int sexo;

    public Persona(int dni, int edad, int sexo) {
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }


    public int getSexo() {
        return sexo;
    }
    @Override
    public String toString() { //para que me imprima mejor el mensaje cuando llame a Persona
        String sexoStr = (sexo == 1) ? "Masculino" : "Femenino";
        return "DNI: " + dni + ", Edad: " + edad + ", Sexo: " + sexoStr;
    }
}
