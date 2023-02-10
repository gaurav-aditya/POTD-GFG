Problem Link:
https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1

public static Node addOne(Node head) 
    { 
        int carry=addRec(head);
        if(carry==1){
            Node newHead=new Node(1);
            newHead.next=head;
            return newHead;
        }
        return head;
    }
    
    public static int addRec(Node node){
        if(node==null){
            return 1;
        }
        
        int sum=node.data+addRec(node.next);
        node.data=sum%10;
        return sum/10;
    }
