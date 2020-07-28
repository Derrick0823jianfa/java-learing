/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestNode
 * Author:   zhangjianfa
 * Date:     2020/7/16 21:42
 * Description: 测试二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试二叉树〉
 *
 * @author zhangjianfa
 * @create 2020/7/16
 * @since 1.0.0
 */
public class TestNode {
    //左子节点
    public TestNode leftNode;
    //右子节点
    public TestNode rightNode;
    //当前值
    public Object value;

    //插入数据
    public void add(Object data) {
        //如果当前节点没有值，那就把数据放在当前节点
        if (value == null)
            value = data;
            //如果有值就进行判断
        else {
            //如果新增的值比当前值小或者相同
            if ((int) data - ((int) value) <= 0) {
                if (leftNode == null)
                    leftNode = new TestNode();
                leftNode.add(data);
            }
            //如果新增值比当前值大
            else {
                if (rightNode == null)
                    rightNode = new TestNode();
                rightNode.add(data);
            }
        }
    }

    //中序遍历
    public List<Object> values() {
        List<Object> values = new ArrayList<>();
        if (leftNode != null)
            values.addAll(leftNode.values());
        values.add(value);
        if (rightNode != null)
            values.addAll(rightNode.values());
        return values;
    }

    public static void main(String[] args) {
        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };

        TestNode roots = new TestNode();
        for (int number : randoms) {
            roots.add(number);
        }
        System.out.println(roots.values());
    }
}