
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems(String fileName)  {
        ArrayList<Item> items_list = new ArrayList<>();
        try {
            File manifest = new File(fileName);
            Scanner scanner = new Scanner(manifest);
            String[] cargo;
            while (scanner.hasNextLine()) {
                Item item = new Item();
                cargo = scanner.nextLine().split("=");
                item.setName(cargo[0]);
                item.setWeight(Integer.parseInt(cargo[1]));
                items_list.add(item);
            }

        }
        catch (FileNotFoundException e){
            System.out.println("Podaj prawidłową nazwę pliku");
        }
        return items_list;
    }




   public ArrayList<Rocket> loadU1(ArrayList<Item> payload) {
        ArrayList<Rocket> U1_rockets_list = new ArrayList<>();
        Rocket U1_rocket = new U1();
        for (Item item : payload) {
            if (U1_rocket.canCarry(item)) {
                U1_rocket.carry(item);
            } else {
                U1_rockets_list.add(U1_rocket);
                U1_rocket = new U1();
                U1_rocket.carry(item);
            }
        }
        if (payload.size() != 0) {
            U1_rockets_list.add(U1_rocket);
        }
        return U1_rockets_list;
    }



    public ArrayList<Rocket> loadU2(ArrayList<Item> payload) {
        ArrayList<Rocket> U2_Rocket_list = new ArrayList<>();
        Rocket U2_Rocket = new U2();
        for (Item item : payload) {
            if (U2_Rocket.canCarry(item)) {
                U2_Rocket.carry(item);
            } else {
                U2_Rocket_list.add(U2_Rocket);
                U2_Rocket = new U2();
                U2_Rocket.carry(item);
            }
        }
        if (payload.size() != 0) {
            U2_Rocket_list.add(U2_Rocket);
        }
        return U2_Rocket_list;
    }




    public int runSimulation(ArrayList<Rocket> Rockets){
        int total_budget=0;
        boolean a=false;
        for(Rocket i:Rockets){
            total_budget += i.getRocket_cost();
            if(!(i.launch()&&i.land())) {
                a = true;
            }
            while (a){
                total_budget += i.getRocket_cost();
                if(i.launch()&&i.land()) {
                    a = false;
                }
            }


        }
        return total_budget;
    }

   }










