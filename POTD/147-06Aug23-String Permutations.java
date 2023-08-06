//PROBLEM LINK IN EXTENDED DESCRIPTIOM

class Solution
{    
    static ArrayList<String> al=new ArrayList<>();
    public ArrayList<String> permutation(String S)
    {   al.clear();
        perm(S,"");
        Collections.sort(al);
        return al;
    }
    static boolean perm(String str,String ans){
        if(str.length()==0)  return al.add(ans);
        for(int i=0;i<str.length();i++) perm(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i)); 
        return true;
    }
}
