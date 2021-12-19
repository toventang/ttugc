package com.p2082ss.android.ugc.tiktok.seclink.impl.p4332a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.seclink.impl.a.a */
public final class C84339a {
    @AbstractC27891c(mo46611a = "handleOverrideUrlScenes")

    /* renamed from: a */
    public List<String> f188574a;
    @AbstractC27891c(mo46611a = "blockList")

    /* renamed from: b */
    public List<C84340b> f188575b;

    static {
        Covode.recordClassIndex(98290);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84339a)) {
            return false;
        }
        C84339a aVar = (C84339a) obj;
        return C89219l.m154714a(this.f188574a, aVar.f188574a) && C89219l.m154714a(this.f188575b, aVar.f188575b);
    }

    public final int hashCode() {
        List<String> list = this.f188574a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C84340b> list2 = this.f188575b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SecLinkConfig(handleOverrideUrlScenes=" + this.f188574a + ", blockList=" + this.f188575b + ")";
    }

    private C84339a() {
        this.f188574a = null;
        this.f188575b = null;
    }

    public /* synthetic */ C84339a(byte b) {
        this();
    }
}
