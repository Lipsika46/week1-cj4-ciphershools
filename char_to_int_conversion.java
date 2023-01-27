package week1_cj4_cipherschool;

public class char_to_int_conversion {
    public static void main(String[] args){
        char ch = 'a';
        System.out.println(ch);

        int a = Character.getNumericValue('a');
        System.out.println("A: " + a);

        char c = 'a';
        int ax = c;
        System.out.println(ax);

        System.out.println((int)('a'));
        System.out.println((int)('A'));

        char c3 = 'b';
        int e = c3 + 'a';
        System.out.println("E: " + e);

    }


}