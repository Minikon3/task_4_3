public class keyboard extends items implements USBdevices{

    keyboard(catalog type, String color, double cost){
        super(type,color,cost);
    }

    @Override
    public String toString() {
        return "Клавиатура: Тип = "+getType()+", цвет = "+getColor()+", цена = "+getCost();
    }
}