package com.p2082ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.o */
public final class C42042o {

    /* renamed from: a */
    public final int f98013a = 0;

    /* renamed from: b */
    public final int f98014b = 0;

    /* renamed from: c */
    public final int f98015c = 0;

    /* renamed from: d */
    public final C41990aj f98016d = null;

    static {
        Covode.recordClassIndex(49972);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42042o)) {
            return false;
        }
        C42042o oVar = (C42042o) obj;
        return this.f98013a == oVar.f98013a && this.f98014b == oVar.f98014b && this.f98015c == oVar.f98015c && C89219l.m154714a(this.f98016d, oVar.f98016d);
    }

    public final int hashCode() {
        int i = ((((this.f98013a * 31) + this.f98014b) * 31) + this.f98015c) * 31;
        C41990aj ajVar = this.f98016d;
        return i + (ajVar != null ? ajVar.hashCode() : 0);
    }

    public final String toString() {
        return "MusicDownloadStatus(status=" + this.f98013a + ", percent=" + this.f98014b + ", errorMsg=" + this.f98015c + ", toVideoProgress=" + this.f98016d + ")";
    }

    private C42042o() {
    }
}
