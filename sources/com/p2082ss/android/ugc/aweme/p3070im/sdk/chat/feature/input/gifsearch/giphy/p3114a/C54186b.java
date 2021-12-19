package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b */
public final class C54186b {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final String f124147a = null;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: b */
    public final String f124148b = null;
    @AbstractC27891c(mo46611a = "images")

    /* renamed from: c */
    public final C54188d f124149c = null;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: d */
    public final String f124150d = null;
    @AbstractC27891c(mo46611a = "analytics")

    /* renamed from: e */
    public final C54185a f124151e = null;

    static {
        Covode.recordClassIndex(63870);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54186b)) {
            return false;
        }
        C54186b bVar = (C54186b) obj;
        return C89219l.m154714a(this.f124147a, bVar.f124147a) && C89219l.m154714a(this.f124148b, bVar.f124148b) && C89219l.m154714a(this.f124149c, bVar.f124149c) && C89219l.m154714a(this.f124150d, bVar.f124150d) && C89219l.m154714a(this.f124151e, bVar.f124151e);
    }

    public final int hashCode() {
        String str = this.f124147a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f124148b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C54188d dVar = this.f124149c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str3 = this.f124150d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C54185a aVar = this.f124151e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "GiphyDataBean(type=" + this.f124147a + ", id=" + this.f124148b + ", images=" + this.f124149c + ", title=" + this.f124150d + ", analytics=" + this.f124151e + ")";
    }

    private C54186b() {
    }
}
