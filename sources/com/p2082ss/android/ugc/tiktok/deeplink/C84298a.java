package com.p2082ss.android.ugc.tiktok.deeplink;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.deeplink.a */
public final class C84298a {

    /* renamed from: a */
    public final Uri f188498a;

    /* renamed from: b */
    public final Boolean f188499b;

    static {
        Covode.recordClassIndex(98220);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84298a)) {
            return false;
        }
        C84298a aVar = (C84298a) obj;
        return C89219l.m154714a(this.f188498a, aVar.f188498a) && C89219l.m154714a(this.f188499b, aVar.f188499b);
    }

    public final int hashCode() {
        Uri uri = this.f188498a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Boolean bool = this.f188499b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Input(uri=" + this.f188498a + ", fromPush=" + this.f188499b + ")";
    }

    public C84298a(Uri uri, Boolean bool) {
        this.f188498a = uri;
        this.f188499b = bool;
    }
}
