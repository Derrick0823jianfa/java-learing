/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Account
 * Author:   zhangjianfa
 * Date:     2020/7/3 14:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package exception;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/3
 * @since 1.0.0
 */
public class Account {

    protected double balance;

    public Account(double init){
        this.balance = init;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amt){
        this.balance += amt;

    }
    public void withdaw(double amt) throws OverdraftException{
        if(amt>this.balance)
            throw new OverdraftException("账户已经透支了",amt-this.balance);
    }

    public static void main(String[] args) {
        Account a = new Account(10000);
        System.out.println(a.getBalance());
        a.deposit(10000);
        System.out.println(a.getBalance());

        try {
            a.withdaw(25000);
            System.out.println("账户还有透支额度");
        }
        catch (OverdraftException o){
            System.out.println(o.getMessage()+o.getDeficit()+"元");
            o.printStackTrace();
        }

    }
}
