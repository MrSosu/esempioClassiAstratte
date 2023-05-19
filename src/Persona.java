public abstract class Persona {

    private String name;
    private String surname;
    private int eta;

    public Persona(String name, String surname, int eta) {
        this.name = name;
        this.surname = surname;
        this.eta = eta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
