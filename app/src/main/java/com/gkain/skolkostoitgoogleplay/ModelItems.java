package com.gkain.skolkostoitgoogleplay;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModelItems {
    private String author;
    private int price;

    public int getPrice() {
        return price;
    }

    public ModelItems (String product, int price){
        this.author = product;
        this.price = price;
    }

    public String getAuthor(){
        return author;
    }

    public static List<ModelItems> getFakeItems(){
        ArrayList<ModelItems> itemList = new ArrayList<>();
//      itemList.add(new ModelItems("One message",13));
//       itemList.add(new ModelItems("Two message",12));
//       itemList.add(new ModelItems("Three message",11));
        return itemList;
    }
}
