package Comupter;




import java.util.ArrayList;
import java.util.Scanner;

public class Computer {
    private String name;

    private int type;

    public Computer(String name, int type) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    ArrayList<Computer> listComputer = new ArrayList<Computer>();
        System.out.print("Enter number computer: ");
    int n = sc.nextInt();
        for ( int i = 0; i < n; i++) {
        System.out.println(String.format("Enter place %s", i+1));
        System.out.print("Enter name of computer: ");
        String name = sc.next();
        System.out.print("Enter type of computer(1,2,3): ");
        int type = sc.nextInt();


        Computer computer = new Computer(name, type);
        listComputer.add(computer);
    }
        for ( int x = 0; x < listComputer.size(); x++) {
        System.out.println("");
        System.out.print("name " + listComputer.get(x).name + " " + "type " + listComputer.get(x).type);
    }
}}
