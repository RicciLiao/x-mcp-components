package ricciliao.x.mcp.query;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class McpCriteria {

    public enum Property {
        CREATED_DTM,
        UPDATED_DTM,
        ID,
        TTL,
        ;

        Property() {
        }

    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Support {
        Property value();
    }

    public static class Sort {

        public enum Direction {
            ASC,
            DESC
        }

    }

}
