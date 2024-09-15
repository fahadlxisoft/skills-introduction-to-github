import java.util.ArrayList;
    import java.util.List;

        public class Car<T>  {
            private List<Part<?>> parts = new ArrayList<>();
                public  Car () {
                    this.parts= new ArrayList<>();
                }
                        public void addPart(Part<?>part){
                        parts.add(part);
                        }
                                public void displayAllParts() {
                                    for (Part<?> part : parts) {
                                        part.displayCar();
                                    }
                }
                                            public void removePart(Part<?>part)
                                            {
                                            parts.remove(part);
                                            }
}
