package job;

import unit.TypeStatistics;

public abstract class Supporter extends Job implements Careable{
	public Supporter(String name) {
		super(name,TypeStatistics.MENTAL);
	}
}