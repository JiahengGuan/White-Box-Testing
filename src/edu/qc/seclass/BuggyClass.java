package edu.qc.seclass;

public class BuggyClass {

    public int buggyMethod1(int a, int b){
        int special = 0;
        if (a<b)
             special = a/b;
        else if(a>b)
        	special = a+b;
        else 
        	special = 2*a;
        return special;
    }

    public int buggyMethod2(int a, int b){
        int special = 0;
        if (a<b)
        	special = a+b;
        else if(a>b)
        	special = a/b;
        else
        	special = a*b;
        return special;
    }

    public int buggyMethod3(int a, int b){
    	int special = 0;
    	if(a < 0)
			 return a;
		else if(b != 0) 
			 return b/a;
		else
			special = 1;
		return a/special;
    }

    public int buggyMethod4(int a, int b){
    	if(a > 0)
			 return a/b;
		 else if(b > 0) 
			 return b/a;
		 return a/b;
    }

    public void buggyMethod5(){
        /*In my opinion, it's impossible to satisfy the first requirement.Because if we want to achieves 100% statement coverage, 
         *it means we must run all lines of the method. But for line 4(x = i/0), we can not skip this line or run it successfully,
         *achieves 100% statement coverage, so the first requirement fails already.*/
    }
}
