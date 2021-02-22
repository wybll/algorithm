package com.yellow.arithmetic.linked_list;

/**
 * @Description 双链表
 * @Author backen
 * @Date 2021/2/22 22:09
 */
public class DoubleNode {

    //本身有数据
    public int value;

    //有指向下个节点的指针
    public DoubleNode next;

    //也有指向上个节点的指针
    public DoubleNode last;

    public DoubleNode(int value) {
        this.value = value;
    }

    //反转双向链表
    public static DoubleNode reverseDoubleLinkedList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while(head != null){
            next = head.next;

            head.next = pre;
            head.last = next;
            pre = head;

            head = next;
        }
        return pre;
    }
}
