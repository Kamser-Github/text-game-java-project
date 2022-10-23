package job;

import unit.TypeStatistics;

public abstract class Wizard extends Job{
	public Wizard(String name) {
		super(name,TypeStatistics.MAGIC);
	}
}
