
class CompareUtil {

    // Generic method untuk membandingkan dua nilai
    public static <T extends Comparable<T>>
    boolean isEqual(T a, T b) {

        return a.compareTo(b) == 0;
    }
}

// Program utama
public class handson5 {
    public static void main(String[] args) {

        System.out.println("=== PERBANDINGAN DATA ===");

        // Membandingkan Integer
        System.out.println(
            "Integer: " + CompareUtil.isEqual(5, 5)
        );

        // Membandingkan String
        System.out.println(
            "String: " +
            CompareUtil.isEqual("Hello", "World")
        );

        // Membandingkan Double
        System.out.println(
            "Double: " +
            CompareUtil.isEqual(3.14, 3.14)
        );

        // Membandingkan Character
        System.out.println(
            "Character: " +
            CompareUtil.isEqual('A', 'A')
        );
    }
}
