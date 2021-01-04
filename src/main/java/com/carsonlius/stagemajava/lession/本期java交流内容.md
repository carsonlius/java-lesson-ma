### 2021.01.06 交流内容


##### 字符串

1. 字符串为什么不可以变?
    + 怎么理解没有提供修改内容的方法？
        + int[] ages = {21,22,23}; ages[1] = 40;
2. 字符串比较为什么要用equals而不用==?
    + 对==来说，基本比较数值,引用类型比较内存地址
    + 可以看下String.equals的重写方法
    
##### StringBuilder

1. StringBuilder和StringBuffer的区别?
    1. string长度不可以变
    2. StringBuilder线程不安全, 不会产生新的StringBuilder对象
    3. StringBuffer线程安全，包含大量的synchronized的方法
    
##### StringJoiner

1. 使用String.join()替换, 功能类似于php join

##### 包装类型

1.  java自动拆包,加包的作用是啥？
    1. 容器可以存储包装类,自动拆包，加包之后数组的优点只剩下效率高了

    
#### 问题

+ 下面输出什么? 为什么？ 怎么改造成类似于String的结构呢

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