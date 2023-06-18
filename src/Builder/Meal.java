package Builder;

public class Meal {
    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getDesert() {
        return desert;
    }

    public String getSnack() {
        return snack;
    }

    public String getDrink() {
        return drink;
    }

    private String mainDish;
    private String sideDish;
    private String desert;
    private String snack;
    private String drink;

    public Meal(String mainDish, String sideDish, String desert, String snack, String drink){
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.desert = desert;
        this.snack = snack;
        this.drink = drink;
    }
}
