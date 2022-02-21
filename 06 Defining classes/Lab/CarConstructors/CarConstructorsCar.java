public class Car {
        private String make;
        private String model;
        private int horsePower;
        
        public static final String undefinedValue = "unknown";
        
        public Car(String make, String model, int horsePower) {
            this(make);
            this.model = model;
            this.horsePower = horsePower;
        }
        
        public Car(String make) {
            this();
            this.make = make;
        }
        
        public Car() {
            this.make = undefinedValue;
            this.model = undefinedValue;
            this.horsePower = -1;
        }        

        public void setMake (String make) {
            this.make = make;
        }
        
        public void setModel (String model) {
            this.model = model;
        }
        
        public void setHorsePower (int horsePower) {
            this.horsePower = horsePower;
        }
        
        public String getMake() {
            return this.make;
        }
        
        public String getModel() {
            return this.model;
        }
        
        public int getHorsePower() {
            return this.horsePower;
        }
        
        public String getInfo() {
            return String.format("The car is: %s %s - %d HP.",
                    this.getMake(), this.getModel(), this.getHorsePower());
        }
               
    }
