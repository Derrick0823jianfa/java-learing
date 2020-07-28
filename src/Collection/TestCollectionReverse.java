/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestCollectionReverse
 * Author:   zhangjianfa
 * Date:     2020/7/19 19:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试collections工具类,容器的工具类〉
 *
 * @author zhangjianfa
 * @create 2020/7/19
 * @since 1.0.0
 */
public class TestCollectionReverse {
    public static void main(String[] args) {
        //初始化Numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        int num = 0;
        for (int i = 0; i < 1000000; i++) {
            Collections.shuffle(numbers);
            if(numbers.get(0)==3&&numbers.get(1)==1&&numbers.get(2)==4)
                num++;
        }
        double rate = num/(1000000d);
        System.out.println("出现314的概率是："+rate*100+"%");

        /*Collections.sort(numbers);
        System.out.println(numbers);
        Collections.swap(numbers,0,5);
        System.out.println(numbers);
        Collections.rotate(numbers,2);

        //synchronizedList 把非线程安全的List转换为线程安全的List。
        System.out.println("把非线程安全的List转换为线程安全的List");
        List<Integer> synchornizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);
         */


    }
}
