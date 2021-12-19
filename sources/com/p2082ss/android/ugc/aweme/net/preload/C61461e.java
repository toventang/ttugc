package com.p2082ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.preload.e */
public final class C61461e {

    /* renamed from: a */
    public final C61462f f139521a;

    /* renamed from: b */
    public final C22099u<?> f139522b;

    /* renamed from: c */
    public long f139523c;

    static {
        Covode.recordClassIndex(72117);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61461e)) {
            return false;
        }
        C61461e eVar = (C61461e) obj;
        return C89219l.m154714a(this.f139521a, eVar.f139521a) && C89219l.m154714a(this.f139522b, eVar.f139522b) && this.f139523c == eVar.f139523c;
    }

    public final int hashCode() {
        C61462f fVar = this.f139521a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        C22099u<?> uVar = this.f139522b;
        if (uVar != null) {
            i = uVar.hashCode();
        }
        long j = this.f139523c;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "PreloadRecord(preloadRequestContext=" + this.f139521a + ", response=" + this.f139522b + ", lastModified=" + this.f139523c + ")";
    }

    /* renamed from: a */
    public final long mo99134a() {
        return System.currentTimeMillis() - this.f139523c;
    }

    public /* synthetic */ C61461e(C61462f fVar, C22099u uVar) {
        this(fVar, uVar, System.currentTimeMillis());
    }

    private C61461e(C61462f fVar, C22099u<?> uVar, long j) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(uVar, "");
        this.f139521a = fVar;
        this.f139522b = uVar;
        this.f139523c = j;
    }
}
