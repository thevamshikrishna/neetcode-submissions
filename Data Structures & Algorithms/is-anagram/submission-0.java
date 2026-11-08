class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;

        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();

        ArrayList<Integer> arr=new  ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();

        for(int x:ch){
            arr.add(x);
        }

        for(int y:ch1){
            arr1.add(y);
        }

        Collections.sort(arr);
        Collections.sort(arr1);


        return arr.equals(arr1);
    }
}
