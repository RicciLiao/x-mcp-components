package ricciliao.x.mcp;


import ricciliao.x.component.payload.PayloadData;

import java.io.Serial;
import java.time.Instant;
import java.util.Objects;

public class McpProviderInfo implements PayloadData {
    @Serial
    private static final long serialVersionUID = -3013557418500676494L;

    private Long count;
    private Instant createdDtm;
    private Instant maxUpdatedDtm;
    private McpIdentifier mcpIdentifier;

    public McpProviderInfo() {
    }

    public McpProviderInfo(McpIdentifier mcpIdentifier) {
        this.mcpIdentifier = mcpIdentifier;
        this.count = 0L;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Instant getCreatedDtm() {
        return createdDtm;
    }

    public void setCreatedDtm(Instant createdDtm) {
        this.createdDtm = createdDtm;
    }

    public Instant getMaxUpdatedDtm() {
        return maxUpdatedDtm;
    }

    public void setMaxUpdatedDtm(Instant maxUpdatedDtm) {
        this.maxUpdatedDtm = maxUpdatedDtm;
    }

    public McpIdentifier getMcpIdentifier() {
        return mcpIdentifier;
    }

    public void setMcpIdentifier(McpIdentifier mcpIdentifier) {
        this.mcpIdentifier = mcpIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof McpProviderInfo that)) return false;
        return Objects.equals(getCount(), that.getCount()) && Objects.equals(getCreatedDtm(), that.getCreatedDtm()) && Objects.equals(getMaxUpdatedDtm(), that.getMaxUpdatedDtm()) && Objects.equals(getMcpIdentifier(), that.getMcpIdentifier());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCount(), getCreatedDtm(), getMaxUpdatedDtm(), getMcpIdentifier());
    }
}
