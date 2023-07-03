public class Rocket implements SpaceShip {

    int Rocket_cost;
     int chance_of_crash ;
     int chance_of_explosion;
     int Rocket_weight ;
     int max_weight;
    int total_items_weight;

    public int getRocket_cost() {
        return Rocket_cost;
    }

    public void setRocket_cost(int rocket_cost) {
        Rocket_cost = rocket_cost;
    }

    public int getChance_of_crash() {
        return chance_of_crash;
    }

    public void setChance_of_crash(int chance_of_crash) {
        this.chance_of_crash = chance_of_crash;
    }

    public int getChance_of_explosion() {
        return chance_of_explosion;
    }

    public void setChance_of_explosion(int chance_of_explosion) {
        this.chance_of_explosion = chance_of_explosion;
    }


    public void setRocket_weight(int rocket_weight) {
        Rocket_weight = rocket_weight;
    }

    public int getMax_weight() {
        return max_weight;
    }

    public void setMax_weight(int max_weight) {
        this.max_weight = max_weight;
    }

    public int getTotal_items_weight() {
        return total_items_weight;
    }

    public void setTotal_items_weight(int total_items_weight) {
        this.total_items_weight = total_items_weight;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {

        if (item.weight+this.total_items_weight<this.max_weight){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void carry(Item item) {
        this.total_items_weight+=item.weight;

    }

}