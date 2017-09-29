//抽象工厂模式：针对 多个产品等级结构。
public class Test {

    public  void eat(KitchenFactory k){
        System.out.print("A foodaholic is eating " + k.getFood().getFoodName()+" with "+
        k.getTableWare().getToolName());
    }

    public  static  void main (String[] args){
        Test t = new Test();
        KitchenFactory kf = new AKitchen();
        t.eat(kf);
    }

}
