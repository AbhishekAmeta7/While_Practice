import java.util.*;
class A{
    int calculate(int m , int n){
        int ans = 0;
        for(int i = m;i<=n;i++){
            
            if(i%3 == 0 && i%5==0){
                ans=ans+i;
            }
            
        }
        return ans;
    }
}
public class TestEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        A a = new A();
        System.out.println(a.calculate(m, n));
    }
}
