
public class Avenger implements Comparable<Avenger> {
	private String heroAlias;
	private String heroName;
	private String performer;

	private int nameFreq;
	private int aliasFreq;
	private int performerFreq;
	
	// TODO: Implement the Avenger Class
	  public Avenger(String alias, String name, String per, int nameFreq, int aliasFreq, int perFreq)
	    {
	        this.heroAlias = alias;
	        this.heroName = name;
	        this.performer = per;
	        this.nameFreq = nameFreq;
	        this.aliasFreq = aliasFreq;
	        this.performerFreq = perFreq;
	    }
	
	public String getHeroAlias() {
		return heroAlias;
	}

//	public void setHeroAlias(String heroAlias) {
//		this.heroAlias = heroAlias;
//	}

	public String getHeroName() {
		return heroName;
	}

//	public void setHeroName(String heroName) {
//		this.heroName = heroName;
//	}

	public String getPerformer() {
		return performer;
	}

//	public void setPerformer(String performer) {
//		this.performer = performer;
//	}

	public int getNameFreq() {
		return nameFreq;
	}

//	public void setNameFreq(int nameFreq) {
//		this.nameFreq = nameFreq;
//	}

	public int getAliasFreq() {
		return aliasFreq;
	}

//	public void setAliasFreq(int aliasFreq) {
//		this.aliasFreq = aliasFreq;
//	}

	public int getPerformerFreq() {
		return performerFreq;
	}

//	public void setPerformerFreq(int performerFreq) {
//		this.performerFreq = performerFreq;
//	}
	
	public int avengerMentionCount () {
		return this.getAliasFreq() + this.getNameFreq() + this.getPerformerFreq();
		
	}

	
	@Override
	public int compareTo(Avenger a) {
		int result = this.getHeroAlias().compareTo(a.getHeroAlias()); 
		if (result == 0) {
			result = this.getHeroName().compareTo(a.getHeroName()); 
		}
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avenger other = (Avenger) obj;
		if (aliasFreq != other.aliasFreq)
			return false;
		if (heroAlias == null) {
			if (other.heroAlias != null)
				return false;
		} else if (!heroAlias.equals(other.heroAlias))
			return false;
		if (heroName == null) {
			if (other.heroName != null)
				return false;
		} else if (!heroName.equals(other.heroName))
			return false;
		if (nameFreq != other.nameFreq)
			return false;
		if (performer == null) {
			if (other.performer != null)
				return false;
		} else if (!performer.equals(other.performer))
			return false;
		if (performerFreq != other.performerFreq)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return heroAlias + " aka " + heroName 
				+ " performed by " + performer 
				+ " mentioned " 
				+ "(n: " + nameFreq  
				+ " + a: " + aliasFreq 
				+ " + p: " + performerFreq 
				+ ")" + " time(s)";				}
	

}
