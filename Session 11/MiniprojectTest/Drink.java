package MiniprojectTest;

abstract class Drink {
    protected String name;
    protected String price;
    protected String Id;
    public Drink(String name, String price, String Id){
        this.name = name;
        this.price = price;
        this.Id = Id;
    }
    
    double calculatePrice(){
    return Double.parseDouble(price);
    }

    void displayInfo(){
        System.out.println("Name:" + name);;
        System.out.println("Price: "+ price);
        System.out.println("ID: "+ Id);
    }

    void mix() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mix'");
    }
}


