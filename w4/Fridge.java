import java.util.List;

public class Fridge
{
    public int capacity;

    public List<Food> foods;

    public Fridge(int capacity) {
        this.capacity = capacity;
    }

    public void addFood(List<Food> food) {
        this.foods = food;
    }

}