public class Main
 {
    public static void main(String[] args) 
    {   

//         变量类型
//         String
//         String a = "hello";
//         String b = "Motherfucker";
//         System.out.println(a+", "+b);
//
//
//         int
//         int a = 250;
//         int b = 13;
//         int c = a + b;
//         System.out.println(a+" "+b+" "+c);
//         int的表示范围：-2147483648～2147483647(-21亿到+21亿)
//
//         double
//         double a = 2.5;
//         double b = 3.1415926575;
//         System.out.println(a+" "+b);
//
//         boolean
//         boolean a = true;
//         boolean b = false;
//         System.out.println(a + " " + b);
//
//
//         算数操作符
//         "/"in int&double
//         int a = 10;
//         int b = 3;
//         int result = a/b;
//         System.out.println(result);
//         double a = 10;
//         double b = 3;
//         double result = a/b;
//         System.out.println(result);
//
//         %
//         System.out.println((10%3));
//
//         赋值操作符
//         "a += 3"相当于"a = a+3" // "+="不可拆分
//
//         关系操作符
//         int a = 10;
//         double b = 9.9999999;
//         boolean result = a > b; // "a > b"得出的结果是boolean类型变量
//         System.out.println(result);
//
//         逻辑操作符 && || !
//         boolean a = true;
//         boolean b = false;
//         boolean c = a && b;
//         boolean d = a || b;
//         System.out.println(c+" "+d+" "+!a);
//
//         关系操作符的优先级高于逻辑操作符
//
//        类型转换
//         double a =10.55;
//         int b = (int) a;
//         System.out.println(b);
//         boolean like = true;
//         if (like)
//         {
//             System.out.println("我是傻逼");
//         };
//
//
//         数组
//         int [] a = new int[5];
//         a[0]=13;
//         System.out.println(a[0]+" "+a.length);
//
//        遍历数组
//         int [] a ={ 12, 34, 23, 13, 24};
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.println(a[i]);
//         }//正序遍历
//
//         for(int i=a.length-1;i>=0;i--)
//         {
//             System.out.println(a[i]);
//         }//倒序遍历
//
//        交换某两项的值
//         int temp = a[3];
//         a[3]=a[2];
//         a[3]=temp;
//
//         数组扩容
//         int [] b = new int[a.length+1];
//         for(int i=0;i<a.length;i++)
//         {
//             b[i]=a[i];
//         }
//         b[a.length]=33;
//         for(int j=0;j<=a.length;j++)
//         {
//             System.out.println(b[j]);
//         }
//
//
//        创建对象 对象的名字一般首字母小写
        Object dog = new Object();
        dog.id=250;
        dog.name="陈邱奕";
        dog.sex=true;
        dog.phone="18068982298";

//        Object ji = new Object();
//        ji.id=250;
//        ji.name="季扒皮";
//        ji.sex=true;
//        ji.phone="18021655022";

//        空对象
//        Object girlfriend = null;

//        引用方法
        Functions aba_aba = new Functions();
        aba_aba.playMusic("起风了");

        My_Handler handler=new My_Handler();
        My_Data sample=new My_Data();
        handler.test(sample);


            
    





        

        




























    }






























    
}
