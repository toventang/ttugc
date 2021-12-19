package com.p2082ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.RoomStructV2 */
public final class RoomStructV2 implements Serializable {
    @AbstractC27891c(mo46611a = "rawdata")
    private String rawdata = "";

    static {
        Covode.recordClassIndex(42745);
    }

    public final String getRawdata() {
        return this.rawdata;
    }

    public final void setRawdata(String str) {
        C89219l.m154721d(str, "");
        this.rawdata = str;
    }
}
