package test3;
public class MainClass { // ���ڲ��Ը�����  
	   
    /** 
     * @param args 
     */ 
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        System.out.println("���û������һ��������ʵ�����鲿:");  
        Complex data1 = new Complex();  
        System.out.println("���û�����ڶ���������ʵ�����鲿:");  
        Complex data2 = new Complex();  
          
        // ���·ֱ�Ϊ�Ӽ��˳�  
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
