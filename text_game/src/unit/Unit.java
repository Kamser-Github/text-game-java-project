package unit;

import java.util.Random;
public abstract class Unit {
	
	public static Random ran;
	private String name;
	private AutoAbility ability;
	//배열을 가지고 있다.값으로 공격을 한다면.
	//애가 가진 배열을 꺼내서 값을 대입
	public Unit(String name) {
		this.name = name;
		init();
	}
	public Unit(String name,TypeStatistics type) {
		this(name);
		ability = new AutoAbility(type);
	}
	public Unit(String name,TypeStatistics type,MonsterRace monster) {
		this(name);
		ability = new AutoAbility(type,monster);
	}
	private void init() {
		ran = new Random();
	}
	private int getExp() {
		return this.ability.getExp();
	}
	public int getPower() {
		return this.ability.getAtt();
	}
	public int getHp() {
		return this.ability.getHp();
	}
	public int getMp() {
		return this.ability.getMp();
	}
	public String getName() {
		return name;
	}
	//기본 공격 (공격력 계산은 직업,몬스터별로 따로적용)
	public abstract void standardAttack(Unit unit);//약공격
	//스매시 공격 (공격력 계산은 직업,몬스터별로 따로적용)
	public abstract void smashAttack(Unit unit);//강공격
	private int rate() {
		return Unit.ran.nextInt(100);
	}
	//명중 여부
	private boolean isAccuracy() {
		int myAccuary = this.ability.getAccuracy();
		return myAccuary>rate();
	}
	private boolean isLucky() {
		int myLucky = this.ability.getLucky();
		return myLucky>rate();
	}
	public boolean giveExp(Unit target) {
		int myExp = this.getExp();
		AutoAbility otherAbility = target.ability;
		return otherAbility.addExp(myExp);
	}
	//실패 매서드
	public void missMessage(Unit unit) {
		String result =
				String.format("%s이(가) %s에게 공격시도가 실패했습니다.",this.name,unit.name);
		System.out.println(result);
	}
	//공격 매서드 적용
	public void attack(Unit unit) {
		if(isAccuracy()) {
			missMessage(unit); return;
		}
		if(isLucky()) {
			smashAttack(unit); return;
		}
		standardAttack(unit);
	}
	//데미지
	public boolean hunt(int damage) {
		int def = this.ability.getDef();
		int calcDamage = def-damage;
		if(def-damage>0) {
			return false;
		}
		return this.ability.cutHp(calcDamage);
	}
	//죽음
}
