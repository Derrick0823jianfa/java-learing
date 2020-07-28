/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: LifePotion
 * Author:   zhangjianfa
 * Date:     2020/6/21 22:14
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
public class LifePotion extends Item {

    @Override //重写
    public void effect(){
        System.out.println("血瓶使用后可以回血");
    }
    public boolean disposable(){
        super.xueping = "已使用血瓶";
        return true;
    }

    public static void main(String[] args) {
        LifePotion h = new LifePotion() ;
        System.out.println(h.disposable()+h.xueping);
    }
}
