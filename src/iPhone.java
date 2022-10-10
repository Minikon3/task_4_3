public class iPhone extends items implements Gadgets{

    iPhone(catalog type, String color, double cost){
        super(type,color,cost);
    }

    @Override
    public String toString() {
        return "Телефон: Тип = "+getType()+", цвет = "+getColor()+", цена = "+getCost();
    }
}