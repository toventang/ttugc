package com.bytedance.sysoptimizer;

import com.bytedance.covode.number.Covode;

public interface ExceptionCatcher {
    static {
        Covode.recordClassIndex(26561);
    }

    boolean analysis(Throwable th);

    boolean registerCondition();
}
