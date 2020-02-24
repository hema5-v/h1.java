class Plant
{
	private boolean Fragnance;
	private String typesOfRoses;
	private int noOfFlowers;
	public Plant(boolean frag,String typ,int NOF)
	{
		Fragnance=frag;
		typesOfRoses=typ;
		noOfFlowers=NOF;
	}
	public boolean isFragnance()
	{
		return Fragnance;
	}
	public String gettypesOfRoses()
	{
		return typesOfRoses;
	}
	public int getnoOfFlowers()
	{
		return noOfFlowers;
	}
}
class Rose extends Plant
{
	private String color;
	public Rose(boolean frag,String typ,int NOF,String col) 
	{
		super(frag,typ,NOF);
		color=col;
	}
	public String getColor()
	{
		return color;
	}
}
class inheritance
{
	public static void main(String[] args)
	{
		Rose r=new Rose(true,"dog rose ,french rose,cabbage rose",3,"Red");
		System.out.println("rose is fragnant?" + r.isFragnance());
		System.out.println("types os roses " + r.gettypesOfRoses());
		System.out.println("plant has " + r.getnoOfFlowers() + " flowers");
		System.out.println("rose is " + r.getColor() + "in color");
	}
}
