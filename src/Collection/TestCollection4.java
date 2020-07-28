/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestCollection4
 * Author:   zhangjianfa
 * Date:     2020/7/15 21:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈首先初始化一个Hero集合，里面放100个Hero对象，名称分别是从
 * hero 0
 * hero 1
 * hero 2
 * ...
 * hero 99.
 *
 * 通过遍历的手段，删除掉名字编号是8的倍数的对象〉
 *
 * @author zhangjianfa
 * @create 2020/7/15
 * @since 1.0.0
 */
public class TestCollection4 {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            heros.add(new Hero("hero"+i));
        }
        System.out.println(heros.size());

        int arg = 0;
        //remove后，各个元素的索引会变小
        //用arg标注已经删除了几个8的倍数
        for (int i = 0; i < heros.size(); i+=8) {
            heros.remove(i-arg);
            arg+=1;
        }
        System.out.print(heros);
    }


}
