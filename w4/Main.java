import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Fridge f = new Fridge(10);

        Food one = new Food("Mozzarella", FoodType.CHEESE, 2);
        Food two = new Food("Lamb", FoodType.MEAT, 5);

        f.addFood(Arrays.asList(
            one,
            two
        ));

        /*  System.out.println(f.capacity);
        System.out.println(f.foods); */
        for (Food food : f.foods) {
            System.out.println(food.name);
        }
    }
}