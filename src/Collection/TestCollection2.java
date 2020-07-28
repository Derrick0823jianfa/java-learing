/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestCollection2
 * Author:   zhangjianfa
 * Date:     2020/7/13 21:46
 * Description: 测试泛型
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试泛型〉
 *
 * @author zhangjianfa
 * @create 2020/7/13
 * @since 1.0.0
 */
public class TestCollection2 {
    public static void main(String[] args) {

        //引入泛型Generic
        //声明容器的时候，就指定了这种容器，只能放Hero，放其他的就会出错
        List<Lol> genericheros = new ArrayList<>();
        genericheros.add(new Hero("jianfa"));
        genericheros.add(new Item("yaoyao"));
        System.out.println(genericheros.get(0));

        Hero h = (Hero)genericheros.get(0);
        System.out.println(h.name);
        //除此之外还能放置Hero的子类，取出数据不需要进行转型

    }

}
