package Buckets;

import Flowers.Flower;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Bucket {
    ArrayList<Flower> bucket;
    public Bucket(){
        bucket = new ArrayList<Flower>();
    }
    public int Calculate_Price(){
        int total_price = 0;
        for(Flower flower: this.bucket){
            total_price += flower.price;
        }
        return total_price;
    }
    public void add_flower(Flower flower){
        this.bucket.add(flower);
    }
    public void delete_flower(Flower flower){
        this.bucket.remove(flower);
    }
    public String show_bucket(){
        String Flowers = "";
        for(Flower flower : this.bucket){
            Flowers += flower.name + ",";

        }
        return Flowers;
    }
}
