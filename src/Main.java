import Adapter.CaramelAdapter;
import Adapter.Filter;
import Adapter.Image;
import Adapter.avaFilters.CaramelFilter;

public class Main {
    public static void main (String[] args){
        Filter caramel = new CaramelAdapter(new CaramelFilter());
        caramel.apply(new Image());
    }
}
