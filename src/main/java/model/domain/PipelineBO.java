package model.domain;

import java.util.Collection;

public class PipelineBO {

	private LandWellBO landWells = null;
	private Collection<TankerBO> tankers = null;

	public LandWellBO getLandWells() {
		return landWells;
	}

	public Collection<TankerBO> getTankers() {
		return tankers;
	}

	public void setTankers(Collection<TankerBO> tankers) {
		this.tankers = tankers;
	}

	public void setLandWells(LandWellBO landWells) {
		this.landWells = landWells;
	}
}
