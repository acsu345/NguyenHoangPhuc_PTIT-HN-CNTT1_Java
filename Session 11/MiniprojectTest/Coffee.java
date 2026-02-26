package MiniprojectTest;

class Coffee extends Drink{
    public Coffee(String name, String price, String Id) {
        super(name, price, Id);
    }
    boolean hasMilk;
    
    void addMilk(){
        hasMilk = true;
        System.out.println("Adding milk to the coffee.");
    }
    @Override
    double calculatePrice(){
        double price = super.calculatePrice() + (hasMilk ? 5000 : 0);
        return price;
    }
    
    void displayInfo(){
        super.displayInfo();
        if(hasMilk){
            System.out.println("Có sữa");
        }else{
            System.out.println("Đen đá");
        }
    }
}
