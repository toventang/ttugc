package com.p2082ss.android.ugc.aweme.qrcode;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b */
public final class C66372b {

    /* renamed from: a */
    public final Uri f149273a;

    /* renamed from: b */
    public final String f149274b;

    /* renamed from: c */
    public final boolean f149275c;

    static {
        Covode.recordClassIndex(77904);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66372b)) {
            return false;
        }
        C66372b bVar = (C66372b) obj;
        return C89219l.m154714a(this.f149273a, bVar.f149273a) && C89219l.m154714a(this.f149274b, bVar.f149274b) && this.f149275c == bVar.f149275c;
    }

    public final int hashCode() {
        Uri uri = this.f149273a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        String str = this.f149274b;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f149275c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "ImageWrapperVo(uri=" + this.f149273a + ", path=" + this.f149274b + ", isLocalCache=" + this.f149275c + ")";
    }

    public C66372b(Uri uri, String str, boolean z) {
        this.f149273a = uri;
        this.f149274b = str;
        this.f149275c = z;
    }
}
