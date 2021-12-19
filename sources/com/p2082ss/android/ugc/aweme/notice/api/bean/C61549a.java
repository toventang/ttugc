package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.a */
public final class C61549a extends C61550b implements Serializable {

    /* renamed from: a */
    private String f139700a;
    @AbstractC27891c(mo46611a = "new_content_num")

    /* renamed from: b */
    private final int f139701b;
    @AbstractC27891c(mo46611a = "update_time")

    /* renamed from: c */
    private final long f139702c;

    static {
        Covode.recordClassIndex(72224);
    }

    public final int getNewContentNum() {
        return this.f139701b;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.bean.C61550b
    public final EnumC61554f getType() {
        return EnumC61554f.BC;
    }

    public final String getUid() {
        return this.f139700a;
    }

    public final long getUpdateTime() {
        return this.f139702c;
    }

    public final void setUid(String str) {
        this.f139700a = str;
    }
}
