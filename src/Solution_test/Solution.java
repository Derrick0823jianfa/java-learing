package Solution_test; /**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution_test.Solution
 * Author:   zhangjianfa
 * Date:     2020/3/28 13:06
 * Description: leetcode刷题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈leetcode刷题〉
 *
 * @author zhangjianfa
 * @create 2020/3/28
 * @since 1.0.0
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        while(true) {
            try {
                System.out.println("请输入身高(m):");
                Scanner s = new Scanner(System.in);
                float height = s.nextFloat();
                System.out.println("请输入体重(kg):");
                float weight = s.nextFloat();
                float BMI = weight / (height * height);
                System.out.println("当前的身高体重指数(BMI)为:" + BMI);
                if(BMI<18.5){
                    System.out.println("您的体重过轻");
                }
                else if(BMI>=18.5&&BMI<24){
                    System.out.println("您的体重正常");
                }
                else if(BMI>=24&&BMI<27){
                    System.out.println("您的体重过重");
                }
                else if(BMI>=27&&BMI<30){
                    System.out.println("您的体重是轻度肥胖");
                }else if(BMI>=30&&BMI<35){
                    System.out.println("您的体重是中度肥胖");
                }
                else{
                    System.out.println("您的体重重度肥胖");
                }
            }
            catch (Exception e){
                System.out.println("您的输入数据有误");
                //在命令行打印异常信息和在程序中出错的位置及原因。
                e.printStackTrace();
            }
        }

    }
}