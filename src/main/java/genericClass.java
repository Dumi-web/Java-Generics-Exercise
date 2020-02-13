class GenericClass<T> {

    public static GenericClass<String> stringInstance;
    public static GenericClass<Integer> integerInstance;
    private T t;

    public void set(T t) {
        this.t = t;
    }
    public void get() {
        System.out.println(t);
    }
}
