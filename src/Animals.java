import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: CH
 * Date: 14-4-8
 * Time: 下午11:38
 * To change this template use File | Settings | File Templates.
 */
public class Animals {
    private Animals(){}
    private static final Map<String,Provider> providers= new ConcurrentHashMap<String,Provider>();
    public static final  String DEFAULT = "<def>";
    public static void registerDefaultProvider(Provider p){
        registerProvider(DEFAULT,p);
    }

    public static void registerProvider(String name,Provider p){
        providers.put(name,p);
    }

    public static Animal newInstance(){
        return newInstance(DEFAULT);
    }

    public static Animal newInstance(String name){
        Provider p = providers.get(name);
        if(p == null){
            throw new IllegalArgumentException(" no provider : "+name);
        }
        return p.newAnimal();
    }
}
