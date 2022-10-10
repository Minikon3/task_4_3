public class iteminfo {
    public void gadgetInfo(items[] itemss){
        System.out.println("Мобильные устройства: ");
        for (items item : itemss){
            if(item instanceof Gadgets){
                System.out.println(item);
            }
        }
    }
    public void PCInfo(items[] itemss){
        System.out.println("Компьютеры: ");
        for (items item : itemss){
            if(item instanceof PC){
                System.out.println(item);
            }
        }
    }
    public void devicesInfo(items[] itemss){
        System.out.println("USB устройства: ");
        for (items item : itemss){
            if(item instanceof USBdevices){
                System.out.println(item);
            }
        }
    }
}
