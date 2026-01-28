package ricciliao.x.mcp;

import ricciliao.x.mcp.annotation.Data;
import ricciliao.x.mcp.query.McpCriteria;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class McpCache<T extends Serializable> implements Serializable {
    @Serial
    private static final long serialVersionUID = -7838083516165280621L;

    @McpCriteria.Support(McpCriteria.Property.ID)
    private String uid;
    @McpCriteria.Support(McpCriteria.Property.CREATED_DTM)
    private Instant createdDtm;
    @McpCriteria.Support(McpCriteria.Property.UPDATED_DTM)
    private Instant updatedDtm;
    @McpCriteria.Support(McpCriteria.Property.TTL)
    private Instant ttlEffectedDtm;
    @Data
    private T data;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Instant getCreatedDtm() {
        return createdDtm;
    }

    public void setCreatedDtm(Instant createdDtm) {
        this.createdDtm = createdDtm;
    }

    public Instant getUpdatedDtm() {
        return updatedDtm;
    }

    public void setUpdatedDtm(Instant updatedDtm) {
        this.updatedDtm = updatedDtm;
    }

    public Instant getTtlEffectedDtm() {
        return ttlEffectedDtm;
    }

    public void setTtlEffectedDtm(Instant ttlEffectedDtm) {
        this.ttlEffectedDtm = ttlEffectedDtm;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
