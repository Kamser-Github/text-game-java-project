package monster;

import unit.MonsterRace;
import unit.TypeStatistics;
import unit.Unit;

public abstract class Monster extends Unit{
	private MonsterRace myGrade;
	public Monster(String name, TypeStatistics type, MonsterRace monster) {
		super(name, type, monster);
		myGrade = monster;
	}
	@Override
	public void standardAttack(Unit target) {
		target.hunt(super.getPower());
	}
	public int smashAttackRatio() {
		int ratio = myGrade.getGradePower(super.getPower());
		return ratio;
	}
}
