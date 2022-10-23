package monster;

import unit.MonsterRace;
import unit.TypeStatistics;
import unit.Unit;

public class NomalMonster extends Monster {
	public NomalMonster(String name, TypeStatistics type) {
		super(name, type,MonsterRace.NOMAL);
	}
	@Override
	public void smashAttack(Unit target) {
		int smashPower = super.getPower()*super.smashAttackRatio();
		target.hunt(smashPower);
	}
}
