/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: KillThread
 * Author:   zhangjianfa
 * Date:     2020/7/24 15:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package multithread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/24
 * @since 1.0.0
 */
public class KillThread extends Thread{
    private Hero h1;
    private Hero h2;
    public KillThread(Hero h1,Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }
    public void run(){
        while (!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}
