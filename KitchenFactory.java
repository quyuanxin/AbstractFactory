//抽象工厂是一个父类工厂，可以创建其它工厂类。所以我们也叫它 “工厂的工厂”
public interface KitchenFactory {
    public  Food getFood();
    public TableWare getTableWare();
}
