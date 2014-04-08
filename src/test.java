/**
 * Created with IntelliJ IDEA.
 * User: CH
 * Date: 14-4-8
 * Time: 下午11:51
 * To change this template use File | Settings | File Templates.
 */
public class test {
    public static void main(String[] args){
        Animals.registerProvider("Dog",new ProviderDog());
        Animals.registerProvider("Cat",new ProviderCat());
        Animals.newInstance("Dog").Run();
    }
}
