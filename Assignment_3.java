public class Assignment3 {
	double avgRuns = 0.0;
	int totalRuns = 0;
	int scores[] = new int [7];
	double avgStrike = 0.0;
	void stats (Assignment2 as[])
	{
		for (Assignment2 assignment2 : as) {
			totalRuns += assignment2.total;
			for (int i = 0; i < assignment2.runType.length; i++) {
				scores[i] += assignment2.runType[i];
			}
			avgStrike += assignment2.strikeRate;
		}
		avgRuns = (double) totalRuns / (double)as.length;
		avgStrike /= (double)as.length; 
	}
	void show()
	{
		System.out.println("Statistics For An Innings are: ");
		System.out.println("Total runs scored is: "+totalRuns);
		System.out.println("Number of Ball for each score of run: ");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i + "->"+ scores[i]);
		}
		System.out.println("Average Strike rate: "+ avgStrike);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 as[] = new Assignment2 [5];
		as[0] = new Assignment2();as[1] = new Assignment2();as[2] = new Assignment2();as[3] = new Assignment2();
		as[4] = new Assignment2();
		
		as[0].statistics(new int[]{1,2,2,4,6,0,0,0,0,2,1,3,4,4,4,6,6,6});
		as[1].statistics(new int[]{6,2,3,3,0,0,0,1,1,1,1,0,1,0,2,2,4,6,0,0,0,0,2,1,3,0,2,4,3,6,6});
		as[2].statistics(new int[]{4,2,2,4,6,0,0,0,0,2,1,3,4,4,0,0,0,1,1,0,2,6,6,3});
		as[3].statistics(new int[]{0,1,2,4,6,6,6,6,6,0,0,0,0,0,2});
		as[4].statistics(new int[]{0,0,0,4,6,0,0,0,0,2,1,3,4,3,4,0,2,1,0,0,0,0,1,2,3,1,1,1,4});
		
		Assignment3 asnew = new Assignment3();
		asnew.stats(as);
		asnew.show();
	}

}
