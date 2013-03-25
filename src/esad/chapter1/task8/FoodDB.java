package esad.chapter1.task8;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author: grisha_angelov
 */
public class FoodDB {
    private Iterator allRecords;

    public Iterator srchFood(String cName, String eName) {
        TreeMap foodTree = new TreeMap();
        Iterator foodList;
        Food food;
        foodList = getAllRecords();
        while (foodList.hasNext()) {
            food = (Food) foodList.next();
            if (check(cName, food.getCName()) && check(eName, food.getEName())) {
                foodTree.put(food.getFoodKey(), food);
            }
        }
        return foodTree.values().iterator();
    }

    private boolean check(String name, String s) {
        return name == null || name.equals("") || s.indexOf(name) != -1;
    }


    public Iterator getAllRecords() {
        return allRecords;
    }
}
