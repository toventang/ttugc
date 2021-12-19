package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class RivalsListExtra extends Extra {
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPbBean;

    static {
        Covode.recordClassIndex(8375);
    }

    public static final class LogPbBean {
        @AbstractC27891c(mo46611a = "impr_id")
        public String imprId;

        static {
            Covode.recordClassIndex(8376);
        }

        public final String getImprId() {
            return this.imprId;
        }

        public final String toString() {
            return "LogPbBean{imprId='" + this.imprId + '\'' + '}';
        }
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public String getRequestId() {
        LogPbBean logPbBean2 = this.logPbBean;
        if (logPbBean2 != null) {
            return logPbBean2.imprId;
        }
        return "";
    }

    public String toString() {
        return "RivalsListExtra{logPbBean=" + this.logPbBean + '}';
    }
}
