package org.apache.commons.logging;

import com.bytedance.covode.number.Covode;

public interface Log {
    static {
        Covode.recordClassIndex(106395);
    }

    void debug(Object obj);

    void debug(Object obj, Throwable th);

    boolean isDebugEnabled();
}
