package unit;

public abstract class Unit {
	private int name;
	private int hp;
	private int mp;
	private int att;
	private int def;
	private double lucky;
	private double accuracyRate;
	private int exp;
	
	public abstract void standardAttack(Unit unit);//약공격
	public abstract void smashAttack(Unit unit);//강공격
	public abstract boolean isAccuracy();
	public abstract boolean isLucky();
	
	public void attack(Unit unit) {
		if(isLucky()) {
			if(isAccuracy()) {
				smashAttack(unit);
			}
		}
		else {
			if(isAccuracy()) {
				standardAttack(unit);
			}
		}
	}
/*
   하나의 메서드에 스킬만 변경하고 싶은데.
   
   매서드하나로 내가 가진 스킬을 골라서 , 선택으로 지정하기.
   
   고유스킬을 쓴다면
   확률을 계산해서 miss가 나오면 공격을 피하는거자나
   
   스킬 인터페이스로 스킬매서드를 불러서 거기에 
   인터페이스 고유스킬을 넣어주면
   
   인터페이스로 구현애들은 다같이 사용하게 하거나
   인터페이스를 구현한 애들을 다같이 적용시키거나(힐러)
   
   공통
   이름
   기본공격 / 스매쉬
   어빌리티
   
	몹 		<   > 직업
   기본 공격		 고유 스킬
    		 	 고유이름
   경험치를주고  	 
    
   엘리트몹		 
   스킬이 추가		 경험치를 받고
   
   보스
   스킬이 추가
   아이템 드랍
*/
}
