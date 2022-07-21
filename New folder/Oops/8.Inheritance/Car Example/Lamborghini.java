class Lamborghini extends Car{
    String transMissionType;
    int capacity;
    int seat;
    void speciality(){
        System.out.println("The car is absolutely stunning from every angle, and to this day, we’re not convinced it isn’t an alien spacecraft surveying our planet for eventual takeover. It just doesn’t seem real.The only thing more remarkable than the look is the price — a whopping $4.5 million.");
    }

    void transmissionTypeFun(){
        System.out.println("Transmission Type: "+transMissionType);
    }

    void capacityFun(){
        System.out.println("Fuel Tank Capacity: "+capacity);
    }
    
    void seatFun(){
        System.out.println("Seating Capacity: "+seat);
    }
}