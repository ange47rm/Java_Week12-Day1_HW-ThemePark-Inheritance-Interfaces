import attractions.Attraction;
import interfaces.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    public ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark (ArrayList<Attraction> attractions, ArrayList<Stall> stalls ){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public int getAttractionCount(){
        return this.attractions.size();
    }

    public int getStallCount(){
        return this.stalls.size();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allReviewed;
        allReviewed = new ArrayList<IReviewed>();
        allReviewed.addAll(this.attractions);
        allReviewed.addAll(this.stalls);
        return allReviewed;
    }
}
