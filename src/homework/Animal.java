/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Animal
 * Author:   zhangjianfa
 * Date:     2020/6/23 11:08
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
        1. 创建Animal类，它是所有动物的抽象父类。
        2. 声明一个受保护的整数类型属性legs，它记录动物的腿的数目。
        3. 定义一个受保护的构造器，用来初始化legs属性。
        4. 声明抽象方法eat。
        5. 声明具体方法walk来打印动物是如何行走的（包括腿的数目)
 */

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("有"+legs+"条腿");
    }


}
