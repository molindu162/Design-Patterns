package Builder;

public class OrderProcessor {
    public Meal buildMeal(Builder builder){
        builder.buildMainDish("Rice & Curry");
        builder.buildSideDish("Chicken");
        builder.buildDesert("Ice-cream");
        builder.buildSnacks("Tipi-tip");
        builder.buildDrink("Sprite");
        return builder.buildMeal();
    }
}
