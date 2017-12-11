package Rooms;

public enum BedroomType {
        SINGLE("Single", 1, 120.00),
        DOUBLE("Double", 2, 180.00),
        SUITE("Suite",4, 500.00);

        private String roomType;
        private double price;
        private final int capacity;

        BedroomType(String roomType, int capacity, double price) {
            this.roomType = roomType;
            this.capacity = capacity;
            this.price = price;
        }


        public int getCapacity() {
                return capacity;
            }


             public double getPrice() {
             return price;
            }

            public String getRoomType(){
            return roomType;
            }
}
