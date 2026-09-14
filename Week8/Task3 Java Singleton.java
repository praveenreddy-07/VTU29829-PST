class Singleton {

    private static Singleton instance;

    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
