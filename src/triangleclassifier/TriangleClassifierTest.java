package triangleclassifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    @DisplayName("Equilateral Triangle")
    public void equilateralTriangle(){
        double a = 2;
        double b = 2;
        double c = 2;
        String expected = "Equilateral Triangle";
        String result = TriangleClassifier.isTriangle(a,b,c);
        assertEquals(expected,result);
    }


    @Test
    @DisplayName("Isosceles Triangle")
    public void isoscelesTriangle(){
        double a = 2;
        double b = 2;
        double c = 3;
        String expected = "Isosceles Triangle";
        String result = TriangleClassifier.isTriangle(a,b,c);
        assertEquals(expected,result);
    }


    @Test
    @DisplayName("Normal Triangle")
    public void normalTriangle(){
        double a = 3;
        double b = 4;
        double c = 5;
        String expected = "Normal Triangle";
        String result = TriangleClassifier.isTriangle(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Not is triangle!")
    public void notIsTriangle1(){
        double a = 8;
        double b = 2;
        double c = 3;
        String expected = "Is not triangle";
        String result = TriangleClassifier.isTriangle(a,b,c);
        assertEquals(expected,result);
    }


    @Test
    @DisplayName("Not is triangle!")
    public void notIsTriangle2(){
        double a = -1;
        double b = 2;
        double c = 1;
        String expected = "Is not triangle";
        String result = TriangleClassifier.isTriangle(a,b,c);
        assertEquals(expected,result);
    }


    @Test
    @DisplayName("Not is triangle!")
    public void notIsTriangle3(){
        double a = 0;
        double b = 1;
        double c = 1;
        String expected = "Is not triangle";
        String result = TriangleClassifier.isTriangle(a,b,c);
        assertEquals(expected,result);
    }
}
