package model.domain;

import java.util.Collection;

public class LandWellBO {

	private Collection<PipelineBO> pipelines = null;

	public Collection<PipelineBO> getPipelines() {
		return pipelines;
	}

	public void setPipelines(Collection<PipelineBO> pipelines) {
		this.pipelines = pipelines;
	}
}
