
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
@JsonPropertyOrder({
    "id",
    "creation_date_time",
    "schema_id",
    "acquisition_provenance"
})
public class Header {

    @JsonProperty("id")
    private String id;
    @JsonProperty("creation_date_time")
    private String creationDateTime;
    @JsonProperty("schema_id")
    private SchemaId schemaId;
    @JsonProperty("acquisition_provenance")
    private AcquisitionProvenance acquisitionProvenance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("creation_date_time")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    @JsonProperty("creation_date_time")
    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    @JsonProperty("schema_id")
    public SchemaId getSchemaId() {
        return schemaId;
    }

    @JsonProperty("schema_id")
    public void setSchemaId(SchemaId schemaId) {
        this.schemaId = schemaId;
    }

    @JsonProperty("acquisition_provenance")
    public AcquisitionProvenance getAcquisitionProvenance() {
        return acquisitionProvenance;
    }

    @JsonProperty("acquisition_provenance")
    public void setAcquisitionProvenance(AcquisitionProvenance acquisitionProvenance) {
        this.acquisitionProvenance = acquisitionProvenance;
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
        return new ToStringBuilder(this).append("id", id).append("creationDateTime", creationDateTime).append("schemaId", schemaId).append("acquisitionProvenance", acquisitionProvenance).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(creationDateTime).append(id).append(additionalProperties).append(schemaId).append(acquisitionProvenance).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Header) == false) {
            return false;
        }
        Header rhs = ((Header) other);
        return new EqualsBuilder().append(creationDateTime, rhs.creationDateTime).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(schemaId, rhs.schemaId).append(acquisitionProvenance, rhs.acquisitionProvenance).isEquals();
    }

}
