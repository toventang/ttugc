package com.bytedance.apm.agent.filter;

import com.bytedance.covode.number.Covode;

public interface ISendFilter {
    static {
        Covode.recordClassIndex(14010);
    }

    boolean isSend();
}
