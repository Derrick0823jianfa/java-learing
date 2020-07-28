/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Hero
 * Author:   zhangjianfa
 * Date:     2020/7/14 20:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/14
 * @since 1.0.0
 */
public class Hero implements Lol {
    String name;
    @Override
    public void attack(){
        System.out.println("Hero 执行了攻击");
    }
    public Hero(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }

}
