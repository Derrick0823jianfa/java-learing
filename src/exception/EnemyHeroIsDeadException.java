/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: EnemyHeroIsDeadException
 * Author:   zhangjianfa
 * Date:     2020/7/3 13:53
 * Description: 自定义异常
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package exception;

/**
 * 〈一句话功能简述〉<br> 
 * 〈自定义异常〉
 *
 * @author zhangjianfa
 * @create 2020/7/3
 * @since 1.0.0
 */
//创建自定义异常，提供两个构造方法。无参和有参
public class EnemyHeroIsDeadException extends Exception {
    public EnemyHeroIsDeadException(){
    }
    public EnemyHeroIsDeadException(String msg){
        super(msg);
    }
}
