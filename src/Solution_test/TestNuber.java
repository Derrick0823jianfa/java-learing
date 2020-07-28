/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestNuber
 * Author:   zhangjianfa
 * Date:     2020/6/23 14:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solution_test;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/23
 * @since 1.0.0
 */
public class TestNuber {

    public int method2(int a){
        int sum=0;
        for(int i=2;i<=a;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0&&i!=j){  //排除所有在i=k之前的能被k整除(余数为0)的数  ,这里输出后有余数不为0的数
                    break;
                }else if(i%j==0){//这里余数要为0
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        TestNuber z = new TestNuber();
        System.out.println(z.method2(10000000));
        int i = 1;
        String s = String.valueOf(i);
        System.out.println(s);
        float a = 3.14f;

        String b = String.valueOf(a);
        System.out.println(b);

        Float c = a;
        String d = c.toString();
        System.out.println(d);

        String e = "3.14";
        float f = Float.parseFloat(e);
        System.out.println(f);

        float g = 5.4f;
        float h = 5.5f;
        System.out.println(Math.round(g));
        System.out.println(Math.round(h));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.abs(-3));



    }

}
