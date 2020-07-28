/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MyStringBuffer
 * Author:   zhangjianfa
 * Date:     2020/6/26 23:23
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
 * @create 2020/6/26
 * @since 1.0.0
 */
public class MyStringBuffer implements IStringBuffer {
    int capacity = 16;
    int length = 0;
    char[] value;
    //无参构造方法，初始化value数组
    public MyStringBuffer(){
        value = new char[capacity];
    }
    //带参构造方法
    public MyStringBuffer(String str){
        this();
        if(str == null)
            return;

        if(capacity<str.length()) {
            capacity = value.length * 2;
            value = new char[capacity];
        }

        if(capacity>=str.length())
            System.arraycopy(str.toCharArray(),0,value,0,str.length());

        length = str.length();
    }

    @Override
    public void append(String str){


    }

    @Override
    public void append(char c){

    }

    @Override
    public void insert(int pos, String str) {
        if(pos<0)
            return;
        if(pos>length)
            return;
        if(null == str)
            return;
        while (length+str.length()>capacity){
            capacity = (int)((length+str.length())*1.5f);
            char newvalue[] = new char[capacity];
            System.arraycopy(value,0,newvalue,0,length);
            value = newvalue;
        }
        char cs[] = str.toCharArray();
        //
        System.arraycopy(value,pos,value,pos+cs.length,length-pos);
        System.arraycopy(cs,0,value,pos,cs.length);

        length = length+cs.length;

    }

    @Override
    public void insert(int pos, char c) {

    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {

    }

    @Override
    public void reverse() {
        for (int i = 0; i < length/2; i++) {
            char tmp = value[i];
            value[i] = value[length-i-1];
            value[length-i-1] = tmp;
        }
    }

    @Override
    public int length() {
        return 0;
    }

    public static void main(String[] args) {
        MyStringBuffer sb = new MyStringBuffer("I am zhangjianfa.");

        sb.reverse();
        System.out.println(sb);
    }



}
