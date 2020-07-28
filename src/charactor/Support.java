/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Support
 * Author:   zhangjianfa
 * Date:     2020/6/21 15:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package charactor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/21
 * @since 1.0.0
 */
public abstract class Support extends Hero implements Healer {
    @Override
    public void heal(){
        System.out.println("进行了治疗");
    }
}
