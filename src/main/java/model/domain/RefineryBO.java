package model.domain;

public class RefineryBO {

	private PipelineBO pipeline = null;
	
	private TankerBO tanker = null;

	private KeroseneBO kerosene = null;
	
	private GasolineBO gasoline = null;
	
	private LubricatingOilBO lubricatingOil = null;
	
	public KeroseneBO getKerosene() {
		return kerosene;
	}

	public void setKerosene(KeroseneBO kerosene) {
		this.kerosene = kerosene;
	}

	public GasolineBO getGasoline() {
		return gasoline;
	}

	public void setGasoline(GasolineBO gasoline) {
		this.gasoline = gasoline;
	}

	public LubricatingOilBO getLubricatingOil() {
		return lubricatingOil;
	}

	public void setLubricatingOil(LubricatingOilBO lubricatingOil) {
		this.lubricatingOil = lubricatingOil;
	}

	public PipelineBO getPipeline() {
		return pipeline;
	}

	public void setPipeline(PipelineBO pipeline) {
		this.pipeline = pipeline;
	}

	public TankerBO getTanker() {
		return tanker;
	}

	public void setTanker(TankerBO tanker) {
		this.tanker = tanker;
	}

	
}
