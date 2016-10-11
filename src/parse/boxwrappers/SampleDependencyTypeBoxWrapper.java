package parse.boxwrappers;

import java.util.List;

import com.coremedia.iso.boxes.SampleDependencyTypeBox;

public class SampleDependencyTypeBoxWrapper {

	private SampleDependencyTypeBox sdtp;
	
	public SampleDependencyTypeBoxWrapper(SampleDependencyTypeBox box) {
		this.sdtp = box;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		List<SampleDependencyTypeBox.Entry> entries = sdtp.getEntries();
		result.append("[");
		result.append("entryCount=").append(entries.size());
		result.append(";");
		result.append("version=").append(sdtp.getVersion());
		result.append(";");
		result.append("flags=").append(sdtp.getFlags());
		result.append("]");
		return result.toString();
	}
}
