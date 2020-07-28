/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MagicPotion
 * Author:   zhangjianfa
 * Date:     2020/6/21 22:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package property;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/21
 * @since 1.0.0
 */
public abstract class MagicPotion extends Item {

    @Override //重写
    public void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }

}
