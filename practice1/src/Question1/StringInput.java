package Question1;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String check = "";
      for(int a=0;a<args.length;a++) {
    	  for(int b=1;b<(args.length-a);b++) {
    		  if(args[b-1].length()>args[b].length())
    		  {
    			  check=args[b-1];
    			  args[b-1]=args[b];
    			  args[b]=check;
    		  }
    		  
    		  
    		  
    	  }
      }
      for(int a=0;a<args.length;a++) {
    	  System.out.println(args[a]);
      }
	
	
	
	}

}
