import static org.junit.Assert.*;
import org.junit.Test;

public class testPositive {

	@Test
	public void test(){
}

	public testPositive(){
		int[] arr=new int[5];
		arr[0]=8;
		arr[1]=9;
		arr[2]=7;
		arr[3]=10;
		arr[4]=20;
		SelectionSort temp1=new SelectionSort();
		int maxValue=temp1.sort(arr);
		assertEquals(20,maxValue);
		}
	}

