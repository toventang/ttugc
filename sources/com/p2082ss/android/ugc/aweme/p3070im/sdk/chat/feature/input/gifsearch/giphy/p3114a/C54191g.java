package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.g */
public final class C54191g {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public final List<C54186b> f124159a = null;
    @AbstractC27891c(mo46611a = "pagination")

    /* renamed from: b */
    public final C54190f f124160b = null;

    static {
        Covode.recordClassIndex(63875);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54191g)) {
            return false;
        }
        C54191g gVar = (C54191g) obj;
        return C89219l.m154714a(this.f124159a, gVar.f124159a) && C89219l.m154714a(this.f124160b, gVar.f124160b);
    }

    public final int hashCode() {
        List<C54186b> list = this.f124159a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C54190f fVar = this.f124160b;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "GiphyResourcesBean(data=" + this.f124159a + ", pagination=" + this.f124160b + ")";
    }

    private C54191g() {
    }
}
