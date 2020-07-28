/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestHashset
 * Author:   zhangjianfa
 * Date:     2020/7/19 17:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/19
 * @since 1.0.0
 */
public class TestHashset {
    public static void main(String[] args) {
        //set中的元素不能重复
        Set<Integer> lhs = new LinkedHashSet<>();
        String str = String.valueOf(Math.PI);
        str = str.replace(".","");
        System.out.println(str);
        char [] cs = str.toCharArray();
        for(char c:cs){
            int num = Integer.parseInt(String.valueOf(c));
            lhs.add(num);
        }
        System.out.println(lhs);
    }
}
