public class DellPC extends items implements PC{

    DellPC(catalog type, String color, double cost){
        super(type,color,cost);
    }

    @Override
    public String toString() {
        return "Настольный компьютер: Тип = "+getType()+", цвет = "+getColor()+", цена = "+getCost();
    }
}