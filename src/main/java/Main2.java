public class Main2 extends GenericClass {

    public static void main(String[] args) {
        stringInstance = new GenericClass<>();
        stringInstance.set("Test");

        stringInstance.get();

        integerInstance = new GenericClass<>();
        integerInstance.set(1000);

        integerInstance.get();
    }
}
