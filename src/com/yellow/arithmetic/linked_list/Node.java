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

    //删除 node.value == num 的节点
    public static Node removeValue(Node<Integer> head, int num){
        while (head !=null){
            if (head.value != num)break;
            head = head.next;
        }

        //来到第一个不是num开头的节点
        Node pre = head;
        Node cur = head;

        while (cur != null){
            if ((int)cur.value == num){ //如果 当前节点的值 == num；那么 pre指向 当前节点的 下一个节点
                pre.next = cur.next;
            }
            else {  //如果值不相等，则pre 指向 当前节点
                pre = cur;
            }
            cur = cur.next; //比较完之后，当前节点 后移
        }return head;
    }
}
