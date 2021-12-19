package com.p2082ss.android.ugc.aweme.api.resp;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.api.resp.EnterContext */
public final class EnterContext implements Serializable {
    @AbstractC27891c(mo46611a = "enter_source_id")
    private final String enterSourceId;
    @AbstractC27891c(mo46611a = "req_type")
    private final Integer reqType;

    static {
        Covode.recordClassIndex(40416);
    }

    public static /* synthetic */ EnterContext copy$default(EnterContext enterContext, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = enterContext.reqType;
        }
        if ((i & 2) != 0) {
            str = enterContext.enterSourceId;
        }
        return enterContext.copy(num, str);
    }

    public final Integer component1() {
        return this.reqType;
    }

    public final String component2() {
        return this.enterSourceId;
    }

    public final EnterContext copy(Integer num, String str) {
        return new EnterContext(num, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterContext)) {
            return false;
        }
        EnterContext enterContext = (EnterContext) obj;
        return C89219l.m154714a(this.reqType, enterContext.reqType) && C89219l.m154714a(this.enterSourceId, enterContext.enterSourceId);
    }

    public final int hashCode() {
        Integer num = this.reqType;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.enterSourceId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EnterContext(reqType=" + this.reqType + ", enterSourceId=" + this.enterSourceId + ")";
    }

    public final String getEnterSourceId() {
        return this.enterSourceId;
    }

    public final Integer getReqType() {
        return this.reqType;
    }

    public EnterContext(Integer num, String str) {
        this.reqType = num;
        this.enterSourceId = str;
    }
}
