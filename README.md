# Hillel-Java-Homework-8

## **Task 1:** Число Фибоначи

Написать метод который возвращает N-ное число фибоначи, по правилу:  
'''
F(0) = 0, F(1) = 1

F(N) = F(N - 1) + F(N - 2)
'''
## **Task 2*:** 
Написать метод для обьединения 2 бинарных дерева:  

https://www.dropbox.com/s/lrblb3vjfi1qkwm/tree.png?dl=0

В качестве параметра передается 2 ссылки на корневые узлы девева TreeNode, результат - корневой узел нового дерева TreeNode.
```
public class TreeNode {

  int val;

  TreeNode left;

  TreeNode right;

  TreeNode(int x) { val = x; }

}

public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {...}
```
### **Пример как построить дерево:**
```
TreeNode root = new TreeNode(1);
root.left =  new TreeNode(3);
root.right =  new TreeNode(2);
root.left.left =  new TreeNode(5);
```
