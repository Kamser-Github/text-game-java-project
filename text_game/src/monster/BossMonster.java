package monster;

import unit.MonsterRace;
import unit.TypeStatistics;
import unit.Unit;

public class BossMonster extends Monster{
	public BossMonster(String name, TypeStatistics type) {
		super(name, type,MonsterRace.BOSS);
	}
	@Override
	public void smashAttack(Unit target) {
		int smashPower = super.getPower()*super.smashAttackRatio();
		target.hunt(smashPower);
	}
}
