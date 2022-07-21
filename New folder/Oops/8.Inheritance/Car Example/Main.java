public class Main{
    public static void main(String[] args) {
        Lamborghini lam = new Lamborghini();
        lam.name = "Lamborghini";
        lam.color = "Black, Yellow, Blue, White";
        lam.speed = 356;
        lam.price = "$200,000 to $500,000";
        lam.transMissionType = "Automatic";
        lam.capacity = 90;
        lam.seat = 2;
        System.out.println(lam.name);
        lam.colorFun();
        lam.speedFun();
        lam.priceFun();
        lam.transmissionTypeFun();
        lam.capacityFun();
        lam.seatFun();
        System.out.println();
        lam.speciality();
        System.out.println();
        

        Ferrari far = new Ferrari();
        far.name = "Ferrari";
        far.color = "Red, Black, Yellow";
        far.speed = 340;
        far.price = "$335,000 to $625,000";
        System.out.println(far.name);
        far.colorFun();
        far.speedFun();
        far.priceFun();
        System.out.println();
        far.speciality();
        System.out.println();

    }
}