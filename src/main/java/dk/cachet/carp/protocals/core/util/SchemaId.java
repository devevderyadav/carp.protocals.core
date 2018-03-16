
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
    "namespace",
    "name",
    "version"
})
public class SchemaId {

    @JsonProperty("namespace")
    private String namespace;
    @JsonProperty("name")
    private String name;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    @JsonProperty("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
        return new ToStringBuilder(this).append("namespace", namespace).append("name", name).append("version", version).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(name).append(version).append(namespace).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchemaId) == false) {
            return false;
        }
        SchemaId rhs = ((SchemaId) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(version, rhs.version).append(namespace, rhs.namespace).isEquals();
    }

}
