	public class nursery_while{
	public static void main(String[] args){
		int i=99;
			while(i>=0){
				if(i>2){
					System.out.println(i+" bottles of beer on the wall,"+i+" bottles of beer");
					System.out.println("Take one down");
					System.out.println("pass it around");
					System.out.println((i-1)+" bottles of beer on the wall\n");
					--i;
					}else if(i==2){
					System.out.println(i+" bottles of beer on the wall,"+i+" bottles of beer");
					System.out.println("Take one down");
					System.out.println("pass it around");
					System.out.println((i-1)+" bottle of beer on the wall\n");
					--i;
					}else if(i==1){
					System.out.println(i+" bottle of beer on the wall,"+i+" bottle of beer");
					System.out.println("Take one down");
					System.out.println("pass it around");
					System.out.println((i-1)+" bottle of beer on the wall\n");
					--i;
					}else {
					System.out.println("No more bottles of beer on the wall");
					--i;
				}
			}
		}
	}