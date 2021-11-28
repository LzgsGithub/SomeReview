# JAVA复习

>注意看一下每章的目标，只需要把要求会写的重点掌握，其余要求的能看懂就行。
>
>写的不全，大家可以考前看一下PPT里面的表格，了解下一些特定类的方法，只要知道什么意思即可。

> 对于类的继承、多态等特性，如果实在理解不了，可以结合具体例子理解。
>
> 比如说有一个父类是动物，他的子类有猫、狗、鸟等。
>
> 那我可以定义一个对象比如     动物  拉布拉多 = new 狗();  //多态
>

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

### equals()方法

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
    public static void main(String[] args){
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

### 继承(==extends==)

`class SubClass extends SuperClass{}`

* 只能单继承
* final 类不可继承


### 方法的重写(override)

子类重写父类的方法

* 方法名、参数列表和返回值必须和父类相同

* 可访问性要保持一致

* 不能重写静态方法(static)和最终方法(final)

>动物类有一个方法是 运动，动物类的子类可以重写这个方法 起名叫 飞。
>

### 内部类

类里定义类

## 抽象类和接口

### 抽象类(==abstract class==)和抽象方法(abstract )

* `abstract`放在类前或方法前。
* **抽象类无法被实例化只可以作为父类被继承，但可以有构造方法。**
* **抽象方法没有方法体**。
* 成员变量和构造方法不可被`abstract`修饰，`abstract`也不可和`private`、`static`等关键字使用。

### 接口(==interface==)

* 接口中定义的变量默认是**public static final**。

* 接口可以多继承，但只能继承接口，不可继承类。

* 接口中定义的方法默认为抽象方法，若定义默认方法需要 `default` 关键字修饰。

* 接口的主要用途就是被实现类实现，一个类可以实现一个或多个接口。

* **==implements==**关键字用于实现接口。

* 一个类可以实现多个接口，接口之间使用逗号进行间隔。

* 一个类在实现一个或多个接口时，这个类必须完全实现这些接口中定义的所有抽象方法，否则该类必须定义为抽象类

* 接口不可直接实例化为对象 `MyInterface mi = new MyInterface();`**(错误)**

  但接口变量可指向接口实现类的实例 `MyInterface mi=new ImInterfaceDemo();`**(正确)**
  
* 一个接口可继承多个接口，多个接口需跟在extends关键字之后，并使用逗号进行间隔。

### 总结
* 接口和抽象类都不能被实例化，需要被其他类实现或继承；
* 接口和抽象类的类型变量都可以指向其实现类或子类的实例对象；
* 接口和抽象类都可以包含抽象方法，实现接口或继承抽象类时都必须实现这些抽象方法。

### instancof关键字

判断一个对象是否属于某个类或其子类的实例

> result = object instanceof class
>参数：
> Result：布尔类型。
> Object：必选项。任意对象表达式。
> Class：必选项。任意已定义的对象类。

如果object是class的一个实例 (或者是class类子类的一个实例) 返回true。

>result = 拉布拉多 instanceof 狗  	=> true
>
>result = 拉布拉多 instanceof 动物  => true  因为拉布拉多是狗类的实例，狗类是动物的子类
>
>result = 拉布拉多 instanceof 鸟 	 => false



## 异常

Java的异常类可分为两种，Error和Exception他们都是Throwable的子类，只有Exception才可被捕获。

|              类名              |         说明          |
| :----------------------------: | :-------------------: |
| ArrayIndexOutOfBoundsException |   数组下标越界异常    |
|      NullPointerException      |    空指针访问异常     |
|     NumberFormatException      |    数字格式化异常     |
|      ArithmeticException       | 算术异常，如除以0溢出 |
|       ClassCastException       |  类型转换不匹配异常   |
|          SQLException          |    数据库访问异常     |
|          IOException           |     文件操作异常      |
|     FileNotFoundException      |    文件不存在异常     |
|     ClassNotFoundException     |     类没找到异常      |

### try……catch(……finally)语句(处理异常)

```java
try {
	// 产生除以0的算术异常
	int i = 10 / 0;
	System.out.println("i的值为：" + i);
} catch (Exception e) {
	// 输出异常信息
	e.printStackTrace();
    return;
    //System.exit(0);
}finally{
    
}
```

* return会强制强制停止此方法，但在结束前会先执行 finally 下的语句块再return

* 如果是用System.exit(0)语句退出整个程序，则不会执行finally

### throw语句(抛出异常)

```java
//throw 异常对象
Scanner scanner = new Scanner(System.in);
try {
  System.out.println("请输入年龄：");
  // 从键盘获取一个整数
  int age = scanner.nextInt();
  if (age < 0 || age > 80) {
        // 抛出一个异常对象
        throw new Exception("请输入一个合法的年龄，年龄必须在0~80之间");
   } 
} catch (Exception ex) {
     ex.printStackTrace();
}
System.out.println("程序结束！");
```

### throws语句

在开发中，如果去调用别人写的方法时，是否能知道别人写的方法是否会发生异常？这是很难判断的。针对这种情况，Java总允许在方法的后面使用throws关键字对外声明该方法有可能发生异常，这样调用者在调用方法时，就明确地知道该方法有异常，并且必须在程序中对异常进行处理，否则编译无法通过。

```java
//语法
[访问符] <返回类型> 方法名([参数列表]) throws异常类A [,异常类B... ,异常类N]{
	//方法体
}
```

```java
public class Example { 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       int result = divide(4,2);
       System.out.println(result);
    }
    public static int divide(int x,int y) throws Exception
    {
        int result = x/y;
        return result;
    }
}
```

## 泛型

类型作为参数，类似于Cpp里的模板

```java
class Node<T> {
	private T data;
	public Node<T> next;
	//省略......
}
Node<String> myNode = new Node<String> ();

```

### 通配符

当声明一个泛型变量或创建一个泛型实例对象的时候，可以用“？”代表未知的数据类型。

```java
// 泛型类Generic的类型参数使用Object
public static void myMethod(Generic<Object> g) {
	g.showDataType();
}  
public static void main(String[] args) {
	// 参数类型是Integer
	Generic<Integer> gint = new Generic<Integer>(12);
	// 这里将产生一个错误,与形参类型不同
	myMethod(gint); 
}

//如果改进myMethod方法
public static void myMethod(Generic<?> g) {
	g.showDataType();
}  
public static void main(String[] args) {
	Generic<Integer> gint = new Generic<Integer>(12);
	myMethod(gint); //不会报错
}
//数据的类型是: java.lang.Integer
```

### 上界和下界的确定(extends,super)

```JAVA
//定义泛型时指定类型参数的上界
public class Generic<T extends Number>{
	//类体......
}
//使用泛型时指定类型参数的上界
Generic<? extends Number>
//则泛型被限定为Number类或Number类的子类

// 使用泛型Generic时指定其类型参数的下界
public static void myMethod(Generic<? super String> g) {
	g.showDataType();
}
//则泛型被限定为String类或String类的父类直到Object
```

### 一些注意事项

* 定义泛型时，类型参数只是占位符，不能直接实例化，例如：“new T()”是错误的;

* 泛型的类型参数只能是类类型（包括自定义类），不能是简单类型;

* 不能实例化泛型数组，除非是无上界的类型通配符，例如：`Generic<String> []a = new Generic<String> [10]`是错误的，而`Generic<?> []a = new Generic<?> [10]`是被允许的；

* 泛型类不能继承Throwable及其子类,不能是异常类

## 集合

Java的集合类主要由两个接口派生而出：Collection和Map，这两个接口派生出一些子接口或实现类。

Java的集合可分为三大类:

>Set集合: 无序，不可重复
>
>List集合: 类似于数组
>
>Map集合: 每个元素由键值对组成，每个元素的键(key)不可重复

### 迭代器(Iterator)

foreach语句迭代

### List接口(ArrayList和Vector两个实现类)

* ArrayList是线程不安全的，Vector是线程安全的，ArrayList多用，Vector占用资源大不常用。

```java
// 使用泛型ArrayList集合
ArrayList<String> list = new ArrayList<String>();
// 向集合中添加元素
list.add(“北京”);
list.add(“上海”);
list.add(“天津”);
list.add(“济南”);
list.add(“青岛”);
// list.add(1); error  只能添加字符串
// 使用foreach语句遍历
for (String e : list) {
	System.out.println(e);
}
// 获取ArrayList的迭代器
Iterator<String> iterator = list.iterator();
// 使用迭代器遍历
while (iterator.hasNext()) {
	System.out.println(iterator.next());
}
```

### Set接口(HashSet、TreeSet和EnumSet三个实现类)

* HashSet 哈希存取，无序
* TreeSet  要实现comparable接口，有序
* EnumSet 枚举型

### Queue接口(队列) Deque接口(双端队列)

### Map接口(HashMap和TreeMap两个实现类)

同Set，hash无序，tree有序



## 文件和IO流

* 文件的路径分绝对路径和相对路径
* 如果进行输入/输出的内容是文本内容，则使用字符流
* 如果进行输入/输出的内容是二进制内容，则使用字节流

### 对象的序列化和反序列化

* 序列化是将一个对象写到一个输出流的过称。

* 反序列化是从一个输入流中读取一个对象。

* 若想实现序列化，则该类必须实现java.lang包下的Serializable接口或Externalizable接口

  

### NIO => Buffer

* java.nio包：主要包含各种与Buffer（缓冲）相关的类。

* buffer可以被理解成一个容器，其本质是一个数组

* Channel是对传统的IO系统的模拟，在NIO系统中所有数据都需要经过通道传输

  

## JDBC(Java Database Connectivity)一种执行SQL语句的Java API

### ==使用JDBC访问数据库的步骤(非常重要必须背过)==

①加载数据库驱动 => ②建立数据连接 => ③创建Statement对象 => ④执行SQL语句 => ⑤访问结果集

### 加载数据库驱动

`Class.forName(数据库驱动类名);`

### 建立数据连接

`DriverManager.getConnection(String url,String user,String password);`

### 创建Statement对象

`Statement smt = conn.createStatement(); `

### 执行SQL语句

`ResultSet rs = smt.executeQuery("SELECT sno,name,age FROM student"); `

### 访问结果集

```java
//循环输出第一列数据
while (rs.next()) {
	System.out.println(rs.getString(1));
}
//循环输出列名为username的数据
while (rs.next()) {
	System.out.println(rs.getString("username"));
}
```

### 关闭创建的对象

* 关闭结果集`re.close()`

* 关闭Statement对象`stmt.close()`

* 关闭连接`conn.close()`

### 还有些剩下的知识点 看一下ppt和示例代码即可

## 线程

进程的三个特征：独立、动态、并发

### 创建线程的两种方式

#### 继承Thread类

* 定义一个类继承Thread类，并重写Thread类的run()方法，run()方法的方法体就是线程要完成的任务，因此把run()称为线程的执行体;
* 创建该类的实例对象，即创建了线程对象
* 调用线程对象的start()方法来启动线程

```java
public class ExtendThread extends Thread {
	private int i;
	public static void main(String[] args) {
		for(int j = 0;j < 50;j++) {
			//调用Thread类的currentThread()方法获取当前线程
			System.out.println(Thread.currentThread().getName() + " " + j);
			if(j == 10) {
				//创建并启动第一个线程
				new ExtendThread().start();
				//创建并启动第二个线程
				new ExtendThread().start();
			}
		}
	}
	public void run() {
		for(;i < 100;i++) {
			//当通过继承Thread类的方式实现多线程时，可以直接使用this获取当前执行的线程
			System.out.println(this.getName() + " "  + i);
		}
	}
}
```

#### 实现Runnable接口

* 定义一个类实现Runnable接口

* 创建该类的实例对象obj

* 将obj作为构造器参数传入Thread类实例对象，这个对象才是真正的线程对象

* 调用线程对象的start()方法启动该线程

```java
public class ImpRunnable implements Runnable {
	private int i;
    
	@Override
	public void run() {
		for(;i < 50;i++) {	
			//当线程类实现Runnable接口时，要获取当前线程对象只有通过Thread.currentThread()获取
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	public static void main(String[] args) {
		for(int j = 0;j < 30;j++) {
			System.out.println(Thread.currentThread().getName() + " " + j);
			if(j == 10) {
				ImpRunnable thread_target = new ImpRunnable();
				//通过new Thread(target,name)的方式创建线程
				new Thread(thread_target,"线程1").start();
				new Thread(thread_target,"线程2").start();
			}
		}
	}
}
```

  

### 线程的生命周期

![image-20211128142349686](D:\desktop\someReview\image\image-20211128142349686.png)

* 当使用new关键字创建一个线程之后，该线程就处于新建状态

* 可用`isAlive()`方法获取线程是否死亡

### 线程的优先级

* Thread类提供了`setPriority()`方法来对线程的优先级进行设置，而`getPriority()`方法来获取线程的优先级

* MAX_PRIORITY：最高优先级，其值为10

* NORM_PRIORITY：普通优先级，其值为5

* MIN_PRIORITY：最低优先级，其值为1

### 线程同步(synchronized)

有共享数据会产行线程安全问题。

#### 同步代码块

```java
synchronized(object){
    //多个线程要使用同一个同步监视器(锁)
	// 需要同步的代码块
}
```

#### 同步方法

```java
public synchronized void access(double money)
```

#### 同步锁

```java
//定义一个ReentrantLock锁对象，该对象是final常量
private final ReentrantLock lock = new ReentrantLock();
//在需要保证线程安全的代码之前增加“加锁”操作
lock.lock();
//在执行完线程安全的代码后“释放锁”
lock.unlock();
```

#### 线程通信

* wait()方法调用时会释放对象所，而sleep()不会
* notify()方法和notifyAll()方法只能在同步方法或同步块中使用
* notify()方法使线程从阻塞态变为就绪态

### Java网络编程

### URL 类

### Socket类

#### 使用Socket进行网络通信的具体步骤：

​	① 根据指定IP地址和端口号创建一个Socket对象

​	② 调用getInputStream()方法或getOutputStream()方法打开连接到Socket的输入/出流

​	③ 客户端与服务器根据协议进行交互，直到关闭连接

​	④ 关闭客户端的Socket

#### 使用ServerSocket进行网络通信的具体步骤：

​	① 根据指定的端口号来实例化一个ServerSocket对象

​	② 调用ServerSocket对象的accept()方法接收客户端发送的Socket对象

​	③ 调用Socket对象的getInputStream()/getOutputStream()方法来建立与客户端进行交互的IO流

​	④ 服务器与客户端根据一定的协议交互，直到关闭连接

​	⑤ 关闭服务器端的Socket

​	⑥ 回到第2步，继续监听下一次客户端发送的Socket请求连接

####  使用Socket进行基于C/S架构的网络通信程序设计的过程：

​	① 服务器端通过某个端口监听是否有客户端发送Socket连接请求

​	② 客户端向服务器端发出一个Socket连接请求

​	③ 服务器端调用accept()接收客户端Socket并建立连接

​	④ 通过调用Socket对象的getInputStream()/getOutStream()方法进行IO流操作，服务器与客户端之间进行信息交互

​	⑤ 关闭服务器端和客户端的Socket

#### 实现客户端与服务器之间的信息交互的步骤：

​	① 客户端调用Socket对象的getOutputStream()方法获取输出流

​	② 服务器端调用Socket对象的getInputStream()方法获取输入流

​	③ 服务器端调用Socket对象的getOutputStream()方法获取输出流

​	④ 最后客户端调用Socket对象的getInputStream()方法获取输入流
