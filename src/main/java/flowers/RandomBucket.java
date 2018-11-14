package flowers;

import java.util.Random;

public class RandomBucket {

    public FlowerBucket bucket(){
        float fl_price = 0;
        FlowerBucket rand_bucket = new FlowerBucket();
        FlowerSpec spec = new FlowerSpec();
        Random rand = new Random();
        int rnd = rand.nextInt(101) + 3;


        for(int i = 0; i < rnd; i++){
            int pick_fl = new Random().nextInt(FlowerType.values().length);
            int pick_cl = new Random().nextInt(Color.values().length);

            FlowerType rnd_type = FlowerType.values()[pick_fl];
            Color rnd_color = Color.values()[pick_cl];
            Odor odor;


            if (rnd_type == FlowerType.CHAMOMILE){
                fl_price = 20;
                odor = Odor.SALTY;

            }
            else if (rnd_type == FlowerType.ROSIE){
                fl_price = 25;
                odor = Odor.SWEET;
            }
            else{
                fl_price = 27;
                odor = Odor.CHOCOLATE;

            }

            Flower flower = new Flower(rnd_type, rnd_color, fl_price, spec, odor);
            rand_bucket.addFlower(flower, 1);

        }
        return rand_bucket;
    }
}
