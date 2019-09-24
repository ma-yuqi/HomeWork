public class zhuanjiashuyu{
	public static void main(String[] args){
		String[] one={"123","234","345","456","567","678"};
		String[] two={"teacher","student","doctor","master","bachelor","professor"};
		String[] three={"school","classroom","home","playground","office","
		int rand1=(int)(Math.random()*6);
		int rand2=(int)(Math.random()*6);
		int rand3=(int)(Math.random()*6);
		String result=one[rand1]+" "+two[rand2]+" "+three[rand3];
		System.out.println(result);
	}
}
