package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.b */
public final class C16615b {

    /* renamed from: a */
    public final Uri f39768a;

    /* renamed from: b */
    public final Uri f39769b;

    /* renamed from: c */
    public final View f39770c;

    /* renamed from: d */
    public final EnumC16626c f39771d;

    static {
        Covode.recordClassIndex(19052);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16615b)) {
            return false;
        }
        C16615b bVar = (C16615b) obj;
        return C89219l.m154714a(this.f39768a, bVar.f39768a) && C89219l.m154714a(this.f39769b, bVar.f39769b) && C89219l.m154714a(this.f39770c, bVar.f39770c) && C89219l.m154714a(this.f39771d, bVar.f39771d);
    }

    public final int hashCode() {
        Uri uri = this.f39768a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f39769b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        View view = this.f39770c;
        int hashCode3 = (hashCode2 + (view != null ? view.hashCode() : 0)) * 31;
        EnumC16626c cVar = this.f39771d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "CacheItem(originSchema=" + this.f39768a + ", uniqueSchema=" + this.f39769b + ", view=" + this.f39770c + ", cacheType=" + this.f39771d + ")";
    }

    public C16615b(Uri uri, Uri uri2, View view, EnumC16626c cVar) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(uri2, "");
        C89219l.m154719c(view, "");
        C89219l.m154719c(cVar, "");
        this.f39768a = uri;
        this.f39769b = uri2;
        this.f39770c = view;
        this.f39771d = cVar;
    }
}
