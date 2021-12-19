package com.bytedance.apm.agent.logging;

import com.bytedance.covode.number.Covode;

public class AndroidAgentLog implements AgentLog {
    private int level = 3;

    static {
        Covode.recordClassIndex(14062);
    }

    /* renamed from: com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m22049x57b1e8b5(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m22050x57b1e8b6(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m22051x57b1e8b6(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m22052x57b1e8ba(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_v */
    public static int m22053x57b1e8c7(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m22054x57b1e8c8(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public int getLevel() {
        return this.level;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void audit(String str) {
        if (this.level == 6) {
            m22049x57b1e8b5("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void debug(String str) {
        if (this.level >= 5) {
            m22049x57b1e8b5("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str) {
        if (this.level > 0) {
            m22050x57b1e8b6("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void info(String str) {
        if (this.level >= 3) {
            m22052x57b1e8ba("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void setLevel(int i) {
        if (i > 6 || i <= 0) {
            throw new IllegalArgumentException("Log level is not between ERROR and AUDIT");
        }
        this.level = i;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void verbose(String str) {
        if (this.level >= 4) {
            m22053x57b1e8c7("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void warning(String str) {
        if (this.level >= 2) {
            m22054x57b1e8c8("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str, Throwable th) {
        if (this.level > 0) {
            m22051x57b1e8b6("[tt_apm]", str, th);
        }
    }
}
