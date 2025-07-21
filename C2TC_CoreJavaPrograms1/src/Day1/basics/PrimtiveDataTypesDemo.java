package Day1.basics;

public class PrimtiveDataTypesDemo {

    public static void main(String[] args) {
        // byte - 1 byte
        byte byteMax = 127;
        byte byteMin = -128;
        System.out.println("Min range of byte is " + byteMin + " and Max range of byte is " + byteMax);

        // short - 2 bytes
        short shortMax = 32767;
        short shortMin = -32768;
        System.out.println("Min range of short is " + shortMin + " and Max range of short is " + shortMax);

        // int - 4 bytes
        int maxInt = 2147483647;
        int minInt = -2147483648;
        System.out.println("Min range of int is " + minInt + " and Max range of int is " + maxInt);

        // long - 8 bytes
        long maxLong = 9223372036854775807L;
        long minLong = -9223372036854775808L;
        System.out.println("Min range of long is " + minLong + " and Max range of long is " + maxLong);

        // float - 4 bytes
        float f = 3234.141243278345f;
        // double - 8 bytes
        double d = 3456.14124512345678902345678914;
        System.out.println("Float value is " + f + " and Double value is " + d);

        // boolean
        boolean flag = false;
        System.out.println("Boolean value is " + flag);
    }
}
