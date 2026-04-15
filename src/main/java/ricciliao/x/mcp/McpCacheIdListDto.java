package ricciliao.x.mcp;

import ricciliao.x.component.payload.PayloadData;

import java.io.Serial;
import java.util.List;
import java.util.Objects;

public class McpCacheIdListDto implements PayloadData {
    @Serial
    private static final long serialVersionUID = -546687319628861405L;

    private List<String> idList;

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof McpCacheIdListDto that)) return false;
        return Objects.equals(getIdList(), that.getIdList());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIdList());
    }

}
