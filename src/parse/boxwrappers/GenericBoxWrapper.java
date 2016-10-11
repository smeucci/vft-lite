package parse.boxwrappers;

import com.googlecode.mp4parser.AbstractFullBox;

public class GenericBoxWrapper<T extends AbstractFullBox> {

	private T box;
	
	public GenericBoxWrapper(T box) {
		this.box = box;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(box.toString().replaceAll("\\]|\\}", ""));
		result.append(";");
		result.append("version=").append(box.getVersion());
		result.append(";");
		result.append("flags=").append(box.getFlags());
		result.append("]");
		return result.toString();		
	}
}
