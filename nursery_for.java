public class nursery_for{
	public static void main(String[] args){
		for(int i=99;i>=0;--i){
			if(i>2){
				System.out.println(i+" bottles of beer on the wall,"+i+" bottles of beer\nTake one down\npass it around\n"+(i-1)+" bottles of beer on the wall\n");
				}else if(i==2){
				System.out.println(i+" bottles of beer on the wall,"+i+" bottles of beer\nTake one down\npass it around\n"+(i-1)+" bottle of beer on the wall\n");
				}else if(i==1){
				System.out.println(i+" bottle of beer on the wall,"+i+" bottle of beer\nTake one down\npass it around\n"+(i-1)+" bottle of beer on the wall\n");
				}else {
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}
}