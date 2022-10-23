package monster;

import unit.MonsterRace;
import unit.TypeStatistics;
import unit.Unit;

public class UniqueMonster extends Monster {
	public UniqueMonster(String name, TypeStatistics type) {
		super(name, type,MonsterRace.UNIQUE);
	}
	@Override
	public void smashAttack(Unit target) {
		int smashPower = super.getPower()*super.smashAttackRatio();
		target.hunt(smashPower);
	}
}
