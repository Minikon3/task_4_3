public class HPlaptop extends items implements PC{

    HPlaptop(catalog type, String color, double cost){
        super(type,color,cost);
    }

    @Override
    public String toString() {
        return "Ноутбук: Тип = "+getType()+", цвет = "+getColor()+", цена = "+getCost();
    }
}