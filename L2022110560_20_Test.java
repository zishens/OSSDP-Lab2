import org.junit.jupiter.api.Test;  
import java.util.Arrays;  
import java.util.List;  

import static org.junit.jupiter.api.Assertions.assertEquals;  

class L2022110560_20_Test {  

    /*  
     * 测试用例设计的总体原则：  
     * 1. 等价划分原则：  
     *    - 将输入值划分为有效和无效的输入，例如节点数量为1和大于1。  
     * 2. 边界值分析：  
     *    - 测试边界条件，例如最少的节点数 n = 1，和简单树结构。  
     * 3. 组合测试：  
     *    - 组合不同的边和节点以确保算法能够处理较复杂的树结构。  
     */  

    /*  
     * 测试目的：  
     * 验证从一个节点出发，生成最小高度树的功能。  
     * 测试用例：  
     * 1. 输入：n = 4, edges = [[1,0],[1,2],[1,3]]  
     * 2. 预期输出：根节点 [1]  
     */  
    @Test  
    void testFindMinHeightTrees_SimpleTree() {  
        Solution solution = new Solution();  
        int n = 4;  
        int[][] edges = {{1, 0}, {1, 2}, {1, 3}};  
        List<Integer> expected = Arrays.asList(1);  
        List<Integer> result = solution.findMinHeightTrees(n, edges);  
        assertEquals(expected, result);  
    }  

    /*  
     * 测试目的：  
     * 验证最小高度树的边界情况，n = 1。  
     * 测试用例：  
     * 1. 输入：n = 1, edges = []  
     * 2. 预期输出：根节点 [0]  
     */  
    @Test  
    void testFindMinHeightTrees_OneNode() {  
        Solution solution = new Solution();  
        int n = 1;  
        int[][] edges = {};  
        List<Integer> expected = Arrays.asList(0);  
        List<Integer> result = solution.findMinHeightTrees(n, edges);  
        assertEquals(expected, result);  
    }  

    /*  
     * 测试目的：  
     * 验证一个较复杂树的最小高度树结果。  
     * 测试用例：  
     * 1. 输入：n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]  
     * 2. 预期输出：根节点 [3, 4]  
     */  
    @Test  
    void testFindMinHeightTrees_ComplexTree() {  
        Solution solution = new Solution();  
        int n = 6;  
        int[][] edges = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};  
        List<Integer> expected = Arrays.asList(3, 4);  
        List<Integer> result = solution.findMinHeightTrees(n, edges);  
        assertEquals(expected, result);  
    }  

    /*  
     * 测试目的：  
     * 验证另一种树结构的最小高度树结果。  
     * 测试用例：  
     * 1. 输入：n = 5, edges = [[0, 1], [0, 2], [0, 3], [3, 4]]  
     * 2. 预期输出：根节点 [0, 3]  
     */  
    @Test  
    void testFindMinHeightTrees_AnotherComplexTree() {  
        Solution solution = new Solution();  
        int n = 5;  
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {3, 4}};  
        List<Integer> expected = Arrays.asList(0, 3); // 根据树的构建方式  
        List<Integer> result = solution.findMinHeightTrees(n, edges);  
        assertEquals(expected, result);  
    }  

    /*  
     * 测试目的：  
     * 验证只有两条边的树。  
     * 测试用例：  
     * 1. 输入：n = 3, edges = [[0, 1], [1, 2]]  
     * 2. 预期输出：根节点 [1]  
     */  
    @Test  
    void testFindMinHeightTrees_TwoEdgesTree() {  
        Solution solution = new Solution();  
        int n = 3;  
        int[][] edges = {{0, 1}, {1, 2}};  
        List<Integer> expected = Arrays.asList(1);  
        List<Integer> result = solution.findMinHeightTrees(n, edges);  
        assertEquals(expected, result);  
    }  
}