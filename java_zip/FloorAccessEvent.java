import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Floor Access Event
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "person_id",
    "datetime",
    "floor_level",
    "building"
})
public class FloorAccessEvent {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("person_id")
    private String personId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("datetime")
    private String datetime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("floor_level")
    private Integer floorLevel;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("building")
    private String building;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("person_id")
    public String getPersonId() {
        return personId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("person_id")
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("floor_level")
    public Integer getFloorLevel() {
        return floorLevel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("floor_level")
    public void setFloorLevel(Integer floorLevel) {
        this.floorLevel = floorLevel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
