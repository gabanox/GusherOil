package model.domain;

import java.util.Collection;

public class TankerBO {

	private Collection<OffshoreRigBO> offshoreRigs = null;

	private Collection<PipelineBO> pipelines = null;
	
	public Collection<PipelineBO> getPipelines() {
		return pipelines;
	}

	public void setPipelines(Collection<PipelineBO> pipelines) {
		this.pipelines = pipelines;
	}

	public Collection<OffshoreRigBO> getOffshoreRigs() {
		return offshoreRigs;
	}

	public void setOffshoreRigs(Collection<OffshoreRigBO> offshoreRigs) {
		this.offshoreRigs = offshoreRigs;
	}

	
}
