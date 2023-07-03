public class U1 extends Rocket {
    U1() {
        setRocket_cost(100); //w milonach
        setChance_of_crash(1);
        setMax_weight(8000);
        setTotal_items_weight(0);
        setRocket_weight(10000);
        setChance_of_explosion(5);
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

