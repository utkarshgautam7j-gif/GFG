import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n,0));

        // code here
        
    }
    public static int sum(int n,int ans){
        if(n==0) return ans;
        return sum(n-1,ans+n);
    }
}