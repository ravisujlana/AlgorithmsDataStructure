import java.util.HashMap;
import java.util.Map;

/*find ways to travel grid by going down or right */
public class GridTraveler {

	public static void main(String[] args) {
		Map<String,Long> map  = new HashMap();
		System.out.println(gridTravelCalc(3,3,map));
//		System.out.println(gridTravelCalc(1,1,map));
//		System.out.println(gridTravelCalc(0,1,map));
//		System.out.println(gridTravelCalc(1,0,map));
//		System.out.println(gridTravelCalc(18,18,map));
		int n = 64;
		while(n%2 == 0) {
			System.out.println(n);;
			n=n/2;
		} 
			System.out.println(n+":");
	
	}

	static long gridTravelCalc(int cell, int row,Map<String,Long> map) {
		System.out.println("Start of cell:"+cell+" row:"+row);
		String key = cell+":"+row;
		if(map.containsKey(key)) return map.get(key);
		if( cell == 0 || row == 0) return 0;
		if(cell == 1 && row ==1) {
				System.out.println("returning 1 for cell="+cell+" and row="+row);
				return 1;
		}
		
		//traverse till finds 1,1 cell/row
		System.out.println();
		long returnVal = (long)gridTravelCalc(cell-1, row,map) 
					+ (long)gridTravelCalc(row-1, cell,map);
		map.put(key, returnVal);
		System.out.println("returning: "+returnVal+ "for cell="+cell+" and row="+row);
		System.out.println("End of cell:"+cell+" row:"+row);
		return returnVal;
	}
}
