package dungeon;

import java.util.ArrayList;

import monster.BossMonster;
import monster.Monster;
import monster.NomalMonster;
import monster.RareMonster;
import monster.UniqueMonster;
import unit.TypeStatistics;
import user.Player;

public class Dungeon {
	private ArrayList<Monster> monsters;
	private Player player;
	public Dungeon() {
		init();
	}
	public Dungeon(Player player) {
		init();
		joinDungeon(player);
	}
	private void init() {
		monsters = new ArrayList<Monster>();
		monsters.add(new NomalMonster("전사 고블린",TypeStatistics.PHYSICAL));
		monsters.add(new NomalMonster("마법사 고블린",TypeStatistics.MAGIC));
		monsters.add(new RareMonster("사제 고블린",TypeStatistics.MENTAL));
		monsters.add(new RareMonster("늑대 울프",TypeStatistics.PHYSICAL));
		monsters.add(new RareMonster("구울",TypeStatistics.PHYSICAL));
		monsters.add(new RareMonster("독 슬라임",TypeStatistics.PHYSICAL));
		monsters.add(new UniqueMonster("우두머리 고블린",TypeStatistics.PHYSICAL));
		monsters.add(new UniqueMonster("킹 머쉬룸",TypeStatistics.PHYSICAL));
		monsters.add(new UniqueMonster("이단 사제법사",TypeStatistics.MENTAL));
		monsters.add(new BossMonster("발록",TypeStatistics.PHYSICAL));
	}
	public void joinDungeon(Player player) {
		if(player==null)
			this.player = player;
	}
	
	public void battle() {
		
	}
}
