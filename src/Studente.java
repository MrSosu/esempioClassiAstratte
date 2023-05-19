public class Studente extends Persona {

    private int matricola;

    public Studente(int matricola, String name, String surname, int eta) {
        super(name, surname, eta);
        this.matricola = matricola;

    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
}
