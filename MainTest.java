package SingleTonArch;public class MainTest {    public static void main(String[] args) {        final SingleTon singleTon1 = SingleTon.getInstance();        singleTon1.setNumber(101);        final SingleTon singleTon2 = SingleTon.getInstance();        singleTon2.setNumber(201);        System.out.println(singleTon1.getNumber());        System.out.println(singleTon2.getNumber());        System.out.println("--------------------------------------------");        System.out.println(singleTon1);        System.out.println(singleTon2);        System.out.println(singleTon1 == singleTon2); /*Always true*/        System.out.println(singleTon1.equals(singleTon2)); /*Also true*/    }}