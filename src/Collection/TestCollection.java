/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestCollection
 * Author:   zhangjianfa
 * Date:     2020/7/12 20:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.HashSet;
/**
 * 〈一句话功能简述〉<br> 
 * 〈容器类ArrayList用于存放对象〉
 *
 * @author zhangjianfa
 * @create 2020/7/12
 * @since 1.0.0
 */
public class TestCollection {
    public static void main(String[] args) {

        HashSet<Integer> numberSet = new HashSet<>();
        System.out.println("----------HashSet-----------");
        while (numberSet.size()<50)
            numberSet.add((int)(Math.random()*10000));
        System.out.println("得到不重复的50个随机数");
        System.out.println(numberSet);

    }

}
