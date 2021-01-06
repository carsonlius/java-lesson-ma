### 2021.01.06 交流内容


##### 字符串

1. 字符串为什么不可以变?
    + 怎么理解没有提供修改内容的方法？
2. 字符串比较为什么要用equals而不用==?
    + 可以看下String.equals的重写方法
    
##### StringBuilder

1. StringBuilder和StringBuffer的区别?
    
##### StringJoiner

1. 使用String.join()替换, 功能类似于php join

##### 包装类型

1.  包装类有哪些？
2.  java自动拆箱,装箱的作用是啥？
3.  包装类怎么比较？ 为什么？

##### JavaBean

1. 什么叫JavaBean
2. serializable接口的作用是什么？为什么没有任务成员？ 没有成员又是怎么起作用的?
3. JavaBean的作用是什么？

##### 枚举 

1. 枚举的优势是什么？
2. 枚举比较为什么可以使用==?
3. 枚举类型声明构造方法要注意什么规范?

    
#### 问题


+ 字符串 下面输出什么? 为什么？ 怎么改造成类似于String的结构呢

```java

public class Main {
    public static void main(String[] args) {
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
    }
}

class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = scores;
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}

```


+ 包装类 结果是什么？为什么？ 

```java
public class Main {
    public static void main(String[] args) {
        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer n = 99999;
        System.out.println("x == y: " + (x==y)); // 
        System.out.println("m == n: " + (m==n)); // 
        System.out.println("x.equals(y): " + x.equals(y)); // 
        System.out.println("m.equals(n): " + m.equals(n)); // 
    }
}

```