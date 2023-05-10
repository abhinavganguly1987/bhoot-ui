
package com.toto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "results",
    "status",
    "pass"
})
@Generated("jsonschema2pojo")
public class LeTest {

    @JsonProperty("results")
    private List<Result> results = new ArrayList<Result>();
    @JsonProperty("status")
    private String status;
    @JsonProperty("pass")
    private Boolean pass;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public LeTest withResults(List<Result> results) {
        this.results = results;
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

    public LeTest withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("pass")
    public Boolean getPass() {
        return pass;
    }

    @JsonProperty("pass")
    public void setPass(Boolean pass) {
        this.pass = pass;
    }

    public LeTest withPass(Boolean pass) {
        this.pass = pass;
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

    public LeTest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LeTest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("pass");
        sb.append('=');
        sb.append(((this.pass == null)?"<null>":this.pass));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        result = ((result* 31)+((this.pass == null)? 0 :this.pass.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LeTest) == false) {
            return false;
        }
        LeTest rhs = ((LeTest) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))))&&((this.pass == rhs.pass)||((this.pass!= null)&&this.pass.equals(rhs.pass))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
