package ia.nancyborg2015;

import org.mbed.RPC.MbedRPC;
import org.mbed.RPC.RPCVariable;

/**
 * Created by mickael on 14/05/15.
 */
public class Etage {
	private RPCVariable<Float> setPoint;
	private RPCVariable<Float> position;
	private RPCVariable<Integer> enable;
	private RPCVariable<Integer> endstop;
	private RPCVariable<Float> speed;
	private RPCVariable<Float> output;

	public Etage(MbedRPC rpc) {
		this.setPoint = new RPCVariable<>(rpc, "SetPoint");
		this.position = new RPCVariable<>(rpc, "Position");
		this.enable = new RPCVariable<>(rpc, "Enable");
		this.endstop = new RPCVariable<>(rpc, "Endstop");
		this.output = new RPCVariable<>(rpc, "Output");

		this.setEnabled(false);
	}

	public void takeOrigin() {
		this.setEnabled(false);

		while (endstop.read_int() == 1) {
			this.output.write(-0.7f);
		}

		this.output.write(0f);
		this.setPosition(0.04f, true);
		this.setEnabled(true);
	}

	public float getPosition() {
		return this.position.read_float();
	}

	public void setPosition(float pos, boolean blocking) {
		this.setPoint.write(pos);

		if (blocking) {
			while (this.output.read_float() != 0f)
				;
		}
	}

	public void setEnabled(boolean val) {
		this.enable.write(val ? 1 : 0);
	}
}
