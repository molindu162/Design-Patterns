package Adapter;

import Adapter.avaFilters.CaramelFilter;

public class CaramelAdapter implements Filter{
    CaramelFilter caramel;

    public CaramelAdapter(CaramelFilter caramel) {
        this.caramel = caramel;
    }


    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.apply(image);
    }
}
