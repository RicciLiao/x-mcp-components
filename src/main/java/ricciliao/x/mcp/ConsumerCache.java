package ricciliao.x.mcp;

import ricciliao.x.component.payload.PayloadData;

import java.io.Serial;

public class ConsumerCache<T extends ConsumerCacheData> extends McpCache<T> implements PayloadData {
    @Serial
    private static final long serialVersionUID = -8920728831428092290L;
    private Long ttlSec;

    public ConsumerCache() {
    }

    private ConsumerCache(T data) {
        super();
        this.setData(data);
    }

    private ConsumerCache(Long ttlSec, T data) {
        super();
        this.setData(data);
        this.setTtlSec(ttlSec);
    }

    public Long getTtlSec() {
        return ttlSec;
    }

    public void setTtlSec(Long ttlSec) {
        this.ttlSec = ttlSec;
    }

    public static <T extends ConsumerCacheData> ConsumerCache<T> of(T data) {

        return new ConsumerCache<>(data);
    }

    public static <T extends ConsumerCacheData> ConsumerCache<T> of(Long ttlSec, T data) {

        return new ConsumerCache<>(ttlSec, data);
    }

}
