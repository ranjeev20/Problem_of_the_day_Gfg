

/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
    class GfG
    {
        Node flatten(Node root)
        {
        // Your code here
        if(root == null || root.next == null) return root;
        
        root.next = flatten(root.next);
        root  = merge_two_sorted(root, root.next);
        return root;
        
        }
        
        Node merge_two_sorted(Node x, Node y){
            if(x==null) return y;
            if(y==null) return x;
            
            Node ans;
            if(x.data < y.data){
                ans = x;
                ans.bottom  = merge_two_sorted(x.bottom, y);
            }
            else{
                ans = y;
                ans.bottom  = merge_two_sorted(x, y.bottom);
            }
            return ans;
        }
    }