/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Fish
 * Author:   zhangjianfa
 * Date:     2020/6/23 13:53
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
 * 1. 创建Fish类，它继承Animal类
 * 2. 重写Animal的walk方法以表明鱼不能走且没有腿。
 * 3. 实现Pet接口
 * 4. 无参构造方法
 * 5. 提供一个private 的name属性
 */

public class Fish extends Animal implements Pet{
    private String name;

    public Fish(){
        super(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(this.name+"is playing joyful.");
    }

    @Override
    public void walk() {
        System.out.println(this.name+"can't walk.");
    }

    @Override
    public void eat() {
        System.out.println(this.name+"is eating joyful.");
    }
}
