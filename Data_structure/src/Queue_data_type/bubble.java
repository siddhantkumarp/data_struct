package Queue_data_type;
import java.util.Arrays;

public class bubble {

	public static void main(String[] args) {
		int n=5;
		int a[]= {114,20,3,40,35};
		System.out.println("Number to be sorted");
		for(int i=0;i<=n-1;++i) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<=n-2;++i) {
			for(int j=0;j<=n-2-i;++j) {
				if(a[j]>a[j+1]) {
				int	temp;
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
			
		}	
       for(int i=0;i<=n-1;++i) {
    	   System.out.print(a[i]+"\t");
       }
	}

}

