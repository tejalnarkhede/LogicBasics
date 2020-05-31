
public class Area {
	final float pi=3.14f;
	public float circleArea(float r)
	{
		return pi*r*r;
	}
	
	public float triangleArea(float b,float h)
	{
			return 0.5f*b*h;
	}

	public float rectangleArea(float l,float b)
	{
		return l*b;
	}
}
