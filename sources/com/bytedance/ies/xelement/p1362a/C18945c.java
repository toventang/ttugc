package com.bytedance.ies.xelement.p1362a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.a.c */
public final class C18945c {

    /* renamed from: a */
    public final Uri f44841a;

    /* renamed from: b */
    public String f44842b;

    /* renamed from: c */
    public EnumC18946d f44843c;

    /* renamed from: d */
    public EnumC18944b f44844d;

    static {
        Covode.recordClassIndex(21691);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18945c)) {
            return false;
        }
        C18945c cVar = (C18945c) obj;
        return C89219l.m154714a(this.f44841a, cVar.f44841a) && C89219l.m154714a(this.f44842b, cVar.f44842b) && C89219l.m154714a(this.f44843c, cVar.f44843c) && C89219l.m154714a(this.f44844d, cVar.f44844d);
    }

    public final int hashCode() {
        Uri uri = this.f44841a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        String str = this.f44842b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        EnumC18946d dVar = this.f44843c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        EnumC18944b bVar = this.f44844d;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "XResourceLoadInfo(inputUri=" + this.f44841a + ", resourcePath=" + this.f44842b + ", resourceType=" + this.f44843c + ", resourceFrom=" + this.f44844d + ")";
    }

    private C18945c(Uri uri) {
        C89219l.m154719c(uri, "");
        this.f44841a = uri;
        this.f44842b = null;
        this.f44843c = null;
        this.f44844d = null;
    }

    public /* synthetic */ C18945c(Uri uri, byte b) {
        this(uri);
    }
}
