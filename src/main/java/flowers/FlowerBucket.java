package flowers;

import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ToString
public class FlowerBucket {
    //private ArrayList<Flower> flowers = new ArrayList<Flower>();
    private Map<Flower, Integer> flowers = new HashMap<Flower, Integer>();
    public float bucket_price;

    public void addFlower(Flower fl, int n){
       // flowers.add(fl);
        flowers.put(fl, n);
        bucket_price = bucket_price + fl.getPrice() * n;
    }
    public float total_price(){
        return bucket_price;
    }

}

