package unit;

import java.util.Random;

public abstract class Unit {
	
	public static Random ran;
	private String name;
	private int hp;
	private int mp;
	private int att;
	private int def;
	private double lucky;//0.0~0.999;
	private double accuracyRate;//0.0~0.999;
	private int exp;//경험치
	
	public Unit(String name,int exp) {
		this.name = name;
		this.exp = exp;
		init();
	}
	//getter setter
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getAtt() {
		return att;
	}
	public void setAtt(int att) {
		this.att = att;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public double getLucky() {
		return lucky;
	}
	public void setLucky(double lucky) {
		this.lucky = lucky;
	}
	public double getAccuracyRate() {
		return accuracyRate;
	}
	public void setAccuracyRate(double accuracyRate) {
		this.accuracyRate = accuracyRate;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	
	private void init() {
		ran = new Random();
	}
	private double rate() {
		return Unit.ran.nextDouble();
	}
	//기본 공격 (공격력 계산은 직업,몬스터별로 따로적용)
	public abstract void standardAttack(Unit unit);//약공격
	//스매시 공격 (공격력 계산은 직업,몬스터별로 따로적용)
	public abstract void smashAttack(Unit unit);//강공격
	//명중 여부
	public boolean isAccuracy() {
		return this.accuracyRate>rate();
	}
	//스매시 여부
	public boolean isLucky() {
		return this.lucky>rate();
	}
	
	//실패 매서드
	public void missMessage(Unit unit) {
		String result =
				String.format("%s이(가) %s에게 공격이 실패했습니다.",this.name,unit.name);
		System.out.println(result);
	}
	//공격 매서드 적용
	public void attack(Unit unit) {
		if(isLucky()&&isAccuracy()) {
				smashAttack(unit);
		}
		else if(!isLucky()&&isAccuracy()) {
				standardAttack(unit);
		}
		else
			missMessage(unit);
	}
}
