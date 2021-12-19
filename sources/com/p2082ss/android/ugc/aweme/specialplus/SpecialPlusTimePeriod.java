package com.p2082ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specialplus.SpecialPlusTimePeriod */
public final class SpecialPlusTimePeriod {
    @AbstractC27891c(mo46611a = "end_time")
    private String end = "";
    @AbstractC27891c(mo46611a = "start_time")
    private String start = "";

    static {
        Covode.recordClassIndex(88084);
    }

    public final String getEnd() {
        return this.end;
    }

    public final String getStart() {
        return this.start;
    }

    public final void setEnd(String str) {
        C89219l.m154721d(str, "");
        this.end = str;
    }

    public final void setStart(String str) {
        C89219l.m154721d(str, "");
        this.start = str;
    }
}
