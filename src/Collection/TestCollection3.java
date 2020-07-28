/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestCollection3
 * Author:   zhangjianfa
 * Date:     2020/7/14 21:02
 * Description: 遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈遍历〉
 *
 * @author zhangjianfa
 * @create 2020/7/14
 * @since 1.0.0
 */
public class TestCollection3 {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("jianfa "+ i));
        }
        System.out.println(heros);
        //第二种遍历，使用迭代器
        System.out.println("---使用while的iteator----");
        Iterator<Hero> it = heros.iterator();
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while (it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }
        for (Iterator<Hero> iterator = heros.iterator();iterator.hasNext();){
            Hero  hero = (Hero) iterator.next();
            System.out.println(hero);
        }
        //增强型for循环
        for (Hero h:heros){
            System.out.println(h);
        }
    }
}
