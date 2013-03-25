package esad.chapter2.task5;


import esad.chapter1.task8.Food;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author: grisha_angelov
 */
public class FoodDB {

    public Iterator searchFood(String chineseName, String englishName) {

        TreeMap foodTree = new TreeMap();
        Iterator foodList;
        Food food;
        foodList = getAllRecords();
        while (foodList.hasNext()) {
            food = (Food) foodList.next();

            if (foodContainNames(chineseName, englishName, food)) {
                foodTree.put(food.getFoodKey(), food);
            }
        }
        return foodTree.values().iterator();
    }

    private boolean foodContainNames(String chineseName, String englishName, Food food) {
        return foodNameContainsWord(chineseName, food) && foodNameContainsWord(englishName, food);
    }

    private boolean foodNameContainsWord(String name, Food food) {
        return (foodNameNotSpecified(name) || food.getCName().indexOf(name) != -1);
    }

    private boolean foodNameNotSpecified(String foodName) {
        return foodName == null || foodName.equals("");
    }

    private Iterator getAllRecords() {
        return null;
    }
}
