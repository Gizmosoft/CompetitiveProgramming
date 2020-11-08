package geeksForGeeks_GFG.puzzles;

public class TowerOfHanoi {
	static void solveTower(int n, char from, char extra, char to){
		if(n==1){
			System.out.println("Move disk 1 from rod " + from + " to rod " + to);
			return;
		}
		solveTower(n-1, from, to, extra);
		System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
		solveTower(n-1, extra, from, to);
	}
	

	public static void main(String[] args) {
		int n = 4;
		solveTower(n, 'A', 'B', 'C');
	}
}
