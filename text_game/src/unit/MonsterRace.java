package unit;

public enum MonsterRace {
	
	NOMAL(1.2,"노멀"),RARE(1.4,"레어"),UNIQUE(1.6,"유니크"),BOSS(2.2,"보스");
	
	private final double value;
	private final String grade;
	//magnification 배율
	private MonsterRace(double magnification,String grade) {
		this.value = magnification;
		this.grade = grade;
	}
	public int addValueOfRatio(int stat) {
		return (int)(randomAbility()*stat*value);
	}
	public int getGradePower(int att) {
		return (int)Math.ceil(this.value*att);
	}
	private double randomAbility() {
		return (Math.random()*5+8)/10;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("등급 : %s\n", this.grade);
	}
}
