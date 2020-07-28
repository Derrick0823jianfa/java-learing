/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestHashmap2
 * Author:   zhangjianfa
 * Date:     2020/7/19 16:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/19
 * @since 1.0.0
 */
public class TestHashmap2 {
    public static void main(String[] args) {
        HashMap<String,Hero> HeroMap = new HashMap<String, Hero>();
        HeroMap.put("gareen",new Hero("gareen"));
        System.out.println(HeroMap);

        //key为gareen已经有value了，再以gareen作为key放入数据，会导致原英雄，被覆盖
        //不会增加新的元素到Map中
        HeroMap.put("gareen",new Hero("gareen2"));
        System.out.println(HeroMap);

        //清空map
        HeroMap.clear();
        Hero gareen = new Hero("gareen");
        HeroMap.put("hero1",gareen);
        HeroMap.put("hero2",gareen);

        System.out.println(HeroMap);
    }
}
