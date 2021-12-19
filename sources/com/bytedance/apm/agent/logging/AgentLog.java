package com.bytedance.apm.agent.logging;

import com.bytedance.covode.number.Covode;

public interface AgentLog {
    static {
        Covode.recordClassIndex(14060);
    }

    void audit(String str);

    void debug(String str);

    void error(String str);

    void error(String str, Throwable th);

    int getLevel();

    void info(String str);

    void setLevel(int i);

    void verbose(String str);

    void warning(String str);
}
