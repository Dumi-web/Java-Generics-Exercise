public class genericsMethod {

    static Integer[] intArray  = {12,324,6,7900};
    static String[] array = {"I","Love","Coding"};

    public static <T> void printArrayContent(T[]Array){
        for(T elements: Array){
            System.out.println(elements+"");
        }
        System.out.println("");
    }
}
