package monster;

import unit.MonsterRace;
import unit.TypeStatistics;
import unit.Unit;

public class RareMonster extends Monster{
	public RareMonster(String name, TypeStatistics type) {
		super(name, type,MonsterRace.RARE);
	}
	@Override
	public void smashAttack(Unit target) {
		int smashPower = super.getPower()*super.smashAttackRatio();
		target.hunt(smashPower);
	}
}
