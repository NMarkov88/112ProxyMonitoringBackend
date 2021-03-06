package Monitoring.Monitoring.dto.api.viewmodels.response;

public class VmNewAccidentResponse {
    private String id;
    private String name;

    public VmNewAccidentResponse(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public VmNewAccidentResponse(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
