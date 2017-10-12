import java.util.ArrayList;

public class PsychometricTesting {
	
	public static void main(String[] args) {
		int[] sc={4,8,7};
		int[] lowerLimits={2,4};
		int[] upperLimits={8,4};
		jobOffers(sc,lowerLimits,upperLimits);
	}

	
static int[] jobOffers(int[] scores,int[] lowerLimits,int[] upperLimits){
		
		int lenScore=scores.length;
		int lenLower=lowerLimits.length;
		int count=0;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<lenLower;i++){
			for(int j=0;j<lenScore;j++){
				if((lowerLimits[i]<=scores[j])&&(scores[j]<=upperLimits[i])){
					count ++;
				}
			}
			al.add(count);
			count=0;
		}
				System.out.println(al);
		int[] op=new int[al.size()];
		for(int k=0;k<op.length;k++){
			op[k]=al.get(k);
		}
		
		return op;
		
	}
}
