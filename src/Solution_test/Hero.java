package Solution_test; /**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution_test.Hero
 * Author:   zhangjianfa
 * Date:     2020/6/14 15:52
 * Description: 6.14 test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈6.14 test〉
 *
 * @author zhangjianfa
 * @create 2020/6/14
 * @since 1.0.0
 */
public class Hero {

    String name; //姓名


    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度
    static String copyright; //版本
    public Hero(){
    } //私有化构造方法

    private static Hero instance = new Hero();
    public static Hero getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Hero h1 = Hero.getInstance();
        Hero h2 = Hero.getInstance();

        System.out.println(h1==h2);


    }

}