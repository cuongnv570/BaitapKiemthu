
public class TamGiac {
	public int a, b, c;
	
	public TamGiac(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean IsTamGiac(){
		if((a+b >c) && (a+c >b)&& (b+c >a))
			return true;
		else 
			return false;
	}
	public String TypeTamGiac(){
		if(this.IsTamGiac() == true){
			if((a==b)&&(b==c)){
				return "Equilateral";
			}
			else if((a==c)||(a==b)||(b==c)){
				return "Isosceles";
			}
			else{
				return "Scalene";
			}
		}
		return "NotATriangle";
	}
}