

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []a= {12,8,1,9,5,4};
        for(int i=0;i<a.length;i++)
        {  
            for(int j=i+1;j<a.length;j++) 
            {
        	if(a[i]>a[j])
        	  {
        		int x=a[j];
        		a[j]=a[i];
        		a[i]=x;
        	  }
        	}
        }
      int z=a[(a.length)-2];
        System.out.println(z);
	}

}
