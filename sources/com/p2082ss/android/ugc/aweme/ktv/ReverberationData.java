package com.p2082ss.android.ugc.aweme.ktv;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ktv.ReverberationData */
public final class ReverberationData implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private String f132190id;
    @AbstractC27891c(mo46611a = "index")
    private int index = -1;
    @AbstractC27891c(mo46611a = "path")
    private String path;
    @AbstractC27891c(mo46611a = "res_id")
    private String resId;
    @AbstractC27891c(mo46611a = "uuid")
    private String uuid = "";

    static {
        Covode.recordClassIndex(68030);
    }

    public final String getId() {
        return this.f132190id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getResId() {
        return this.resId;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setId(String str) {
        this.f132190id = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setResId(String str) {
        this.resId = str;
    }

    public final void setUuid(String str) {
        C89219l.m154721d(str, "");
        this.uuid = str;
    }
}
