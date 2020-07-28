/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Cat
 * Author:   zhangjianfa
 * Date:     2020/6/23 11:36
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
 * 1. 该类必须包含String属性来存宠物的名字。
 * 2. 定义一个构造器，它使用String参数指定猫的名字；该构造器必须调用超类构造器来指明所有的猫都是四条腿。
 * 3. 另定义一个无参的构造器。该构造器调用前一个构造器（用this关键字）并传递一个空字符串作为参数
 * 4. 实现Pet接口方法。
 * 5. 实现eat方法。
 */


public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this("");
    }
    @Override
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(this.name+"is playing joyful.");
    }

    @Override
    public void eat() {
        System.out.println(this.name+"is eating joyful.");
    }

}
