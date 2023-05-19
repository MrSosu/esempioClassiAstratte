public class Professore extends Persona{

    private double stipendio;

    public Professore(String name, String surname, int eta, double stipendio) {
        super(name, surname, eta);
        this.stipendio = stipendio;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }
}
