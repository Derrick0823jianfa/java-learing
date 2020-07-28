/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestGeneric
 * Author:   zhangjianfa
 * Date:     2020/7/24 11:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.ArrayList;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/24
 * @since 1.0.0
 */
public class TestGeneric {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<>();
        Random r = new Random();
        num.add(3);
        num.add(5.899);
        for(Number l:num){
            System.out.println(l);
        }
    }

}
