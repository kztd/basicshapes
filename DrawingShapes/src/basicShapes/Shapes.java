package basicShapes;

public class Shapes {
	public int _type = 0;
	public String _className = "";
	
	public void Print(){
		System.out.println(" +++++++++++Type "+ _type + ": " + _className);
	}
	public Shapes(int type){
		_type = type;
		_className = this.getClass().toString();
		System.out.println(Integer.toString(type) + ": " + _className + " super constructor");
		
	}

}
