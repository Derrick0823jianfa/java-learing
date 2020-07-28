package charactor;

public interface Mortal {
    public void die();

    //默认方法
    default public void revive(){
        System.out.println("Solution_test.Hero is revive.");
    }
}
