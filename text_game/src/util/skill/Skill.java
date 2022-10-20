package util.skill;

import java.util.Objects;

public class Skill {
	
	private String name;
	private int consumMp;
	private int powerRate;
	
	public Skill(String name, int consumMp, int powerRate) {
		super();
		this.name = name;
		this.consumMp = consumMp;
		this.powerRate = powerRate;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getConsumMp() {
		return consumMp;
	}
	public void setConsumMp(int consumMp) {
		this.consumMp = consumMp;
	}
	public int getpowerRate() {
		return powerRate;
	}
	public void setpowerRate(int powerRate) {
		this.powerRate = powerRate;
	}
	
	@Override
	public String toString() {
		return String.format("기술명:%s,소모mp:%d,스킬배율:%d\n",this.name,this.consumMp,this.powerRate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(consumMp, name, powerRate);
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
		return consumMp == other.consumMp && Objects.equals(name, other.name) && powerRate == other.powerRate;
	}
s}
