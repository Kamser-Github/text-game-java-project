package job;

import java.util.Scanner;

import unit.TypeStatistics;
import unit.Unit;
public abstract class Job extends Unit{
	private Scanner sc;
	public Job(String name, TypeStatistics type) {
		super(name, type);
		sc = new Scanner(System.in);
	}
	public abstract double useSkill();
	public abstract void showSkills();
	public int chooseNumber() {
		System.out.println("스킬 번호를 골라주세요");
		return sc.nextInt()-1;
	}
	public int skillDamage() {
		return (int)Math.ceil(super.getPower()*useSkill());
	}
	public int smashSkillDamage() {
		return (int)Math.ceil(skillDamage()*smashRatio());
	}
	private double smashRatio() {
		return (ran.nextInt(5)+12)/10;
	}
}
