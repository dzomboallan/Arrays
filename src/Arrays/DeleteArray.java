package Arrays;

import java.util.Arrays;

public class DeleteArray {
    private int [] items;
    private int count;


    public  DeleteArray(int length){
        items = new int [length];

    }
    public void insert(int item){
        if(items.length == count){
            int newItems[] = new int [count * 2];
            for(int i=0; i<count;i++)
                newItems [i] = items[i];
            items = newItems;


        }
        items [count ++] = item;
    }
    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;

    }
    public void print(){
        for(int i = 0; i < count;i++){
            System.out.println(items[i]);
        }
    }
    public static void main (String [] args){

        DeleteArray numbers = new DeleteArray(7);
        System.out.println("Items added into the array");
        System.out.println("************************************");
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.print();
        System.out.println("************************************");
        System.out.println();
        System.out.println("Deleted item at index 0 of the array");
        System.out.println("************************************");
        numbers.removeAt(0);
        numbers.print();

    }

}
