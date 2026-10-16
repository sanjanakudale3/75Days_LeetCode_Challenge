/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans ;
        }

        Queue<TreeNode> q = new LinkedList<>();    // queue madhe sgl add kr...
        q.offer(root);

        while( !q.isEmpty()){
            int size = q.size();

            List<Integer> list = new ArrayList<>();

            for(int i = 0; i<size; i++){

                TreeNode temp = q.poll();      //current temp jithe aahe te add kar
                list.add(temp.val);

                if(temp.left != null){          //left root aahe ka baghaycha
                    q.offer(temp.left);
                }

                if(temp.right != null){            //right root aahe ka bghyacha
                    q.offer(temp.right);
                }

                
            }
            ans.add(list);                 //list la dd kar ans madhe ...becuase we are returning ans 

        }
    return ans;        
    }
}