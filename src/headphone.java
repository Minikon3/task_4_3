public class headphone extends items implements USBdevices{

    headphone(catalog type, String color, double cost){
        super(type,color,cost);
    }

    @Override
    public String toString() {
        return "Наушники: Тип = "+getType()+", цвет = "+getColor()+", цена = "+getCost();
    }
}