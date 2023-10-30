package method;

public class Pr_Methods_Exple {
    public Pr_Methods_Exple() {
    }

    static void pattern1(int var0) {
        for (int var1 = 0; var1 < var0; ++var1) {
            for (int var2 = var0 - var1; var2 > 0; --var2) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }

    static String logic(String var0, String var1) {
        return var0.concat(var1);
    }

    public static void main(String[] var0) {
        pattern1(4);
        String var1 = "Akash";
        String var2 = "Jan";
        String var3 = logic(var1, var2);
        System.out.println(var3);
    }
}
