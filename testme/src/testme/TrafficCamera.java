package testme;
import java.util.*;

public class TrafficCamera {

    private int rootIndex = 0;
    private int largestId = 0;
    private int sortedSubtreeDiameters[] = new int[50001];
    private Node nodeMap[] = new Node[50001];
    private boolean visited[] = new boolean[50001];
    private int diameter[] = new int[50001];

    static class Node {
        public int id;
        public List<Integer> edgeList;
        public Node(int v) {
            this.id = v;
            edgeList = new ArrayList<Integer>();
        }
        public void addEdge(Integer t) {
            edgeList.add(t);
        }
    }

    public int solution(int[] A, int[] B, int K) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (nodeMap[A[i]] == null) {
                nodeMap[A[i]] = new Node(A[i]);
            }
            if (nodeMap[B[i]] == null) {
                nodeMap[B[i]] = new Node(B[i]);
            }
            final Node na = nodeMap[A[i]];
            final Node nb = nodeMap[B[i]];
            na.addEdge(B[i]);
            nb.addEdge(A[i]);
            largestId = Math.max(largestId, A[i]);
            largestId = Math.max(largestId, B[i]);
        }

        rootIndex = A[0];
        int res = Integer.MAX_VALUE;

        int low = 0, high = Math.min(900, largestId);
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isAvailabel(K, mid)) {
                res = Math.min(res, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public boolean isAvailabel(int cameraLimit, int notCoveredLength) {
        for (int i = 0; i < visited.length; i++) visited[i] = false;
        for (int i = 0; i < diameter.length; i++) diameter[i] = -1;
        if (dfs(nodeMap[rootIndex], notCoveredLength) > cameraLimit) {
            return false;
        }
        return true;
    }

    private int dfs(Node node, int limit) {
        if (node == null || visited[node.id]) {
            return 0;
        }

        visited[node.id] = true;

        int counter = 0;
        for (Integer id : node.edgeList) {
            counter += dfs(nodeMap[id], limit);
        }

        /*
                      @
                    /  \
                  @      @(current)
                / \    / \\\
               @  @    a b c d

         step 1: Sort diameters of subtrees in reverse order, store them in an array
         step 2: For each adjacent pair in the sorted array, e.g. (a, b), (b, c), (c, d).
            If a + b + 2 > limit, we break the edge connecting current node to a, and counter plus 1.
            Do the same for (b, c) and (c, d). Note that, if (a, b) passed the test, we don't need to anymore
            because (a, b) is the largest pair of them.
         step 3: For last child d. or if current node has only one child.
            If d + 1 > limit, we break the edge connecting current node to a, and counter plus 1.
         step 4: Set diameter of current node to the largest one of the remains(not broken ones).

         */

        /* step 1 */
        int n = 0;
        for (Integer id : node.edgeList) {
            if (diameter[id] != -1) {
                sortedSubtreeDiameters[n++] = (diameter[id]);
            }
        }

        Arrays.sort(sortedSubtreeDiameters, 0, n);
        for (int i = 0; i < n / 2; i++) { // reverse order
            int temp = sortedSubtreeDiameters[i];
            sortedSubtreeDiameters[i] = sortedSubtreeDiameters[n - 1 - i];
            sortedSubtreeDiameters[n - 1 - i] = temp;
        }

        /* step 2 */
        int maxDiameterAfterRemoval = -1;
        for (int i = 0; i < n - 1; i++) {
            if (sortedSubtreeDiameters[i] + sortedSubtreeDiameters[i+1] + 2 > limit) {
                counter++;
            } else {
                maxDiameterAfterRemoval = Math.max(maxDiameterAfterRemoval, sortedSubtreeDiameters[i]);
                break; // Even the largest pair is in the limit, we don't need check the remaining pairs.
            }
        }

        /* step 3 */
        if (n >= 1) {
            int i = n - 1;
            if (sortedSubtreeDiameters[i] + 1 > limit) {
                counter++;
            } else {
                maxDiameterAfterRemoval = Math.max(maxDiameterAfterRemoval, sortedSubtreeDiameters[i]);
            }
        }

        /* step 4 */
        // if subtrees are all removed, we can treat current node as a leaf, so diameter becomes 0
        if (maxDiameterAfterRemoval == -1) {
            diameter[node.id] = 0;
        } else { // if still some subtrees remain, then set current node's diameter as one plus the largest
            diameter[node.id] = maxDiameterAfterRemoval + 1;
        }

        return counter;
    }
    
    public static void main(String []args){
    	

    		int A[]={5,1,0,2,7,0,6,6,1};
    		int B[]={1,0,7,4,2,6,8,3,9};
    				TrafficCamera x = new TrafficCamera();
    				x.solution(A, B, 2);
    }

}