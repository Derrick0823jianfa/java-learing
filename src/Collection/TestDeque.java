/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestDeque
 * Author:   zhangjianfa
 * Date:     2020/7/16 20:09
 * Description: 测试双向队列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试双向链表〉
 *
 * @author zhangjianfa
 * @create 2020/7/16
 * @since 1.0.0
 */
public class TestDeque {
    public static void main(String[] args) {
        LinkedList<Hero> heros = new LinkedList<>();
        Deque<Hero> q = new LinkedList<>();

        heros.addLast(new Hero("hero1"));
        heros.addLast(new Hero("hero2"));
        heros.addLast(new Hero("hero3"));
        System.out.println(heros);

        heros.addFirst(new Hero("heroFirst"));
        System.out.println(heros);

        System.out.println(heros.getFirst());
        System.out.println(heros.getLast());
        System.out.println(heros.removeFirst());
        System.out.println(heros.removeLast());
        System.out.println(heros);
    }

}
