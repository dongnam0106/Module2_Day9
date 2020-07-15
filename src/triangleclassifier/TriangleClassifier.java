package triangleclassifier;

public class TriangleClassifier {
    public static String isTriangle(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) return "Is not triangle";
        if (a + b <= c || b + c <= a || a + c <= b) return "Is not triangle";
        if (a == b || a == c || b == c) return "Sosceles Triangle";
        if (a == b && b == c) return "Equilateral Triangle";
        return "Normal triangle";
    }
}
