package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;

import java.util.*;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter{
    Item[] item;
    public ItemSorter(Item[] items) {
        this.item = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        List<Item> itemList = new ArrayList<>(List.of(this.item));
        Item[] result = new Item[this.item.length];
        itemList.sort(comparator);
        for(int i = 0; i < result.length; i++) {
            result[i] = itemList.get(i);
        }
        return result;
    }
}
