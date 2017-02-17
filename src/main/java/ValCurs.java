
import java.util.ArrayList;
import java.util.List;



public class ValCurs {

    private String Date;

    private String name;

    private List<Valute> Valutes =new ArrayList<Valute>();

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Valute> getValutes() {
        return Valutes;
    }

    public void setValutes(List<Valute> valutes) {
        Valutes = valutes;
    }
}
