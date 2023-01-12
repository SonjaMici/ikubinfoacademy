package barbershop;

import java.util.Arrays;

public class Services {
    private static int ID = 0;
    private int id;
    private String emerSherbimi;
    private Long cmimi;

    public Services( String emerSherbimi, Long cmimi) {
        ID++;
        this.id = ID;
        this.emerSherbimi = emerSherbimi;
        this.cmimi = cmimi;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmerSherbimi() {
        return emerSherbimi;
    }

    public void setEmerSherbimi(String emerSherbimi) {
        this.emerSherbimi = emerSherbimi;
    }

    public Long getCmimi() {
        return cmimi;
    }

    public void setCmimi(Long cmimi) {
        this.cmimi = cmimi;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id=" + id +
                ", emerSherbimi='" + emerSherbimi + '\'' +
                ", cmimi=" + cmimi +
                '}';
    }
}
