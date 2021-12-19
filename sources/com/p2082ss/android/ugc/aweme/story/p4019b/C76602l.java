package com.p2082ss.android.ugc.aweme.story.p4019b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.b.l */
public final class C76602l implements AbstractC76591a {

    /* renamed from: a */
    public final String f171926a;

    /* renamed from: b */
    public final long f171927b;

    /* renamed from: c */
    public final long f171928c;

    static {
        Covode.recordClassIndex(89587);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76602l)) {
            return false;
        }
        C76602l lVar = (C76602l) obj;
        return C89219l.m154714a(this.f171926a, lVar.f171926a) && this.f171927b == lVar.f171927b && this.f171928c == lVar.f171928c;
    }

    public final String toString() {
        return "StoryPlayProgressParam(sourceId=" + this.f171926a + ", position=" + this.f171927b + ", duration=" + this.f171928c + ")";
    }

    public final int hashCode() {
        int i;
        String str = this.f171926a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f171927b;
        long j2 = this.f171928c;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C76602l(String str, long j, long j2) {
        this.f171926a = str;
        this.f171927b = j;
        this.f171928c = j2;
    }
}
