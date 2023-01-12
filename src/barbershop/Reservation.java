package barbershop;

import java.util.Arrays;

public class Reservation {

        private static int ID = 0;
        private int id;
        private Services[] services;
        private Klient [] klient;
        private int cmimServisi;


        public Long getPrice(){
                Long cmimServisi = 0L;

                for ( int i = 0 ; i < services.length ; i++ ) {
                        cmimServisi +=services[i].getCmimi();
                }

                return cmimServisi;
        }

        public Reservation(Services[] services, Klient [] klient) {
                this.id = ++ID;
                this.services = services;
                this.klient = klient;
        }

        public int getId() { return id; }

        public void setId(int id) {
                this.id = id;
        }

        public Services[] getServices() {
                return services;
        }

        public void setServices(Services[] services) {
                this.services = services;
        }

        public Klient[] getKlient() {
                return klient;
        }

        public void setKlient(Klient[] klient) {
                this.klient = klient;
        }

        public int getCmimServisi() {
                return cmimServisi;
        }

        public void setCmimServisi(int cmimServisi) {
                this.cmimServisi = cmimServisi;
        }

        @Override
        public String toString() {
                return "Reservation{" +
                        "id=" + id +
                        ", services=" + Arrays.toString(services) +
                        ", klient=" + Arrays.toString(klient) +
                        ", cmimServisi=" + cmimServisi +
                        '}';
        }
}
