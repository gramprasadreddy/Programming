// method 1 : This is lazy instantiation. it is not thread safe
class Singleton{
    private static Singleton obj;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if (obj == null){
            obj = new Singleton();
        }
        return obj;
    }
}
// method2 : using synchronised makes sure that only one thread can execute. 
//disadvantage is using synchronized object is expensive and may decrease performance of your program


class Singleton{
    private static Singleton obj;
    private Singleton(){

    }

    public static synchronised Singleton getInstance(){
        if(obj ==null){
            obj = new Singleton
        }
        return obj;
    }
}

// method 3: eager instantiation
// singleton is static initializer
// JVM executes a static intializer when the class is loaded and gauranteed to thread safe
// to use when singleton method is light and used throughout the application 
class Singleton{

    private static Singleton obj = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){

        return obj;
    }
}
// method 4
//  Most efficient, use double checking
// an object is created synchronization is no longer useful because now obj will not be null and any sequence of oeprations will lead to consistent results, So we will
//  only acquire the lock on the getInstance() when the obj is null 

class Singleton{
    private static Singleton obj;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if (obj == null){
            synchronised(Singleton.class){
                if (obj ==null){
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }
}

// method 5
//  Java specific, Instantiation through Inner class, Using class loading concept
// classes are loaded only one time in memory by JDK
// inner classes in java are loaded in memory by jdk when it comes into scope of usage

class Singleton{
    private static Singleton obj;

    private Sigleton(){
        System.out.println("Instance is created")
    }
    private static class SigletonInner{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingleTonInner.INSTANCE;
    }
}