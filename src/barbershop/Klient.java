package barbershop;

import java.time.LocalDate;

public class Klient {
    private static int ID = 0;
    private int id;
    private String emer;
    private String mbiemer;
    private LocalDate regjistruar;


    public Klient( String emer, String mbiemer, LocalDate regjistruar) {

        ID++;
        this.id = ID;
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.regjistruar = regjistruar;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    public LocalDate getRegjistruar() {
        return regjistruar;
    }

    public void setRegjistruar(LocalDate regjistruar) {
        this.regjistruar = regjistruar;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id=" + id +
                ", emer='" + emer + '\'' +
                ", mbiemer='" + mbiemer + '\'' +
                ", regjistruar=" + regjistruar +
                '}';
    }
}
