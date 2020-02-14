public class genericsMethod {

    static Object[] array= new Object[]{12,324,7900,"I","Love","Coding"};

    public static <T> void printArrayContent(T[]Array){
        for(T elements: Array){
            System.out.println(elements);
        }
    }
}
