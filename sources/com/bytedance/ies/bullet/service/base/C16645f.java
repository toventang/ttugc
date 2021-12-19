package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.f */
public final class C16645f {

    /* renamed from: a */
    public final Uri f39810a;

    /* renamed from: b */
    public final Uri f39811b;

    /* renamed from: c */
    public final EnumC16626c f39812c;

    static {
        Covode.recordClassIndex(19082);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16645f)) {
            return false;
        }
        C16645f fVar = (C16645f) obj;
        return C89219l.m154714a(this.f39810a, fVar.f39810a) && C89219l.m154714a(this.f39811b, fVar.f39811b) && C89219l.m154714a(this.f39812c, fVar.f39812c);
    }

    public final int hashCode() {
        Uri uri = this.f39810a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f39811b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        EnumC16626c cVar = this.f39812c;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Event(originSchema=" + this.f39810a + ", uniqueSchema=" + this.f39811b + ", cacheType=" + this.f39812c + ")";
    }

    public C16645f(Uri uri, Uri uri2, EnumC16626c cVar) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(uri2, "");
        C89219l.m154719c(cVar, "");
        this.f39810a = uri;
        this.f39811b = uri2;
        this.f39812c = cVar;
    }
}
