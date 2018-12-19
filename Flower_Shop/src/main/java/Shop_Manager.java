import Buckets.Bucket;
import Buckets.Def_bucket_1;
import Buckets.Def_bucket_2;
import Flowers.Chamomile;
import Flowers.Flower;
import Flowers.Rose;
import Flowers.Tulip;

import java.util.ArrayList;

public class Shop_Manager {
    Bucket [] def_buckets = {new Def_bucket_1(), new Def_bucket_2()};
    Flower [] flowers = {new Rose(), new Tulip(), new Chamomile()};

    public void Choose_def_bucket(){
        System.out.println("Our default buckets:");
        for (Bucket bucket : def_buckets){
            System.out.println("- " + bucket.show_bucket() + "  Price:  " + bucket.Calculate_Price() );
        }
    }
    public void Create_bucket(){
        System.out.println("Our flowers");
        int i = 1;
        for (Flower flower: flowers){
            System.out.println(i + " - "+flower.name + " Price: " + flower.price);
            i++;
        }
        System.out.println("To add flower to your bucket press proper number, to finish press - 0 ");
        int z = 1;
        while (z !=0){

        }
    }
}
