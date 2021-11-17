# JAVA复习

## 相关名词及面向对象基础

### 相关名词

* JDK(Java Development Kit),是Sun公司提供的一套用于开发Java程序的开发工具包。

* JRE(Java Runtime Environment)是运行Java程序所依赖的环境的集合,包括类加载器、字节码校验器、Java虚拟机、Java APl。JRE已包含在JDK中,但是如果仅仅是为了运行Java程序,而不是从事Java开发,可以直接下载安装JRE。

* JVM(Java Virtual Machine)是-个虚构出来的计算机,通过在实际的计算机上仿真模拟各种计算机功能来实现的。可运行 (.class文件)。

### 面向对象基础

* 类可以实例化成对象，类包含属性和方法两部分，有封装、继承、多态等性质。

* 调用属性 

  > 对象名.属性名

* 调用方法

  >对象名.方法名()

* this关键字

* 构造方法的使用（有参数、无参数，若只有有参数的构造方法则无参数的构造方法不可用）

* 方法的重载（方法名相同，参数不同）和重写的区别

* 访问控制符(private、protected、public、缺省(包访问权限))

* **static** 关键字 : 方便在没有创建对象的情况下进行调用(方法/变量)。

   ==注 : 静态属性被所有对象共享==

   ==注 : 静态方法不能调用非静态成员，编译会报错==

  ```java
  public class StaticTest{
  	private static String name ="李四";
      private String address ="中国";
      public StaticTest() {}
      public void test1(){
          System.out.println(name);
          System.out.println(address);
          test2();
      }
      public static void test2(）{
          System.out.println(name);
          System.out.println(address); //error 在创建对象前address不存在
          test1(); //error 无法得知test1()是否使用了非静态属性
      }
  }
  ```

## Java语言基础

### Java语言基础

* 变量类型、注释同Cpp类似（布尔为boolean）

* Java中的标识符由字母、数字、下划线或美元符组成，且必须以字母、下划线(_)或美元符($)开头。
  
* 常量 **final**
  
* Java中不同进制整数的表示
  
  > 二进制 0b开头 八进制 0 开头 十六进制 0x 开头

* 引用类型 -> 数组、类、接口、枚举

* 操作符 / 和 % 若两个数都是整数则结果为整数，若此时除数为0则会抛出异常。

  若两个数有一个数是浮点数则结果为浮点数，若此时除数为0.0，/结果为 Infinity 或 -Infinity，%结果为NaN(非数，Not a Number)

  

* 数组的创建 

  ```java
  int[][] a = new int[10][2];
  int[] b = {1,2,3,4,5};
  int[] c = new int[]{1,2,3,4,5};
  Student[] stu = new Student[5];//对象数组的创建
  Student[] array2 = new Student[] {
      new Student("赵九", "六年级2班", 76),
      new Student("宋十", "初一3班", 87)
  };
  ```

* 方法的可变参数

  ```java
  public static int add(int a, int... b) {
  	int sum = a;
  	// 可变参数b被当成数组进行处理
  	for (int e : b) {
  		sum += e;
  	}
  	return sum;
  }
  ```

  

* package 的定义和导入

  ```java
  package com.qst.chapter03; //多级包的定义
  import 包名.类名;
  import 包名.*;
  ```



## Java的核心类

### 基本类型类

| 基本数据类型 |  封装类   |
| :----------: | :-------: |
|     byte     |   Byte    |
|    short     |   Short   |
|     int      |  Integer  |
|     long     |   Long    |
|     char     | Character |
|    float     |   Float   |
|    double    |  Double   |
|   boolean    |  Boolean  |

### Object类

定义在 `java.lang` 包中，是所有类的顶级父类。任何Java对象都可以调用Object类中的方法，而且任何类型的对象都可以赋给Object类型的变量。

### **equals()**方法

* “==” 运算符比较的是两个对象地址是否相同，即引用的是同一个对象。

* equals()方法通常可以用于比较两个对象的内容是否相同。

### toString()方法

返回对象的字符串表示，在打印和与字符串连接时可以自动调用。

### 字符串类

* String 类属于final不可变，若改变字符串的值则会创造新的 String 对象。
* StringBuffer 类创造的是可变字符串，有append()、insert()、setCharAt()等方法。
* StringBuilder 类创造的也是可变类型的，不同的是他是线程不安全的，占用资源少。

### Scanner类

Scanner扫描器类在java.util包中多用于数据输入，它只接收空格前的数据，若想接收空格则需要加入`useDelimiter("\n")` 方法设置读取分隔符为回车，或者使用`nextLine()`方法。

```java
import java.util.Scanner;
public class Demo{
    public static void mian(String[] args){
        Scanner input = new Scanner(System.in);
        //input.useDelimiter("\n");
        String str = input.nextLine();
        //选择一个类型去接受输入的内容
        //int i = input.nextInt();
        //int f = input.nextFloat();
    }
}
```

### Math类和Date类

类似其他语言的math类库

`Date dateNow = new Date();`	Date类的使用。

## 类之间的关系

### 继承(extends)

`class SubClass extends SuperClass{}`

* 只能单继承
* final 类不可继承


### 方法的重写(override)

子类重写父类的方法

* 方法名、参数列表和返回值必须和父类相同
* 可访问性要保持一致
* 不能重写静态方法(static)和最终方法(final)

### 内部类

类里定义类

## 抽象类和接口

### 抽象类(abstract class)和抽象方法(abstract )

* `abstract`放在类前或方法前。
* **抽象类无法被实例化只可以作为父类被继承，但可以有构造方法。**
* **抽象方法没有方法体**。
* 成员变量和构造方法不可被`abstract`修饰，`abstract`也不可和`private`、`static`等关键字使用。

### 接口(interface)

* 接口可以多继承，但只能继承接口，不可继承类。
* 接口中定义的方法默认为抽象方法，若定义默认方法需要 `default` 关键字修饰。

* 接口的主要用途就是被实现类实现，一个类可以实现一个或多个接口。
* 
