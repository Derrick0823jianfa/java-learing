/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CheckingAccount
 * Author:   zhangjianfa
 * Date:     2020/7/3 15:43
 * Description: 具备透支功能的账户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package exception;

/**
 * 〈一句话功能简述〉<br> 
 * 〈具备透支功能的账户〉
 *
 * @author zhangjianfa
 * @create 2020/7/3
 * @since 1.0.0
 */
public class CheckingAccount extends Account{
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }
    public CheckingAccount(double balance,double protect){
        super(balance);
        this.overdraftProtection = protect;
    }

    @Override
    public void withdaw(double amt) throws OverdraftException{
        if(amt>this.balance+this.overdraftProtection)
            throw new OverdraftException("透支了",amt-this.balance-this.overdraftProtection);
    }

    public static void main(String[] args) {
        CheckingAccount CA = new CheckingAccount(10000,15000);
        try {
            CA.withdaw(28000);
            System.out.println("账户还有透支额度");
        }
        catch (OverdraftException o){
            System.out.println(o.getMessage()+o.getDeficit()+"元");
            o.printStackTrace();
        }
    }


}
