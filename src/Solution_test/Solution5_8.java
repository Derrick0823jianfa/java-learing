package Solution_test; /**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution_test.Solution5_8
 * Author:   zhangjianfa
 * Date:     2020/5/7 21:17
 * Description: 5/8示例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
import java.lang.Math;
/**
 * 〈一句话功能简述〉<br> 
 * 〈5/8示例〉
 *
 * @author zhangjianfa
 * @create 2020/5/7
 * @since 1.0.0
 */
public class Solution5_8 {
    public static void main(String[] args) {
        double sum = 0.618;
        double a, b = 1;
        int c = 1, d = 1;
        for (int i = 1; i <= 20; i++){
            for (int j = 1; j <= 20; j++){
                if (i % 2 == 1 || j % 2 == 1){
                    a = i/(float) j;//两个int类相除结果为int型
                    if (Math.abs(sum - a) < b){
                        b = Math.abs(sum - a);
                        c = i;
                        d = j;

                    }
                }
            }
        }
        System.out.println("分子是 " + c + " 分母是 " + d + " 与0.618相差为 " + b);
    }
}