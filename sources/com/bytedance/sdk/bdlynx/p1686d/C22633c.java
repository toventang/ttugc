package com.bytedance.sdk.bdlynx.p1686d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.d.c */
public final class C22633c {

    /* renamed from: a */
    public List<String> f53454a;

    /* renamed from: b */
    public String f53455b;

    /* renamed from: c */
    public Uri f53456c;

    static {
        Covode.recordClassIndex(26450);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22633c)) {
            return false;
        }
        C22633c cVar = (C22633c) obj;
        return C89219l.m154714a(this.f53454a, cVar.f53454a) && C89219l.m154714a(this.f53455b, cVar.f53455b) && C89219l.m154714a(this.f53456c, cVar.f53456c);
    }

    public final int hashCode() {
        List<String> list = this.f53454a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f53455b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Uri uri = this.f53456c;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ReWriterInfo(resPrefix=" + this.f53454a + ", resPath=" + this.f53455b + ", templateUri=" + this.f53456c + ")";
    }

    private C22633c() {
        this.f53454a = null;
        this.f53455b = null;
        this.f53456c = null;
    }

    public /* synthetic */ C22633c(byte b) {
        this();
    }
}
