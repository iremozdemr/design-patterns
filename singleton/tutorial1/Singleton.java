public class Singleton{
    private static volatile Singleton object;
    private String data;

    private Singleton(String data){
        this.data = data;
    }
    //constructor'ın sadece bu sınıfın içinde kullanılmasını sağlar
    //başka bir sınıfta bu method çağrılıp obje oluşturulamaz

    public static Singleton getObject(String data){
        if(object == null){
            synchronized(Singleton.class){
                if(object == null){
                    object = new Singleton(data);
                }
            }
        }
        return object;
    }
}