public class iPad extends items implements Gadgets{

    iPad(catalog type, String color, double cost){
        super(type,color,cost);
    }

    @Override
    public String toString() {
        return "Планшет: Тип = "+getType()+", цвет = "+getColor()+", цена = "+getCost();
    }
}