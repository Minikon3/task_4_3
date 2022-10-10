public class mouse extends items implements USBdevices{

    mouse(catalog type, String color, double cost){
        super(type,color,cost);
    }

    @Override
    public String toString() {
        return "Мышь: Тип = "+getType()+", цвет = "+getColor()+", цена = "+getCost();
    }
}