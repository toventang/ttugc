package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.h */
public final class C75123h {
    @AbstractC27891c(mo46611a = "service_url")

    /* renamed from: a */
    public String f168878a;
    @AbstractC27891c(mo46611a = "service_action")

    /* renamed from: b */
    public int f168879b;
    @AbstractC27891c(mo46611a = "service_parameters")

    /* renamed from: c */
    public List<String> f168880c;

    static {
        Covode.recordClassIndex(87996);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75123h)) {
            return false;
        }
        C75123h hVar = (C75123h) obj;
        return C89219l.m154714a(this.f168878a, hVar.f168878a) && this.f168879b == hVar.f168879b && C89219l.m154714a(this.f168880c, hVar.f168880c);
    }

    public final int hashCode() {
        String str = this.f168878a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f168879b) * 31;
        List<String> list = this.f168880c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ServiceCallActions(serviceUrl=" + this.f168878a + ", serviceAction=" + this.f168879b + ", serviceParameters=" + this.f168880c + ")";
    }

    private /* synthetic */ C75123h() {
        this("", new ArrayList());
    }

    private C75123h(String str, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.f168878a = str;
        this.f168879b = 0;
        this.f168880c = list;
    }
}
