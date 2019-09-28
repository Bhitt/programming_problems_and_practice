class Solution {
    public int reverse(int x) {
        boolean neg=false;
        int temp=0;
        if(x<0){
            x*=-1;
            neg=true;
            if(x<0) return 0;
        }
        int f = 0;
        String s = Integer.toString(x);
        
        for(int i=0;i<s.length();i++){
            temp = f + (int) ((Integer.valueOf(s.substring(i,i+1)))*Math.pow(10,i));
            if( temp < f) return 0;
            else f += (int) ((Integer.valueOf(s.substring(i,i+1)))*Math.pow(10,i));
        }
        if(neg) f*=-1;
        return f;
    }
}