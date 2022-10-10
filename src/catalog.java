public enum catalog {
    COMPUTERS("Dell desktop PC"),
    LAPTOPS("HP laptop"),
    TABLETS("iPad"),
    HEADPHONES("Razor headphones"),
    KEYBOARDS("Corsair keyboard"),
    MOUSES("Logitech mouse"),
    PHONES("iPhone");
    private String type;
    catalog(String type){
        this.type=type;
    }
    @Override
    public String toString() {
        return name()+", название = "+type;
    }
}
