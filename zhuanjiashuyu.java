public class zhuanjiashuyu{
	public static void main(String[] args){
		String[] one={"123","234","345","456","567","678"};
		String[] two={"teacher","student","doctor","master","bachelor","professor"};
		String[] three={"school","classroom","home","playground","office","gym"};
		int oneLength=one.length;
		int twoLength=two.length;
		int threeLength=three.length;
		int rand1=(int)(Math.random()*oneLength);
		int rand2=(int)(Math.random()*twoLength);
		int rand3=(int)(Math.random()*threeLength);
		String result=one[rand1]+" "+two[rand2]+" "+three[rand3];
		System.out.println(result);
	}
}