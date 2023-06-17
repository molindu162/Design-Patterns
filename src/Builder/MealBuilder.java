package Builder;

public class MealBuilder implements Builder{
    private String mainDish;
    private String sideDish;
    private String desert;
    private String snack;
    private String drink;
    @Override
    public void buildMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void buildSideDish(String sideDish) {
        this.sideDish = sideDish;

    }

    @Override
    public void buildDesert(String desert) {
        this.desert = desert;

    }

    @Override
    public void buildSnacks(String snack) {
        this.snack = snack;

    }

    @Override
    public void buildDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public Meal buildMeal() {
        return new Meal(mainDish, sideDish, desert, snack, drink);
    }
}
