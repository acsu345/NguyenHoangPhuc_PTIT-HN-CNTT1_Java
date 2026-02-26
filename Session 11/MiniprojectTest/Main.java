package MiniprojectTest;

public class Main {
    public static void main(String[] args){
        Drink [] drink = new Drink[3];
        drink[0] = new Coffee("Bạc xỉu", "30000", "C001" );
        drink[1] = new FruitJuice("Nước Cam", " 40000", " F001");
        drink[2] = null;

        for(Drink d : drink){
            if(d != null){
                d.displayInfo();
                System.out.println("Gái sau khi tính: " + d.calculatePrice());
        }
    }   
}
}