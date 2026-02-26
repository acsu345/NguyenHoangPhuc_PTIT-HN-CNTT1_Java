package MiniprojectTest;

public class FruitJuice extends Drink implements IMixable {
    public FruitJuice(String name, String price, String Id){
        super(name, price, Id);
    }
    String fruitType;
    void setFruitType(String fruitType){
        this.fruitType = fruitType;
    }
    int discountPercent;
    @Override
    double calculatePrice(){
        double price = super.calculatePrice() * (1 - discountPercent / 100.0);
        return price;
    }

    @Override
    void mix() {
        System.out.println("Đang ép " + fruitType + " tươi ");
    }
    
}
