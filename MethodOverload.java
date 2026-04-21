class Active {
    public void run(int x) {
        System.out.println(x);
    }
    public void run(int x,int y) {
        System.out.println(x+y);
    }
}
public class MethodOverload {
	public static void main(String[] args) {
	   Active obj = new Active();
	   obj.run(4);
	   obj.run(5,2);
	}
}
