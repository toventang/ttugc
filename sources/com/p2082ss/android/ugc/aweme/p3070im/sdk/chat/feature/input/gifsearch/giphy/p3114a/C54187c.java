package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.c */
public final class C54187c {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final Integer f124152a = null;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f124153b = null;
    @AbstractC27891c(mo46611a = "resources")

    /* renamed from: c */
    public final C54191g f124154c = null;

    static {
        Covode.recordClassIndex(63871);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54187c)) {
            return false;
        }
        C54187c cVar = (C54187c) obj;
        return C89219l.m154714a(this.f124152a, cVar.f124152a) && C89219l.m154714a(this.f124153b, cVar.f124153b) && C89219l.m154714a(this.f124154c, cVar.f124154c);
    }

    public final int hashCode() {
        Integer num = this.f124152a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f124153b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C54191g gVar = this.f124154c;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "GiphyGifsResponse(statusCode=" + this.f124152a + ", statusMsg=" + this.f124153b + ", giphyResources=" + this.f124154c + ")";
    }

    private C54187c() {
    }
}
