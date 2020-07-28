/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test5_9
 * Author:   zhangjianfa
 * Date:     2020/5/8 17:32
 * Description: 5/9
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solution_test;

/**
 * 〈一句话功能简述〉<br> 
 * 〈5/9〉
 *
 * @author zhangjianfa
 * @create 2020/5/8
 * @since 1.0.0
 */
public class Test5_9 {
    public static void main(String[] args) {
        for (int n = 100; n <=999; n++) {
            if(n==300)
                System.out.println("n的值是300");
            int n1=n%10;
            int n2=(n-n1)%100/10;
            int n3=(n-10*n2-n1)/100;
            if((Math.pow(n1, 3)+Math.pow(n2, 3)+Math.pow(n3, 3))==n)
                System.out.println("水仙花数"+n);
        }
    }
}
