package com.bytedance.geckox.statistic.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.geckox.statistic.model.c */
public final class C15041c {

    /* renamed from: a */
    public final String f36740a;

    /* renamed from: b */
    public final long f36741b;

    /* renamed from: c */
    public final int f36742c;

    static {
        Covode.recordClassIndex(17207);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15041c)) {
            return false;
        }
        C15041c cVar = (C15041c) obj;
        return C89219l.m154714a(this.f36740a, cVar.f36740a) && this.f36741b == cVar.f36741b && this.f36742c == cVar.f36742c;
    }

    public final int hashCode() {
        String str = this.f36740a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f36741b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f36742c;
    }

    public final String toString() {
        return "ResourceInfoModel(accessKey=" + this.f36740a + ", accessKeyResourceUsage=" + this.f36741b + ", ChannelCount=" + this.f36742c + ")";
    }

    public C15041c(String str, long j, int i) {
        C89219l.m154719c(str, "");
        this.f36740a = str;
        this.f36741b = j;
        this.f36742c = i;
    }
}
