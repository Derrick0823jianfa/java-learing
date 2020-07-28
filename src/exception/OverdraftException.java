/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: OverdraftException
 * Author:   zhangjianfa
 * Date:     2020/7/3 15:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package exception;

/**
 * 〈一句话功能简述〉<br> 
 * 〈透支异常，继承自Exception〉
 *
 * @author zhangjianfa
 * @create 2020/7/3
 * @since 1.0.0
 */
public class OverdraftException extends Exception {
    private double deficit; //属性：透支额
    public OverdraftException(String message,double deficit){
        //调用父类的带有一个字符串参数的构造器,这个字符串作为该异常对象的描述信息,
        // 就像前一节的(h.name + "已经挂了,别放技能了),也就是异常对象的 getMessage() 方法的返回值。
        super(message);
        this.deficit = deficit;
    }
    public double getDeficit(){
        return this.deficit;
    }

}
