public int solution(int[] A) {
        if(A.length>1){
        int min=Integer.MAX_VALUE,l=A[0],r=Integer.MIN_VALUE;
        int[]B=new int[A.length];
        int val=B[A.length-1];
        for(int i=A.length-1;i>=0;i--){
            if(val<A[i])
                val=A[i];
            B[i]=val;
        }
        for(int i=0;i<A.length-1;i++){
            if(l<A[i])
                l=A[i];
            r=B[i+1];
            int result=(l*(i+1))+(r*(A.length-i-1));
            r=Integer.MIN_VALUE;
            if(result<min)
                min=result;
        }
        return min;
    }
        else
            return A[0];
    }
