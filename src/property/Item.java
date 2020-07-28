/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution_test.Item
 * Author:   zhangjianfa
 * Date:     2020/6/21 22:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package property;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/21
 * @since 1.0.0
 */
public abstract class Item {
    String name;
    int price;
    String xueping;
    String weapon;

    public abstract boolean disposable(); // 抽象方法

    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后起效果了");
    }

    public static void main(String[] args) {
        Item i = new Item() {
            @Override
            public boolean disposable() {
                System.out.println("test");
                return false;
            }
        };
        i.disposable();
    }
}
