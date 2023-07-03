public class Item {
     String name;
     int weight;
    public String toString() {
        return "Item properties: name=" + name+" "+weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}