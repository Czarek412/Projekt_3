import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Simulation simulation = new Simulation();
        int total_budget_U1 = 0, total_budget_U2 = 0;

        ArrayList<Item> Phase_1_list = simulation.loadItems("Phase-1.txt");
        ArrayList<Item> Phase_2_list = simulation.loadItems("Phase-2.txt");

        ArrayList<Rocket> first_U1_fleet = simulation.loadU1(Phase_1_list);
        ArrayList<Rocket> second_U1_fleet = simulation.loadU1(Phase_2_list);

        ArrayList<Rocket> first_U2_fleet = simulation.loadU2(Phase_2_list);
        ArrayList<Rocket> second_U2_fleet = simulation.loadU2(Phase_2_list);

        total_budget_U1 = simulation.runSimulation(first_U1_fleet) + simulation.runSimulation(second_U1_fleet);
        total_budget_U2 = simulation.runSimulation(first_U2_fleet) + simulation.runSimulation(second_U2_fleet);

        System.out.println("Rakiety U1 kosztują " + total_budget_U1 + "M $");
        System.out.println("Rakiety U2 kosztują " + total_budget_U2 + "M $");

        }
    }
