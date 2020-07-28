package Solution_test; /**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution_test.Solution6_20
 * Author:   zhangjianfa
 * Date:     2020/6/20 17:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/20
 * @since 1.0.0
 */
public class Solution6_20 {
    public static void main(String[] args) {
        for (HeroType s : HeroType.values()) {
            System.out.print(s + "=");
            switch (s) {
                case TANK:
                    System.out.println("坦克");
                    break;
                case WIZARD:
                    System.out.println("法师");
                    break;
                case ASSASSIN:
                    System.out.println("刺客");
                    break;
                case ASSIST:
                    System.out.println("辅助");
                    break;
                case WARRIOR:
                    System.out.println("近战");
                    break;
                case RANGED:
                    System.out.println("远程");
                    break;
                case PUSH:
                    System.out.println("推进");
                    break;
                case FARMING:
                    System.out.println("打野");
                    break;

            }

        }
    }
}
