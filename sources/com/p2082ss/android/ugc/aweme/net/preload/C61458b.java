package com.p2082ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import java.net.URI;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.preload.b */
public final class C61458b {

    /* renamed from: a */
    public final String f139517a;

    /* renamed from: b */
    public String f139518b;

    static {
        Covode.recordClassIndex(72114);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61458b)) {
            return false;
        }
        C61458b bVar = (C61458b) obj;
        return C89219l.m154714a(this.f139517a, bVar.f139517a) && C89219l.m154714a(this.f139518b, bVar.f139518b);
    }

    public final int hashCode() {
        String str = this.f139517a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139518b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PreloadKey(url=" + this.f139517a + ", key=" + this.f139518b + ")";
    }

    private C61458b(String str) {
        C89219l.m154721d(str, "");
        this.f139517a = str;
        this.f139518b = null;
        try {
            URI uri = new URI(str);
            this.f139518b = String.valueOf((uri.getScheme() + uri.getPath() + uri.getQuery()).hashCode());
        } catch (Exception e) {
            e.getMessage();
            this.f139518b = "error";
        }
        if (this.f139518b == null) {
            this.f139518b = "error";
        }
    }

    public /* synthetic */ C61458b(String str, byte b) {
        this(str);
    }
}
