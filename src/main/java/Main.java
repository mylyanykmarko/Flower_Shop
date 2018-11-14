import flowers.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Color myColor = Color.RED;
        float fl_price = 0;
        FlowerSpec spec = new FlowerSpec();
        Flower fl = new Flower(FlowerType.CHAMOMILE, Color.YELLOW, 123, spec, Odor.SWEET);
        Flower fl1 = new Flower(FlowerType.ROSIE, Color.RED, 100, spec, Odor.SWEET);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlower(fl, 5);
        bucket.addFlower(fl1, 4);
        System.out.println("\nThis is bucket formed by hands !!!\n");
        System.out.println(bucket);
        System.out.println("This is hand formed bucket price !");
        System.out.println(bucket.total_price());
        Map<FlowerBucket, Integer> flower_buckets = new HashMap<FlowerBucket, Integer>();
        FlowerBucket[] flower_buckets1 = new FlowerBucket[10];

        for( int i = 0; i < 10; i++){
            RandomBucket rndBucket = new RandomBucket();
            flower_buckets1[i] = rndBucket.bucket();
        }


        System.out.println("\nThis is already formed buckets !!!\n");
        for (FlowerBucket i : flower_buckets1){
            System.out.println(i);
        }


    }
}
