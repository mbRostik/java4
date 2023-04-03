import java.lang.*;
import java.util.Scanner;
class DoubleVector {
	
    private double[] vector = null;
    
    public DoubleVector(double[] vector) {
        this.vector = vector;
    }

    public double multi(DoubleVector anotherVector) {
        double s = 0;
        
        for (int i = 0; i < vector.length; i++)
            s += vector[i] * anotherVector.vector[i];
        
        return s;
    }
    
    public static double multi(DoubleVector a, DoubleVector b) {
        return a.multi(b);
    }
    
    
    
    public double sum(DoubleVector anotherVector) {
        double s = 0;
        
        for (int i = 0; i < vector.length; i++)
            s += vector[i] + anotherVector.vector[i];
        
        return s;
    }
    
    public static double sum(DoubleVector a, DoubleVector b) {
        return a.sum(b);
    }
    
    
    
    public double dif(DoubleVector anotherVector) {
        double s = 0;
        
        for (int i = 0; i < vector.length; i++)
            s += vector[i] + (-anotherVector.vector[i]);
        
        return s;
    }
    
    public static double dif(DoubleVector a, DoubleVector b) {
        return a.dif(b);
    }
    
    
    
    public double multiByNum(double num) {
        double s = 0;
        
        for(int i = 0; i < vector.length; i++)
            s += vector[i] * num;
            
        return s;
    }
    
    public static double multiByNum(DoubleVector a, double num) {
        return a.multiByNum(num);
    }
    
}

public class Lab4 {
    
   
        
        public static void main(String[] args) {
            
            double[] a = {1, 2, 3, 4};
            double[] b = {1, 1, 1, 1};
            double[] c = {2, 2, 2, 2};
            
            DoubleVector v1 = new DoubleVector(a);
            DoubleVector v2 = new DoubleVector(b);
            DoubleVector v3 = new DoubleVector(c);
    
            
            
            System.out.println("v1 * v2 = " + v1.multi(v2));
            System.out.println("v1 * v2 = " + DoubleVector.multi(v1, v2));
            System.out.println("v1 * v3 = " + v1.multi(v3) + "\n");
    
            
            System.out.println("v1 + v2 = " + v1.sum(v2));
            System.out.println("v1 + v2 = " + DoubleVector.sum(v1, v2));
            System.out.println("v1 + v3 = " + v1.sum(v3) + "\n");
    
            
            System.out.println("v1 - v2 = " + v1.dif(v2));
            System.out.println("v1 - v2 = " + DoubleVector.dif(v1, v2));
            System.out.println("v1 - v3 = " + v1.dif(v3) + "\n");
    
            
            System.out.println("v1 * 3 = " + v1.multiByNum(3));
            System.out.println("v2 * 3 = " + DoubleVector.multiByNum(v2, 3));
            System.out.println("v3 * 3 = " + v3.multiByNum(3) + "\n");
        }
    }