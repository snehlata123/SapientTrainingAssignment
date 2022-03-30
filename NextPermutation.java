package ArrayPrg;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HAC-68:HAC-42|HAC-20,HAC-21,HAC-22,HAC-24";
		 String[] shuttleValueSplit = str.split(":");
		 System.out.println(shuttleValueSplit[0]+" ");
	String [] child = 	 shuttleValueSplit[1].split("\\|");
	System.out.println(child[0]+" "+child[1].split(",")[0]);


	}
	
	
	

}
