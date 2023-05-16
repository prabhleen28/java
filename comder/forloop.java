package comder;


	public class forloop {
	    public static void main(String[] args){
	        int n=5;
	     outer:   for(int i=0;i<n;i++){
	           inner: for(int j=0;j<n;j++){
	            if(i==j){
	                System.out.print(i);
	            }
	            if(i!=j){
	                break outer;
	            }
	            }
	        }
	        System.out.println("out of loop outer");
	    }
	}

