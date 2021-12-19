package com.p2082ss.android.ugc.aweme.app.p2317a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.a.a */
public final class C33565a {

    /* renamed from: a */
    public boolean f79723a;

    /* renamed from: b */
    public long f79724b;

    /* renamed from: c */
    public String f79725c;

    static {
        Covode.recordClassIndex(40454);
    }

    public C33565a() {
        this(0, (String) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33565a)) {
            return false;
        }
        C33565a aVar = (C33565a) obj;
        return this.f79723a == aVar.f79723a && this.f79724b == aVar.f79724b && C89219l.m154714a(this.f79725c, aVar.f79725c);
    }

    public final String toString() {
        return "ApiConfig(isBanned=" + this.f79723a + ", delayTime=" + this.f79724b + ", apiName=" + this.f79725c + ")";
    }

    public final int hashCode() {
        int i;
        boolean z = this.f79723a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j = this.f79724b;
        int i5 = ((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f79725c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i5 + i;
    }

    public C33565a(boolean z, long j, String str) {
        C89219l.m154721d(str, "");
        this.f79723a = z;
        this.f79724b = j;
        this.f79725c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33565a(long j, String str, int i) {
        this(false, (i & 2) != 0 ? 45000 : j, (i & 4) != 0 ? "default" : str);
    }
}
