package com.p2082ss.android.ugc.aweme.creatortools.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.api.b */
public final class C40454b {
    @AbstractC27891c(mo46611a = "show_entrance")

    /* renamed from: a */
    public final boolean f94673a;
    @AbstractC27891c(mo46611a = "have_permission")

    /* renamed from: b */
    public final boolean f94674b;
    @AbstractC27891c(mo46611a = "click_schema")

    /* renamed from: c */
    public final String f94675c;

    static {
        Covode.recordClassIndex(48258);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40454b)) {
            return false;
        }
        C40454b bVar = (C40454b) obj;
        return this.f94673a == bVar.f94673a && this.f94674b == bVar.f94674b && C89219l.m154714a(this.f94675c, bVar.f94675c);
    }

    public final int hashCode() {
        boolean z = this.f94673a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f94674b) {
            i = 0;
        }
        int i6 = (i5 + i) * 31;
        String str = this.f94675c;
        return i6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ShowCaseModel(showEntrance=" + this.f94673a + ", havePermission=" + this.f94674b + ", clickSchema=" + this.f94675c + ")";
    }
}
