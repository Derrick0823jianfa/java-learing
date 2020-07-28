/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestQueue
 * Author:   zhangjianfa
 * Date:     2020/7/16 20:21
 * Description: 测试队列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试队列〉
 *
 * @author zhangjianfa
 * @create 2020/7/16
 * @since 1.0.0
 */
public class TestQueue {
    public static void main(String[] args) {
        List ll = new LinkedList<Hero>();
        Queue<Hero> q = new LinkedList<Hero>();
        Stack<Hero> s = new Stack<>();

        System.out.println("初始化队列: \t");
        for (int i = 0; i < 5; i++) {
            q.offer(new Hero("hero"+i));
        }
        System.out.println(q);
        Hero h = q.poll();
        System.out.println(h);
        System.out.println(q);
        h = q.peek();
        System.out.println(h);
        System.out.println(q);


    }

}
