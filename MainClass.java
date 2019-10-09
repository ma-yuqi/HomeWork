package test3;
public class MainClass { // 用于测试复数类  
	   
    /** 
     * @param args 
     */ 
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        System.out.println("请用户输入第一个复数的实部和虚部:");  
        Complex data1 = new Complex();  
        System.out.println("请用户输入第二个复数的实部和虚部:");  
        Complex data2 = new Complex();  
          
        // 以下分别为加减乘除  
        Complex result_add = data1.add(data2);  
        Complex result_sub = data1.sub(data2);  
        Complex result_mul = data1.mul(data2);  
        Complex result_p = data1.p(data2);  
           
        result_add.print();  
        result_sub.print();  
        result_mul.print();  
        result_p.print();  
    }  
}  
