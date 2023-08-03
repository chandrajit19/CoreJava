class Room
{
   int l, b;
	int area;
   
	Room(int s, int t)
		{
			l=s;
			b=t;
		}

     void findArea()
     {
	    area=(l*b);
	    System.out.println("Area of room is = " +area);
     }

}

class BedRoom extends Room
{  int h;
     BedRoom(int x, int y, int z)
	{
		 super(x, y);
		 h=z;
	}
	void findVolume()
	{
		int v=(l*b*h);
		System.out.println("Volume is = " +v);
	}
}
class RoomApp
{
	public static void main(String args[])
	{
		BedRoom obj=new BedRoom(10,20,30);
		obj.findArea();
		obj.findVolume();
	}
} 
