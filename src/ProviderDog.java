/**
 * Created with IntelliJ IDEA.
 * User: CH
 * Date: 14-4-8
 * Time: 下午11:50
 * To change this template use File | Settings | File Templates.
 */
public class ProviderDog implements Provider{

    @Override
    public Animal newAnimal() {
        return new Dog();
    }
}
