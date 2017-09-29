
package Source;
public class Cubo {
    public static float getAreaLado(float a){
        return (float) Math.pow(a, 2);
    }
    public static float getAreaLateral(float a){
        return 4 * (float) Math.pow(a, 2);
    }
    public static float getAreaTotal(float a){
        return 6 * (float) Math.pow(a, 2);
    }
    public static float getVolume(float a){
        return (float) Math.pow(a, 3);
    }
}
