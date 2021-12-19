package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2550d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.c */
public final class C37750c implements Serializable {
    @AbstractC27891c(mo46611a = "render_url")

    /* renamed from: a */
    private final String f89144a;
    @AbstractC27891c(mo46611a = "web_url")

    /* renamed from: b */
    private final String f89145b;
    @AbstractC27891c(mo46611a = "gecko_channel")

    /* renamed from: c */
    private final List<String> f89146c;

    static {
        Covode.recordClassIndex(45193);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.c */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37750c copy$default(C37750c cVar, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f89144a;
        }
        if ((i & 2) != 0) {
            str2 = cVar.f89145b;
        }
        if ((i & 4) != 0) {
            list = cVar.f89146c;
        }
        return cVar.copy(str, str2, list);
    }

    public final String component1() {
        return this.f89144a;
    }

    public final String component2() {
        return this.f89145b;
    }

    public final List<String> component3() {
        return this.f89146c;
    }

    public final C37750c copy(String str, String str2, List<String> list) {
        return new C37750c(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37750c)) {
            return false;
        }
        C37750c cVar = (C37750c) obj;
        return C89219l.m154714a(this.f89144a, cVar.f89144a) && C89219l.m154714a(this.f89145b, cVar.f89145b) && C89219l.m154714a(this.f89146c, cVar.f89146c);
    }

    public final int hashCode() {
        String str = this.f89144a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f89145b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f89146c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "LynxSchema(renderUrl=" + this.f89144a + ", webUrl=" + this.f89145b + ", geckoChannels=" + this.f89146c + ")";
    }

    public final List<String> getGeckoChannels() {
        return this.f89146c;
    }

    public final String getRenderUrl() {
        return this.f89144a;
    }

    public final String getWebUrl() {
        return this.f89145b;
    }

    public C37750c(String str, String str2, List<String> list) {
        this.f89144a = str;
        this.f89145b = str2;
        this.f89146c = list;
    }
}
