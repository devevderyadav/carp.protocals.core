
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
    "deploymentId",
    "deviceRoleName",
    "triggerId",
    "userId",
    "formatID",
    "header",
    "body"
})
public class DataUpload {

    @JsonProperty("deploymentId")
    private String deploymentId;
    @JsonProperty("deviceRoleName")
    private String deviceRoleName;
    @JsonProperty("triggerId")
    private String triggerId;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("formatID")
    private String formatID;
    @JsonProperty("header")
    private Header header;
    @JsonProperty("body")
    private Body body;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("deploymentId")
    public String getDeploymentId() {
        return deploymentId;
    }

    @JsonProperty("deploymentId")
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    @JsonProperty("deviceRoleName")
    public String getDeviceRoleName() {
        return deviceRoleName;
    }

    @JsonProperty("deviceRoleName")
    public void setDeviceRoleName(String deviceRoleName) {
        this.deviceRoleName = deviceRoleName;
    }

    @JsonProperty("triggerId")
    public String getTriggerId() {
        return triggerId;
    }

    @JsonProperty("triggerId")
    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("formatID")
    public String getFormatID() {
        return formatID;
    }

    @JsonProperty("formatID")
    public void setFormatID(String formatID) {
        this.formatID = formatID;
    }

    @JsonProperty("header")
    public Header getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(Header header) {
        this.header = header;
    }

    @JsonProperty("body")
    public Body getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(Body body) {
        this.body = body;
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
        return new ToStringBuilder(this).append("deploymentId", deploymentId).append("deviceRoleName", deviceRoleName).append("triggerId", triggerId).append("userId", userId).append("formatID", formatID).append("header", header).append("body", body).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(body).append(additionalProperties).append(formatID).append(userId).append(deviceRoleName).append(triggerId).append(deploymentId).append(header).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataUpload) == false) {
            return false;
        }
        DataUpload rhs = ((DataUpload) other);
        return new EqualsBuilder().append(body, rhs.body).append(additionalProperties, rhs.additionalProperties).append(formatID, rhs.formatID).append(userId, rhs.userId).append(deviceRoleName, rhs.deviceRoleName).append(triggerId, rhs.triggerId).append(deploymentId, rhs.deploymentId).append(header, rhs.header).isEquals();
    }

}
