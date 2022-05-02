// java program to find the lcm of four numbers
import java.util.*;
class LCMproblem{
	public static void main(String[] args) {
		int lcm, n1, n2, n3, n4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four numbers : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		lcm = ((n1> n2 && n1> n3 && n1> n4)) ? n1 : ((n2>n3 && n2 > n4)? n2 : ( n3 > n4 ? n3: n4));
		while(true){
			if( lcm % n1 == 0 && lcm % n2 == 0 && lcm % n3 == 0 && lcm % n4 == 0 ){
				System.out.printf("the least common multiple of %d, %d, %d and %d is %d", n1, n2, n3, n4, lcm);
				break;
			}
		lcm++;
		}
	}
}