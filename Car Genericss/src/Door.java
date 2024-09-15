public class Door extends Part<String> {
    private String colour;
    private String brand;

    public Door(String tool, String colour, String brand) {
        super(tool);
        this.colour = colour;
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void displayCar(){
        System.out.println("Door \uD83D\uDEAA");
        System.out.println("Tool:"+super.getTool()+"  "+"Colour:"+getColour()+"    "+"Brand:"+getBrand());
    }

}
