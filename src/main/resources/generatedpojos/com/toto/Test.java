
package com.toto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "group",
    "userJourney",
    "test",
    "release",
    "userJourneyId",
    "status"
})
@Generated("jsonschema2pojo")
public class Test {

    @JsonProperty("group")
    private String group;
    @JsonProperty("userJourney")
    private String userJourney;
    @JsonProperty("test")
    private String test;
    @JsonProperty("release")
    private String release;
    @JsonProperty("userJourneyId")
    private String userJourneyId;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public Test withGroup(String group) {
        this.group = group;
        return this;
    }

    @JsonProperty("userJourney")
    public String getUserJourney() {
        return userJourney;
    }

    @JsonProperty("userJourney")
    public void setUserJourney(String userJourney) {
        this.userJourney = userJourney;
    }

    public Test withUserJourney(String userJourney) {
        this.userJourney = userJourney;
        return this;
    }

    @JsonProperty("test")
    public String getTest() {
        return test;
    }

    @JsonProperty("test")
    public void setTest(String test) {
        this.test = test;
    }

    public Test withTest(String test) {
        this.test = test;
        return this;
    }

    @JsonProperty("release")
    public String getRelease() {
        return release;
    }

    @JsonProperty("release")
    public void setRelease(String release) {
        this.release = release;
    }

    public Test withRelease(String release) {
        this.release = release;
        return this;
    }

    @JsonProperty("userJourneyId")
    public String getUserJourneyId() {
        return userJourneyId;
    }

    @JsonProperty("userJourneyId")
    public void setUserJourneyId(String userJourneyId) {
        this.userJourneyId = userJourneyId;
    }

    public Test withUserJourneyId(String userJourneyId) {
        this.userJourneyId = userJourneyId;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Test withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Test withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Test.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("userJourney");
        sb.append('=');
        sb.append(((this.userJourney == null)?"<null>":this.userJourney));
        sb.append(',');
        sb.append("test");
        sb.append('=');
        sb.append(((this.test == null)?"<null>":this.test));
        sb.append(',');
        sb.append("release");
        sb.append('=');
        sb.append(((this.release == null)?"<null>":this.release));
        sb.append(',');
        sb.append("userJourneyId");
        sb.append('=');
        sb.append(((this.userJourneyId == null)?"<null>":this.userJourneyId));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.userJourney == null)? 0 :this.userJourney.hashCode()));
        result = ((result* 31)+((this.test == null)? 0 :this.test.hashCode()));
        result = ((result* 31)+((this.release == null)? 0 :this.release.hashCode()));
        result = ((result* 31)+((this.userJourneyId == null)? 0 :this.userJourneyId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Test) == false) {
            return false;
        }
        Test rhs = ((Test) other);
        return ((((((((this.userJourney == rhs.userJourney)||((this.userJourney!= null)&&this.userJourney.equals(rhs.userJourney)))&&((this.test == rhs.test)||((this.test!= null)&&this.test.equals(rhs.test))))&&((this.release == rhs.release)||((this.release!= null)&&this.release.equals(rhs.release))))&&((this.userJourneyId == rhs.userJourneyId)||((this.userJourneyId!= null)&&this.userJourneyId.equals(rhs.userJourneyId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
