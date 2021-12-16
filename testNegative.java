import static org.junit.Assert.*;
import org.junit.Test;

public class testNegative {
	@Test
	public void test(){
}
	public testNegative(){
		int[] arr=new int[5];
		arr[0]=-7;
		arr[1]=-2;
		arr[2]=-1;
		arr[3]=-10;
		arr[4]=-2;
		SelectionSort temp1=new SelectionSort();
		int maxValue=temp1.sort(arr);
		assertEquals(-1,maxValue);
		}
	}