public class Typeconversion {
    public static void main(String[] args) {
        int a = 10;

        //type of b is byte and what is type of 10? int
        // byte(small) = int(big)
        //byte b = 10;
        //here int is converted into byte automatically- implicit conversion
        byte b = 127;

        byte b2 = (byte) 12444448;
        System.out.println(b2);

        //decimals
        //price type is float
        //10.5 type is double
        //apply explicit conversion
        //syntax-1
//        float price =(float)10.5;
        float price = 10.5f; //here f will convert double to float
        System.out.println(price);

    }
}
