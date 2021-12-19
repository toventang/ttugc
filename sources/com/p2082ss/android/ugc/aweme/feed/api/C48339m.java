package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.api.m */
public final class C48339m {

    /* renamed from: a */
    public final String f112022a;

    /* renamed from: b */
    public Integer f112023b;

    /* renamed from: c */
    public String f112024c;

    static {
        Covode.recordClassIndex(57111);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48339m)) {
            return false;
        }
        C48339m mVar = (C48339m) obj;
        return C89219l.m154714a(this.f112022a, mVar.f112022a) && C89219l.m154714a(this.f112023b, mVar.f112023b) && C89219l.m154714a(this.f112024c, mVar.f112024c);
    }

    public final int hashCode() {
        String str = this.f112022a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f112023b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f112024c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "NetworkExtraInfo(requestLog=" + this.f112022a + ", retryTimes=" + this.f112023b + ", url=" + this.f112024c + ")";
    }

    public C48339m(String str, Integer num, String str2) {
        this.f112022a = str;
        this.f112023b = num;
        this.f112024c = str2;
    }
}
