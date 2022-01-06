# JAVA复习——面向考试的复习策略

*根据老师课堂总结，考试加油！！！*

## 简答（30′）

### ==一、多态的体现？（问3种写前3，问5种写前5）==

1. 父类的对象变量可以是指向子类的实例
2. 抽象类的类型变量可以指向子类的实例
3. 变量可以指向他的实现类的实例
4. 方法的重载
5. 方法的重写
5. +号既可以数加，也可以作为字符串的连接

### ==二、线程的生命周期有哪些？他们之间的关系？==

新建、就绪、运行、阻塞、死亡

![线程状态之间的转换](https://i.loli.net/2021/11/28/BSelnT7QVxcXfyv.png)

### ==三、使用JDBC访问数据库的步骤？==

1. 加载JDBC数据库驱动
2. 建立数据库连接
3. 创建Statement对象
4. 执行SQL语句
5. 处理返回的结果
6. 关闭创建的对象

### 四、使用Socket进行网络通信的具体步骤？

1. 根据指定IP地址和端口号创建一个Socket对象
2. 调用getInputStream（）方法或getOutputStream（）方法打开连接到Socket的输入/出流
3. 客户端与服务器根据协议进行交互，直到关闭连接
4. 关闭客户端的Socket

### 五、使用ServerSocket进行网络通信的具体步骤？

1. 根据指定的端口号来实例化一个SeverSocket对象
2. 调用ServerSocket对象的accept（）方法接受客户端发送的Socket对象
3. 调用Socket对象的个体InputStream（）/getOutputStream（）方法来建立与客户端进行交互的IO流
4. 服务器与客户端根据一定的协议交互，直到关闭连接
5. 关闭服务端的Socket
6. 回到第2步，继续监听下一次客户端发送的Socket请求连接

## 编程（40′）

### 一、多线程相关编程

```java
package com.qst.chapter05;

//使用同步代码块的方式
public class SynBlockBank extends Thread {
	// 银行账户
	private BankAccount account;
	// 操作金额，正数为存钱，负数为取钱
	private double money;

	public SynBlockBank(String name, BankAccount account, double money) {
		super(name);
		this.account = account;
		this.money = money;
	}
	
	// getter/setter方法
	public String getMoney() {
		return money;
	}

	public void setBankNo(String money) {
		this.money = money;
	}

	public double getAccount() {
		return account;
	}

	public void setBalance(double account) {
		this.account = account;
	}
	// 线程任务
	public void run() {
		synchronized (this.account) {
			// 获取目账户的金额
			double d = this.account.getBalance();
			// 如果操作的金额money<0,则代表取钱操作,同时判断账户金额是否低于取钱金额
			if (money < 0 && d < -money) {
				System.out.println(this.getName() + "操作失败，余额不足！");
				// 返回
				return;
			} else {
				// 对账户金额进行操作
				d += money;
				System.out.println(this.getName() + "操作成功，目前账户余额为：" + d);
				try {
					// 休眠1毫秒
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 修改账户金额
				this.account.setBalance(d);

			}
		}
	}

	public static void main(String[] args) {
		// 创建一个银行账户实例
		BankAccount myAccount = new BankAccount("60001002", 5000);
		// 创建多个线程，对账户进行存取钱操作
		SynBlockBank t1 = new SynBlockBank("T001", myAccount, -3000);
		SynBlockBank t2 = new SynBlockBank("T002", myAccount, -3000);
		SynBlockBank t3 = new SynBlockBank("T003", myAccount, 1000);
		SynBlockBank t4 = new SynBlockBank("T004", myAccount, -2000);
		SynBlockBank t5 = new SynBlockBank("T005", myAccount, 2000);

		// 启动线程
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		// 等待所有子线程完成
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 输出账户信息
		System.out.println("账号：" + myAccount.getBankNo() + ", 余额："
				+ myAccount.getBalance());
	}

}

```

### 二、接口相关编程

定义一个接口

```java
public interface MyInterface {
	// 接口里定义的成员变量只能是常量
	int MAX_SIZE = 50;
	// 接口里定义的普通方法只能是public的抽象方法
	void addMsg(String msg);
        // 在接口中定义默认方法，需要使用default修饰
	default void print(String... msgs) {
		for (String msg : msgs) {
			System.out.println(msg);
		}
        // 在接口中定义类方法，需要使用static修饰
	static String staticTest() {
		return "接口里的类方法";
}

```

定义一个实现类ImInterfacelDemo.java

```java
public class ImInterfaceDemo implements MyInterface {
// 定义个一个字符串数组，长度是接口中定义的常量MAX_SIZE
private String[] msgs = new String[MyInterface.MAX_SIZE];
public void addMsg(String msg) {
	if (num >= MyInterface.MAX_SIZE) {
	    System.out.println("消息队列已满，添加失败！");
	    } else {
	        // 将消息添加到字符串数组中，num数量加1
	         msgs[num++] = msg;
	    }
}
   
    public static void main(String[] args) {
        // 实例化一个接口实现类的对象，并将其赋值给一个接口变量引用
	MyInterface mi = new ImInterfaceDemo();
	// 调用接口的默认方法，默认方法必须通过实例对象来调用
	mi.print("张三", "李四", "王五");
	// 调用接口的类方法，直接通过“接口名.类方法()”来调用	System.out.println(MyInterface.staticTest());
         // 实例化接口实现类
	ImInterfaceDemo ifd = new ImInterfaceDemo();
	// 添加信息
	ifd.addMsg("Java 8应用开发");
    }
}

```

结果

```java
张三
李四
王五
接口里的类方法
```

**之前考题：写一个算术接口，实现加减乘除**

定义接口：

```java
public interface Operation {
    public double getNumber(double a,double b);
}

```

实现加法：

```java
public class Add implements Operation {
	public double getNummber(double a,double b){
        //实现加法
    }
}
```

实现减法：

```java
public class Sub implements Operation {
	public double getNummber(double a,double b){
        //实现减法
    }
}
```

实现乘法：

```java
public class Mul implements Operation {
	public double getNummber(double a,double b){
        //实现乘法
    }
}
```

实现除法：

```java
public class Div implements Operation {
	public double getNummber(double a,double b){
        //实现除法
    }
}
```

使用接口：

```java
public class useOperation{
    public void useOperation(Operation operation,double a,double b){
        //使用接口
    }
}
```

测试类：

```java
public class test{
    public void main(String[] args){
		useOperation use_in=new useOperation();
        use_in.useOperation(operation.Add(14,15));
        use_in.useOperation(operation.Mul(14,15));
        use_in.useOperation(operation.Sub(14,15));
        use_in.useOperation(operation.Div(14,15));
    }
}
```





### 三、抽象类相关编程

定义Fruit（可以换其他）抽象类的两个子类Apple和Peach，并实现抽象方法，以此演示抽象类的使用。

Fruit.java

```java

public abstract class Fruit {
    private String name;

    //构造方法
    public Fruit(){

    }
	//重写构造方法
    public Fruit(String name) {
        this.name=name;
    }

    //抽象方法  种
    public abstract void plant();

    //getter/setter方法
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}

```

Apple.java

```Java

public class Apple extends Fruit{
    //构造方法
    public Apple(){

    }
    //重写构造方法
    public Apple(String name){
        super(name);
    }
    //重写Fruit中的plant方法
    @Override
    public void plant(){
        System.out.println("种"+this.getName());
    }
}

```

Peach.java

```java

public class Peach extends Fruit{
    //构造方法
    public Peach(){

    }
    //重写构造方法
    public Peach(String name){
        super(name);
    }
    //重写Fruit中的plant方法
    @Override
    public void plant(){
        System.out.println("种"+this.getName());
    }
}

```

测试类AbstractDemo.java

```java
package com.AbstractDemo;

public class TestDemo {
    public static void main(String [] args){
        Fruit fruit;
        fruit=new Apple("Apple");
        fruit.plant();
        fruit=new Peach("Peach");
        fruit.plant();
    }
}

```

结果：

![image-20211129193423007](https://i.loli.net/2021/11/29/LHyolkPazNYptiA.png)



## 根据程序写结果

## 程序填空（大概没有）
