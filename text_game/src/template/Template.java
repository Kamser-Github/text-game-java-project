package template;

import java.util.Random;

public class Template {
	/*
	   방어력,명중력,회피력,공격력을 이름별로 다르게 지정하고싶다.
	   01 방어력=> 튼튼한  
	   02 명중력=> 백발백중의 
	   03 회피력=> 행운의
	   04 공격력=> 힘이 쎈
	   배열4개로 만들어서
	   각자 배열에 확률을 계산해서 이름앞에 붙이고. 어빌리티를 계산.
	   
	   
	   이걸 정해주는 클래스를 만들어야겟다.
	   몹에는 고유레벨 존재
	   
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
	public static void main(String[] args) {
		System.out.println(new Random().nextDouble());
	}
}
