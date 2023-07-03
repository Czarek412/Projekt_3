public class U2 extends Rocket {
    U2() {
        setRocket_cost(120); //w milonach
        setChance_of_crash(8);
        setChance_of_explosion(4);
        setMax_weight(11000);
        setTotal_items_weight(0);
        setRocket_weight(18000);
    }


    @Override
    public boolean launch() {
        boolean launch = true;
        double random = Math.random() * 100 + 1;
        int random_number = (int) random;
        if (getChance_of_explosion() * ((double)getTotal_items_weight() / getMax_weight()) > random_number) {
            launch = false;
        }
        return launch;
    }

    @Override
    public boolean land() {
        boolean land = true;
        double random = Math.random() * 100 + 1;
        int random_number = (int) random;
        if (getChance_of_crash() * ((double)getTotal_items_weight() / getMax_weight()) > random_number) {
            land = false;
        }
        return land;
    }
}




