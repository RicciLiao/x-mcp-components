package ricciliao.x.mcp.query;

import java.io.Serial;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

public class McpQuery implements Serializable {
    @Serial
    private static final long serialVersionUID = 5688991327120122635L;

    private Long limit = 0L;
    private McpCriteria.Property sortBy = McpCriteria.Property.CREATED_DTM;
    private McpCriteria.Sort.Direction sortDirection = McpCriteria.Sort.Direction.ASC;
    private Map<McpCriteria.Property, Serializable> criteriaMap = new EnumMap<>(McpCriteria.Property.class);

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public McpCriteria.Property getSortBy() {
        return sortBy;
    }

    public void setSortBy(McpCriteria.Property sortBy) {
        this.sortBy = sortBy;
    }

    public McpCriteria.Sort.Direction getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(McpCriteria.Sort.Direction sortDirection) {
        this.sortDirection = sortDirection;
    }

    public Map<McpCriteria.Property, Serializable> getCriteriaMap() {
        return criteriaMap;
    }

    public void setCriteriaMap(Map<McpCriteria.Property, Serializable> criteriaMap) {
        this.criteriaMap = criteriaMap;
    }

}
