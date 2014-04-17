package com.ph.entities;

public abstract class AbstractEntity {
	
	public abstract Object getId();

	public boolean isTransient() {
		return getId() == null;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof AbstractEntity))
			return false;

		
		AbstractEntity other = (AbstractEntity) obj;

		if (this.getId() == null || other.getId() == null)
			return false;

		return this.getId() != null && this.getId().equals(other.getId());
	}

	@Override
	public int hashCode() {
		return this.getId() != null ? this.getId().hashCode() : super.hashCode();
	}

}
