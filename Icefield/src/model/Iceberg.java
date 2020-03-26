package model;

import java.util.List;

public class Iceberg {
	private int snowUnit;
	private boolean igloos;
	private List<Iceberg> borderingIceberg;
	private List<Figure> figures;
	private List<IItem> items;
	public Iceberg(List<Iceberg> neighbouringIcebergs)
	{
		snowUnit = 1;
		igloos = false;
		borderingIceberg = neighbouringIcebergs;
	}
	public Iceberg getNeghbour(Dircetion direction)
	{
		switch (direction) 
		{
		case UP: return borderingIceberg.get(0); 
		case DOWN: return borderingIceberg.get(1); 
		case LEFT: return borderingIceberg.get(2);
		default : return borderingIceberg.get(3);
		}
	}
	public void accept(Figure f)
	{	
	}
	public void remove(Figure f)
	{
		
	}
	public void setNeighbout(Direction d, Iceberg i)
	{
		
	}
	public void decreaseSnow(int units) 
	{
		if(snowUnit - units < 0)
			snowUnit=0;
		else
			snowUnit-=units;
	}
	public void increaseSnow()
	{
		snowUnit++;
	}
	public boolean hasIgloos()
	{
		if(this.igloos==true)
			return true;
		else
			return false;
	}
	public void removeItem(IItem item)
	{
		
	}
	
}
