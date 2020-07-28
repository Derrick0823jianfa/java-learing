/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Weapon
 * Author:   zhangjianfa
 * Date:     2020/6/22 16:01
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
 * @create 2020/6/22
 * @since 1.0.0
 */
public class Weapon extends Item {
    @Override
    public boolean disposable(){
        super.weapon = "已使用子弹";
        return false;
    }

    public static void main(String[] args) {
        Weapon h = new Weapon();
        System.out.println(h.disposable()+h.weapon);
    }

}
