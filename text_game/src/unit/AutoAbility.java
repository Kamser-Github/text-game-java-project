package unit;

import java.util.LinkedHashMap;

public class AutoAbility {
	private LinkedHashMap<String,Integer> statistics;
	public AutoAbility() {
		init();
	}
	public AutoAbility(TypeStatistics type) {
		this();
		initType(type);;
	}
	public AutoAbility(TypeStatistics type,MonsterRace monster) {
		this(type);
		initMonster(monster);
	}
	private void init(){
		this.statistics = new LinkedHashMap<String,Integer>();
		this.statistics.put("hp", 100);
		this.statistics.put("mp", 100);
		this.statistics.put("att", 10);
		this.statistics.put("def", 10);
		this.statistics.put("lucky", 10);
		this.statistics.put("accuracy", 60);
		this.statistics.put("exp", 0);
	}
	private void initType(TypeStatistics type) {
		if(type==null) {
			printTypeInfo();
			return;
		}
		this.statistics.computeIfPresent("hp", (s,hp)->type.addHp(hp));
		this.statistics.computeIfPresent("mp", (s,mp)->type.addMp(mp));
		this.statistics.computeIfPresent("att", (s,att)->type.addMp(att));
		this.statistics.computeIfPresent("def", (s,def)->type.addMp(def));
	}
	private void initMonster(MonsterRace monster) {
		if(monster==null) {
			printMonsterInfo();
			return;
		}
		this.statistics.replace("exp", 20);
		this.statistics.replaceAll((ability,value)->monster.addValueOfRatio(value));
	}
	private void printTypeInfo() {
		System.out.println("해당 직업계열은 존재하지 않습니다.");
		for(TypeStatistics type : TypeStatistics.values()) {
			System.out.println(type);
		}
	}
	private void printMonsterInfo() {
		System.out.println("해당 직업계열은 존재하지 않습니다.");
		for(MonsterRace type : MonsterRace.values()) {
			System.out.println(type);
		}
	}
	public int getHp() {
		return this.statistics.get("hp");
	}
	public int getMp() {
		return this.statistics.get("mp");
	}
	public int getAtt() {
		return this.statistics.get("att");
	}
	public int getDef() {
		return this.statistics.get("def");
	}
	public int getLucky() {
		return this.statistics.get("lucky");
	}
	public int getAccuracy() {
		return this.statistics.get("accuracy");
	}
	public int getExp() {
		return this.statistics.get("exp");
	}
	public boolean cutHp(int damage) {
		if(statistics.get("hp")-damage<=0) {
			return false;
		}
		this.statistics.computeIfPresent("hp", (s,hp)->hp-damage);
		return true;
	}
	public boolean addExp(int exp) {
		if(exp<=0){
			return false;
		}
		this.statistics.computeIfPresent("exo", (s,e)->e+exp);
		return true;
	}
	
	@Override
	public String toString() {
		return this.statistics.toString();
	}
}

