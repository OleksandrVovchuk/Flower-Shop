package Buckets;

import Flowers.Chamomile;
import Flowers.Rose;
import Flowers.Tulip;

public class Def_bucket_1 extends Bucket {

    public  Def_bucket_1(){
        bucket.add(new Rose());
        bucket.add(new Chamomile());
        bucket.add(new Rose());
        bucket.add(new Chamomile());
        bucket.add(new Rose());
        bucket.add(new Chamomile());
        bucket.add(new Tulip());
    }

}
