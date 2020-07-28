/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Spider
 * Author:   zhangjianfa
 * Date:     2020/6/23 11:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package homework;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/23
 * @since 1.0.0
 */

/**
 * 1. Spider继承Animal类。
 * 2. 定义默认构造器，它调用父类构造器来指明所有蜘蛛都是8条腿。
 * 3. 实现eat方法
 */

public class Spider extends Animal {
    public Spider(){
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("spider always eat bugs.");
    }
}
