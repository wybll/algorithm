package com.yellow.arithmetic.linked_list;

/**
 * @Description 单链表
 * @Author backen
 * @Date 2021/2/22 22:03
 */
public class Node<T> {

    //1、本身有值
    public T value;
    //2、有指向下个节点的指针（记录了下个节点的地址）
    public Node next;

    public Node(T value) {
        this.value = value;
    }

    //反转单链表
    public static Node reverseLinkedList(Node head){
         Node next = null;
         Node pre = null;
         while (head != null){
             next = head.next;
             head.next = pre;
             pre = head;
             head = next;
         }
         return  pre;
    }
}
