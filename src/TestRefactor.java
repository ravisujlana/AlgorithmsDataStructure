import java.util.ArrayList;
import java.util.List;

public class TestRefactor {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	
	    int aliceLenght = a.size() ;
	    int bobLength = b.size();
	    int aliceScore = 0;
	    int bobScore = 0;
	    if(aliceLenght <= bobLength ){
	        for(int i=0;i<aliceLenght;i++){
	            if(a.get(i) > b.get(i)){
	                aliceScore++;
	            }else if(a.get(i) < b.get(i)){
	                bobScore++;
	            }
	        }
	    }
	    List<Integer> returnList = new ArrayList<Integer>();
	    returnList.add(aliceScore);
	    returnList.add(bobScore);
	    return returnList;
	}

}
