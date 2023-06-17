package Builder;

public interface Builder {
    void buildMainDish(String mainDish);
    void buildSideDish(String sideDish);
    void buildDesert(String desert);
    void buildSnacks(String snack);
    void buildDrink(String drink);
    Meal buildMeal();

}
