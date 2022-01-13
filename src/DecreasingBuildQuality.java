
public class DecreasingBuildQuality {

	static String TRUE = "T";
	static String FALSE = "F";
	public static void main(String[] args) {
		String [] buildInformation = {"T","T","T","F","F","F","F","F","F", //66%
									"T","T","T","F","F","F","F","F","F",
									"T","T","F","F","F","F","F", //
									"T","T","F","F","F","F","F","F",
									"T","T","T","F","F","F","F",
									"T","T","F","F","F"};
		int tCount = 0;
		int fCount = 0;
		double currentBuildQuality = -1;
		int totalBuildQualityDecrease = 0;
		int globalMax = 0;
		String prevBuildFlag = TRUE;
		double previousBuild = -1;
		for(int i=0;i<buildInformation.length;i++) {
			if(prevBuildFlag == FALSE && buildInformation[i] ==TRUE) {
				currentBuildQuality = (double)fCount/(double)(fCount+tCount);
				if(currentBuildQuality >= previousBuild) {
					totalBuildQualityDecrease++;
					previousBuild = currentBuildQuality;
				}else {
					globalMax = Math.max(totalBuildQualityDecrease,globalMax);
					totalBuildQualityDecrease = 0;
					previousBuild = currentBuildQuality;
				}
				tCount = 0;
				fCount = 0;
			}
			if(buildInformation[i] == TRUE) {
				tCount++;
				prevBuildFlag = TRUE;
			}else if(buildInformation[i] == FALSE) {
				fCount++;
				prevBuildFlag = FALSE;			
			}
			
		}
		System.out.println("total build quality: "+ globalMax);
		

	}

}
