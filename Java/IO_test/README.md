## Java中的I/O分类

- 文本I/O  
1.文本I/O也就是字符流，使用Scanner类读取文本数据，使用PrintWriter类写入文本数据  
2.输入对象的创建  
3.输出对象的创建  

```  
Scanner input = new Scanner(System.in);  //键盘获取
Scanner input = new Scanner(new File(filename)); //读取文件数据
input.close(); //
```  


```
PrintWriter output = new PrintWriter(new File(filename));
PrintWriter output = new PrintWriter("text.txt");
output.close(); //一定要关闭
```

- 二进制I/O  
1.文本IO建立在二进制IO的基础上，它能提供一层抽象，用于字符层次的编码和解码，编解码是自动进行的  
2.在写入一个字符时，Java虚拟机会将统一码转化为文件指定的编码，而在读数据时，将文件指定的编码转化为统一码  
3.二进制文件不需要转化，所以比文本IO效率高。如果使用二进制IO向文件写入一个数值，就是将内存中的那个值复制到文件中  
4.常用的二进制IO有如下分类：
