/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestInsertData
 * Author:   zhangjianfa
 * Date:     2020/7/21 21:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/21
 * @since 1.0.0
 */
public class TestInsertData {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        List<Integer> m = new LinkedList<>();
        insertFirst(l,"ArraList");
        insertFirst(m,"LinkedList");
    }
    private static void insertFirst(List<Integer> l,String type){
        int total = 1000*1000;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在 %s 后面插入 %d 条数据，总共耗时间 %d 毫秒 %n",type,total,end-start);

    }
}
