package Flowers;

import java.awt.*;

public abstract class Flower {
    public int length;
    public Color color;
    public String odor;
    public String country;
    public int price;
    public String name;

    public Flower(int Lenght, Color Color, String Odor, String Country, int Price, String Name){
        length = Lenght;
        color = Color;
        odor = Odor;
        country = Country;
        price = Price;
        name = Name;
    }

}
