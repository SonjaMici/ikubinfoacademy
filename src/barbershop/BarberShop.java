package barbershop;

public class BarberShop {

    private static int ID = 0;
    private final Klient[] klient;
    private int id;
    private Reservation[] rezervations;

    private Services[] services;

    private int reservationId = 0;

    private int klientId = 0;

    private int serviceId = 0;

    public BarberShop(Klient[] klient, int id, Reservation[] rezervations, Services[] services) {
        ID++;
        this.klient = new Klient[20];
        this.rezervations = new Reservation[50];
        this.services = new Services[30];
        this.id = ID;

    }

    public void shtoRevervim(Reservation rezervations) {
        if (reservationId >= 50) {
            System.out.println("Nuk mund te behen me shume rezervime");
            return;
        }
        this.rezervations[reservationId++] = rezervations;
    }

    public void shtoServis(Services services) {
        if (serviceId >= 30) {
            System.out.println("Keni arritur limitin e sherbimeve");
            return;
        }
        this.services[serviceId++] = services;
    }

    public void shtoKlient(Klient klient) {
        if (klientId >= 20) {
            System.out.println("Nuk mund ti sherbejme me shume kliente");
            return;
        }
        this.klient[klientId++] = klient;
    }

    public Klient[] getKlient() {
        return klient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reservation[] getRezervations() {
        return rezervations;
    }

    public void setRezervations(Reservation[] rezervations) {
        this.rezervations = rezervations;
    }

    public Services[] getServices() {
        return services;
    }

    public void setServices(Services[] services) {
        this.services = services;
    }

    public Reservation gjejRezerviminMax() {
        Reservation max = rezervations[0];
        {for (int i = 1; i < reservationId; i++)
            if (rezervations[i].getCmimServisi() > max.getCmimServisi()) {
                max = rezervations[i];
            }
        }
        return max;
    }

    public void verfikoSherbime(Reservation[] rezervations) {
        if (rezervations[i].getServices() > 5) {
            System.out.println("Klienti" +rezervations[i].getKlient() + "futet ne listen e klientev VIP");
        }


    }

}
