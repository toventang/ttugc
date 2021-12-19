package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settings.ad */
public final class C68729ad {
    @AbstractC27891c(mo46611a = "base_url")

    /* renamed from: a */
    public final String f153748a;
    @AbstractC27891c(mo46611a = "whitelist_path")

    /* renamed from: b */
    public final List<String> f153749b;

    static {
        Covode.recordClassIndex(80998);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68729ad)) {
            return false;
        }
        C68729ad adVar = (C68729ad) obj;
        return C89219l.m154714a(this.f153748a, adVar.f153748a) && C89219l.m154714a(this.f153749b, adVar.f153749b);
    }

    public final int hashCode() {
        String str = this.f153748a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f153749b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SendAnalyticsEventData(baseUrl=" + this.f153748a + ", whiteList=" + this.f153749b + ")";
    }

    private /* synthetic */ C68729ad() {
        this("");
    }

    private C68729ad(String str) {
        C89219l.m154721d(str, "");
        this.f153748a = str;
        this.f153749b = null;
    }
}
