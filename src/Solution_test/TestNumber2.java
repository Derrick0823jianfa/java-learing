/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestNumber2
 * Author:   zhangjianfa
 * Date:     2020/6/23 15:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solution_test;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/23
 * @since 1.0.0
 */
public class TestNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入地名");
        String adress = scanner.nextLine();
        System.out.println("请输入公司类型、名字");
        String type = scanner.nextLine();
        System.out.println("请输入老板");
        String boss = scanner.nextLine();
        System.out.println("请输入金额");
        String money = scanner.nextLine();
        System.out.println("请输入产品");
        String product = scanner.nextLine();
        System.out.println("请输入价格计量单位");
        String unit = scanner.nextLine();

        String word = "%s最大%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，" +
                "带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，" +
                "现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，" +
                "你不发工资，你还我血汗钱，还我血汗钱!";

        System.out.printf(word,adress,type,boss,money,product,unit,unit,unit,product,boss);

    }
}