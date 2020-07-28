package charactor;

public interface IStringBuffer {
    public void append(String str);  //追加字符串
    public void append(char c); //追加字符
    public void insert(int pos,String str); //在指定位置插入字符串
    public void insert(int pos,char c); // 在指定位置插入字符
    public void delete(int start); // 从起始位置删除
    public void delete(int start,int end); //从起始位置删除到end-1
    public void reverse(); //反转
    public int length();  //返回长度



}
