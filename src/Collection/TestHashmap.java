/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestHashmap
 * Author:   zhangjianfa
 * Date:     2020/7/19 16:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.HashMap;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/19
 * @since 1.0.0
 */
public class TestHashmap {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<>();
        HashMap<String,String> newDictinary = new HashMap<>();
        dictionary.put("adc","物理英雄");
        dictionary.put("apc","魔法英雄");
        dictionary.put("t","坦克");
        System.out.println(dictionary);
        Set<String> keys = dictionary.keySet();
        for(String key:keys){
            String value = dictionary.get(key);
            newDictinary.put(value,key);
        }
        System.out.println(newDictinary);

    }
}
