package job;

import java.util.ArrayList;
import java.util.HashMap;
import unit.Unit;
import util.skill.Skill;

public abstract class Job extends Unit{
	
	private HashMap<Integer,Skill> skills;
	public Job(String name, int exp) {
		super(name, exp);
		init();
	}
	private void init() {
		skills = new HashMap<Integer,Skill>();
	}
	private void printSkillInfo(Integer i,Skill s) {
		String skillNumber = 
				String.format("%d번 스킬 : %s",i,s);
		System.out.println(skillNumber);
	}
	private void printSkillList() {
		skills.forEach((i,s)->printSkillInfo(i,s));
	}
	public void battle(ArrayList<Unit> units) {
		printSkillList();
		System.out.println("스킬을 선택해주세요.");
	}
	private int executeSkill(Skill skill) {
	}
	public abstract void uniqueSkill(Unit unit);
	
}
