import java.util.HashMap;

public class SockProblem {
	
	static int sockMerchant(int n, int[] ar) {
        int counterSocks =0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i< ar.length;i++){
            Integer value = new Integer(ar[i]);
            if(map.containsKey(value)){
                map.remove(value);
                counterSocks++;
            }else{
                map.put(value,value);
            }
        }
        return counterSocks;
    }
	public static void main(String args[]) {
		System.out.println(sockMerchant(15, new int[]{6 ,5 ,2 ,3 ,5 ,2 ,2 ,1 ,1 ,5 ,1 ,3 ,3 ,3 ,5}));
	}

}
