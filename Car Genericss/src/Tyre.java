public class Tyre extends Part<String> {
    private String brand;
      private String size;

            public Tyre(String tool, String brand, String size) {
                super(tool);
                this.brand = brand;
                this.size = size;
            }

                        public String getBrand() {
                            return brand;
                        }

                                public void setBrand(String brand) {
                                    this.brand = brand;
                                }
                                        public String getSize() {
                                            return size;
                                        }
                                                public void setSize(String size) {
                                                    this.size = size;
                                                }

    public void displayCar(){
        System.out.println("Tyre \u263C");
        System.out.println("Tool:"+super.getTool()+"  "+"Brand:"+getBrand()+"    "+"Size:"+getSize());
    }
                                                    }

