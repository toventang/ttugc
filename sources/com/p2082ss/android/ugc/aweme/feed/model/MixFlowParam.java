package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.MixFlowParam */
public final class MixFlowParam implements Serializable {
    private final String eventType;
    private final String from;

    static {
        Covode.recordClassIndex(58725);
    }

    public static /* synthetic */ MixFlowParam copy$default(MixFlowParam mixFlowParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mixFlowParam.eventType;
        }
        if ((i & 2) != 0) {
            str2 = mixFlowParam.from;
        }
        return mixFlowParam.copy(str, str2);
    }

    public final String component1() {
        return this.eventType;
    }

    public final String component2() {
        return this.from;
    }

    public final MixFlowParam copy(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new MixFlowParam(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixFlowParam)) {
            return false;
        }
        MixFlowParam mixFlowParam = (MixFlowParam) obj;
        return C89219l.m154714a(this.eventType, mixFlowParam.eventType) && C89219l.m154714a(this.from, mixFlowParam.from);
    }

    public final int hashCode() {
        String str = this.eventType;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.from;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MixFlowParam(eventType=" + this.eventType + ", from=" + this.from + ")";
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getFrom() {
        return this.from;
    }

    public MixFlowParam(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.eventType = str;
        this.from = str2;
    }
}
