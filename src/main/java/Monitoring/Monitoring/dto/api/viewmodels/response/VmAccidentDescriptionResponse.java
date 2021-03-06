package Monitoring.Monitoring.dto.api.viewmodels.response;

public class VmAccidentDescriptionResponse {
    private String name;
    private String value;

    public VmAccidentDescriptionResponse(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public VmAccidentDescriptionResponse(){}

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() { return value; }

    public void setValue(String value) {
        this.value = value;
    }
}
