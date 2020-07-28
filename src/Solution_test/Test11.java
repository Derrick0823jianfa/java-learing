/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test11
 * Author:   zhangjianfa
 * Date:     2020/6/25 10:36
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
 * @create 2020/6/25
 * @since 1.0.0
 */

//第二题，寻找首字母为p的单词个数
public class Test11 {
    public static void main(String[] args) {
        String string1 = "peter piper picked a peck of pickled peppers";
        String string2[] = string1.split(" ");
        int num = 0;
        for(String sub:string2){
            if(sub.charAt(0) =='p')
                num+=1;
        }
        System.out.print(num);

    }

}
