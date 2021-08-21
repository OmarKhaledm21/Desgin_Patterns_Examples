public class ExampleSingleton {
    //The class variable is null if no instance is instantiated.
    private static ExampleSingleton uniqueInstance = null;
    private String setting;

    private ExampleSingleton(){}

    //lazy construction of the instance.
    public static ExampleSingleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }

    public void setSetting(String s){
        setting=s;
    }

    public void getSetting(){
        System.out.println(setting);
    }
}
