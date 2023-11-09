

package model;

import java.util.ArrayList;

/**
 *
 * @author rohitkulkarni
 */
public class Product {
    
    private String name;
    private int price;
    private int id;

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    private ArrayList<Feature> features;
    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        features = new ArrayList<Feature>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    public Feature addNewFeature() {
        Feature newFeature = new Feature(this);
        features.add(newFeature);
        return newFeature;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    @Override
    public String toString() {
        return name;
    }
    
}
