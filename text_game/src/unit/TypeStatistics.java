package unit;

public enum TypeStatistics {
	PHYSICAL(1,"전사",30,-10,1,3),MAGIC(2,"마법",-20,15,3,-1),MENTAL(3,"치유",-20,30,-1,-1);
	
	private final int type;
	private final String typeName;
	private final int additionalHp;
	private final int additionalMp;
	private final int additionalAtt;
	private final int additionalDef;
	
	private TypeStatistics(int type,String typeName,int additionalHp,int additionalMp,int additionalAtt,int additionalDef) {
		this.type = type;
		this.typeName = typeName;
		this.additionalHp = additionalHp;
		this.additionalMp = additionalMp;
		this.additionalAtt = additionalAtt;
		this.additionalDef = additionalDef;
	}
	public int addHp(int hp) {
		return this.additionalHp+hp;
	};
	public int addMp(int mp) {
		return this.additionalMp+mp;
	};
	public int addAtt(int att) {
		return this.additionalAtt+att;
	};
	public int addDef(int def) {
		return this.additionalDef+def;
	};
	
	@Override
	public String toString() {
		return super.toString()+", 계열:"+typeName;
	}
}
