package charactor;

public interface AP {

    //resistMagic即便没有显式的声明为 public static final
    //但依然默认为public static final
    int resistMagic = 0;
    void magicAttack();
    //魔法攻击
    default public void  attack(){
        System.out.println("magic danger is happening");
    }

}
