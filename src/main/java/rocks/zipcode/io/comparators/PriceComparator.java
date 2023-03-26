package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2){
        if (i1.getPrice() > i2.getPrice()){
            return 1;
        } else if (i1.getPrice() < i2.getPrice()) {
            return  -1;
        }
            return  0;
        }
    }
