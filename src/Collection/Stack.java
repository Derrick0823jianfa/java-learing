package Collection;

public interface Stack {
    //把英雄推入到最后位置
    public void push(Hero h);

    //取出最后一个英雄
    public Hero pull();

    //查看最后一个英雄
    public Hero peek();
}
