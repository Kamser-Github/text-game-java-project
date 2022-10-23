package job;

import unit.TypeStatistics;

public abstract class Warrior extends Job implements Hurt{
	public Warrior(String name) {
		super(name,TypeStatistics.PHYSICAL);
	}
}
