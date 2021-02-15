package attractions;

import interfaces.ISecurity;
import interfaces.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 12 && visitor.getHeight() > 145.00){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200) {
            return defaultPrice() * 2;
        } else {
            return defaultPrice();
        }
    }
}
