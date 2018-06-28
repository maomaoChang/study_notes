# 51job面试题  
时间：2018-6-28 13:00 张东路

### 1.自我介绍

### 2.对搜索引擎有多少了解，如es搜索引擎

### 3.对JVM底层的了解

### 4.请简要介绍一下Java的内存回收机制

### 5.平时是否有用java开发mapreduce函数、UDF函数

### 6.问题:  
```
假设有数百万个英文单词，需要按照单词的前缀设计检索策略,请给出较为高效的实现方案

提示：btree, 字典序
```

### 7.请介绍一下btree索引中,数据库增加或者删除一条记录,索引结构如何变化

### 8.请介绍一下hbase与传统关系型数据库的区别,以及hbase底层是如何检索数据的

### 9.给出如下程序的a,b最终值  
```c++
int a = 5;
int b = 10;
a << 2;
a += (++a) + (b++);
a >> 2;
b << 1;
```  

### 10.问题：  
```
有一张表大小为4G,包含求职者id和职位id两个字段,其中职位id可能重复,即不同求职者可能会投递
同一个岗位,且不同职位id的汇总已经超过服务器的最大内存。请设计合理的方法,为各个职位的投递
次数做排序

提示：考察分治思想  hash、位图
```