package com.bytedance.ies.bullet.p1129c.p1132c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.w */
public final class C16235w {

    /* renamed from: a */
    public final Uri f39031a;

    /* renamed from: b */
    public final C16248b f39032b;

    static {
        Covode.recordClassIndex(18528);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16235w)) {
            return false;
        }
        C16235w wVar = (C16235w) obj;
        return C89219l.m154714a(this.f39031a, wVar.f39031a) && C89219l.m154714a(this.f39032b, wVar.f39032b);
    }

    public final int hashCode() {
        Uri uri = this.f39031a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        C16248b bVar = this.f39032b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "KitProcessUnit(uri=" + this.f39031a + ", providerFactory=" + this.f39032b + ")";
    }

    public C16235w(Uri uri, C16248b bVar) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(bVar, "");
        this.f39031a = uri;
        this.f39032b = bVar;
    }
}
