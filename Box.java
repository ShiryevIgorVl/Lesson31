import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> Box = new ArrayList<>();



    //Вес фруктов  в корробке.
    // quantity - количество элементов в коллекции фруктов
    // wt - вес одного фрукта
    public float getWeight(int quantity, float wtFruit){
        float weightFruit = (float)(quantity * wtFruit);
        return weightFruit;
    }

    // метод добавления фрукта в коробку, j - количество фруктов которое нужно добавить в коробку
    public ArrayList<T> addInBox(int j, T fruit){
        for (int i = 0; i < j; i++) {
            Box.add(fruit);
        }
        return Box;
    }

    //Метод сравнения коробок
    public boolean compare (float wtFruit){
        if (Math.abs(getWeight(this.Box.size(), wtFruit) - getWeight(Box.size(), wtFruit)) < 0.1f){
          return true;
      } else {
        return false;
      }
    }

    //Метод пересыпания из коровки в коробку (яблоки к яблокам, впельсины к апельсинам)
    public void movingFruits(Box<T> box2){
        box2.Box.addAll(Box);
        Box.clear();
        return;
        }



}
