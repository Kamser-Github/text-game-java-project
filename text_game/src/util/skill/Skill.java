package util.skill;

import java.util.Objects;

public class Skill {
	
	private String name;
	private int consumMp;
	private double powerRate;
	
	public Skill(String name, int consumMp, double powerRate) {
		this.name = name;
		this.consumMp = consumMp;
		this.powerRate = powerRate;
	}

	public String getName() {
		return name;
	}
	public int getConsumMp() {
		return consumMp;
	}
	public double getpowerRate() {
		return powerRate;
	}
	
	@Override
	public String toString() {
		return String.format("기술명:%-10s,소모mp:%-3d,스킬배율:%-2.1f",this.name,this.consumMp,this.powerRate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, powerRate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skill other = (Skill) obj;
		return Objects.equals(name, other.name) && powerRate == other.powerRate;
	}
}
