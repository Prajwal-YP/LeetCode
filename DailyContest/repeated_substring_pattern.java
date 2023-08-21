class Solution {
    public boolean repeatedSubstringPattern(String s) {

        // The toal length of the input string
        int length  = s.length();

        // Traversing each substrings from index '0' to index 'length/2'(i.e. upto middle index) 
        for(short i=0; (i<length/2); i++){
            
            // String can be multiple of given substring, IF << LENGTH(substring)/LENGTH(string) =0 >>  
            if(length%(i+1)==0){
                // Extract substring from string through index  
                String subString = (s.substring(0,i+1));
                
                // Multiply the substring to fill the total length of string
                subString = subString.repeat(length/(i+1));

                // Check if out multipled substring is equal to string 
                if( subString.equals(s) )   return true;
            }
        }

        return false;
    }
}
