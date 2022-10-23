package job;

import java.util.ArrayList;
import unit.Unit;
import util.skill.MagicSkill;
public class Alchemist extends Wizard{
	
	private ArrayList<MagicSkill> skills;
	private final int KIND;
	public Alchemist() {
		super("연금술사");
		init();
		KIND = skills.size();
	}
	private void init() {
		//skill ( name, cousumMp , powerRate )
		skills = new ArrayList<MagicSkill>();
		skills.add(new MagicSkill("플루토",10,1.1));
		skills.add(new MagicSkill("변이 파리채",12,1.2));
		skills.add(new MagicSkill("용암지대 생성물약",13,1.3));
		skills.add(new MagicSkill("빗자루 스핀",14,2));
		skills.add(new MagicSkill("메가드릴",20,2.5));
		skills.add(new MagicSkill("우로보로스",25,2.9));
		skills.add(new MagicSkill("플로레 전기토끼",33,3.2));
		skills.add(new MagicSkill("아르스마그나",40,4.2));
	}
	@Override
	public double useSkill() {
		while(true) {
			showSkills();
			int sel = chooseNumber();
			if(skillRange(sel))
				continue;
			alertSkill(sel);
			return getSkillRatio(sel);
		}
	}
	@Override
	public void showSkills() {
		for(int i=0 ; i<KIND ; i++) {
			System.out.println(getSkillInfo(i));
		}
	}
	@Override
	public void standardAttack(Unit target) {
		target.hunt(super.skillDamage());
	}
	@Override
	public void smashAttack(Unit target) {
		target.hunt(super.smashSkillDamage());
	}
	private void alertSkill(int index) {
		System.out.println(skills.get(index).getName()+"을 사용했습니다.");
	}
	private String getSkillInfo(int skillOfIndex) {
		String skillInfo = skills.get(skillOfIndex).toString();
		return String.format("%d번 : %s",skillOfIndex+1,skillInfo);
	}
	private boolean skillRange(int index) {
		return index<0||index>=KIND;
	}
	private double getSkillRatio(int index) {
		return skills.get(index).getpowerRate();
	}
}
