import java.util.List;

public class Mese implements Comparable<Mese> {
    private String cim;
    private List<String> szereplok;

    public String getCim() {
        return this.cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public List<String> getSzereplok() {
        return this.szereplok;
    }

    public void setSzereplok(List<String> szereplok) {
        this.szereplok = szereplok;
    }

    public Mese(String cim, List<String> szereplok) {
        this.cim = cim;
        this.szereplok = szereplok;
    }

    @Override
    public int compareTo(Mese o) {
        if (this.szereplok.size() == o.szereplok.size()) {
            return this.cim.compareTo(o.cim);
        } else {
            return (-1) * Integer.compare(this.szereplok.size(), o.szereplok.size());
        }
    }

    @Override
    public String toString() {
        return String.format(this.cim + " " + this.szereplok.size());
    }

}
