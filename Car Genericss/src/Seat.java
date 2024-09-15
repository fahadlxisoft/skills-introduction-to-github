public class Seat extends Part<String>{
    private String heightLimit;
    private String weightLimit;

    public Seat(String tool, String heightLimit , String weightLimit) {
        super(tool);
        this.heightLimit = heightLimit;
        this.weightLimit = weightLimit;
    }

    public String getHeightLimit() {
        return heightLimit;
    }

    public void setHeightLimit(String heightLimit) {
        this.heightLimit = heightLimit;
    }
    public String getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(String weightLimit) {
        this.weightLimit = weightLimit;
    }
    public void displayCar(){
        System.out.println("Seat \uD83D\uDCBA");
        System.out.println("Tool:"+super.getTool()+"  "+"Height limit:"+getHeightLimit()+"    "+"Weight limit:"+getWeightLimit());
    }
}
