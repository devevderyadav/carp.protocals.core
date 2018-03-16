
package dk.cachet.carp.protocals.core.util;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "source_name", "modality" })
public class AcquisitionProvenance {
	
	@JsonProperty("source_name")
	private String sourceName;
	@JsonProperty("modality")
	private String modality;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("source_name")
	public String getSourceName() {
		return sourceName;
	}
	
	@JsonProperty("source_name")
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	
	@JsonProperty("modality")
	public String getModality() {
		return modality;
	}
	
	@JsonProperty("modality")
	public void setModality(String modality) {
		this.modality = modality;
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("sourceName", sourceName).append("modality", modality)
				.append("additionalProperties", additionalProperties).toString();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(sourceName).append(modality).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof AcquisitionProvenance) == false) {
			return false;
		}
		AcquisitionProvenance rhs = ((AcquisitionProvenance) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties)
				.append(sourceName, rhs.sourceName).append(modality, rhs.modality).isEquals();
	}
	
}
