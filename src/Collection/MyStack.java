/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MyStack
 * Author:   zhangjianfa
 * Date:     2020/7/16 20:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈利用LinkedList实现栈,先入后出〉
 *
 * @author zhangjianfa
 * @create 2020/7/16
 * @since 1.0.0
 */
public class MyStack implements Stack {
    LinkedList<Hero> ll = new LinkedList<>();

    @Override
    public void push(Hero h) {
        ll.addLast(h);
    }

    @Override
    public Hero pull() {
        return ll.removeLast();
    }

    @Override
    public Hero peek() {
        return ll.getLast();
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        for (int i = 0; i < 5; i++) {
            ms.push(new Hero("hero"+i));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(ms.pull());
        }
    }
}
