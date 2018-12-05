import Pay.CardPayment;
import Pay.CashPayment;
import Pay.Payment;
import flowers.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Color myColor = Color.RED;
        float fl_price = 0;
        FlowerSpec spec = new FlowerSpec();
        Flower fl = new Flower(FlowerType.CHAMOMILE, Color.YELLOW, 20, spec, Odor.SALTY);
        Flower fl1 = new Flower(FlowerType.ROSIE, Color.RED, 25, spec, Odor.SWEET);
        Flower fl2 = new Flower(FlowerType.TULIP, Color.RED, 27, spec, Odor.CHOCOLATE);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlower(fl, 5);
        bucket.addFlower(fl1, 4);
        //System.out.println("\nThis is bucket formed by hands !!!\n");
        //System.out.println(bucket);
        //System.out.println("This is hand formed bucket price !");
        //System.out.println(bucket.total_price());
        Map<FlowerBucket, Integer> flower_buckets = new HashMap<FlowerBucket, Integer>();
        FlowerBucket[] rnd_flower_buckets1 = new FlowerBucket[10];

        for( int i = 0; i < 10; i++){
            RandomBucket rndBucket = new RandomBucket();
            rnd_flower_buckets1[i] = rndBucket.bucket();
        }

//        System.out.println("\nThis is already formed buckets !!!\n");
//        for (FlowerBucket i : flower_buckets1){
//            System.out.println(i);
//        }

        System.out.println("What bucket do u want? 1 - Formed, 2- Form by yourself\n");
        int x = scan.nextInt();
        if(x == 1){
            System.out.println("Enter the number of bucket you want!");
            int type_of_rnd_bucket = scan.nextInt();
            System.out.println("You ordered this bucket\n");
            System.out.println(rnd_flower_buckets1[type_of_rnd_bucket]);
            System.out.println("How will u pay? 1 - By Cash, 2- By Card\n");
            int typePay = scan.nextInt();
            if(typePay == 2){
                Payment pay = new CardPayment();
                pay.process(rnd_flower_buckets1[type_of_rnd_bucket].total_price());
            }
            else{
                Payment pay = new CashPayment();
                pay.process(rnd_flower_buckets1[type_of_rnd_bucket].total_price());
            }
        }
        else {
            System.out.println("Enter number of Tulips");
            int tulips = scan.nextInt();
            System.out.println("Enter number of Chamomiles");
            int chamomiles = scan.nextInt();
            System.out.println("Enter number of Roses");
            int roses = scan.nextInt();
            FlowerBucket selfFormed = new FlowerBucket();
            selfFormed.addFlower(fl2, tulips);
            selfFormed.addFlower(fl, chamomiles);
            selfFormed.addFlower(fl1, roses);

            System.out.println("How will u pay? 1 - By Cash, 2- By Card\n");
            int typePay = scan.nextInt();
            if(typePay == 2){
                Payment pay = new CardPayment();
                pay.process(selfFormed.total_price());
            }
            else{
                Payment pay = new CashPayment();
                pay.process(selfFormed.total_price());
            }
        }

    }
}
