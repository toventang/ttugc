package com.bytedance.ies.xbridge.p1301e;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.e.e */
public final class C18512e {

    /* renamed from: a */
    public final String f44166a;

    /* renamed from: b */
    public final long f44167b;

    /* renamed from: c */
    public final AbstractC18400b.AbstractC18404d f44168c;

    /* renamed from: d */
    public final WebView f44169d;

    static {
        Covode.recordClassIndex(21206);
    }

    public final int hashCode() {
        return this.f44166a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C18512e)) {
            return false;
        }
        C18512e eVar = (C18512e) obj;
        if (C89219l.m154714a((Object) this.f44166a, (Object) eVar.f44166a) && this.f44166a.length() > 0) {
            return true;
        }
        if (!C89219l.m154714a((Object) this.f44166a, (Object) eVar.f44166a) || !C89219l.m154714a(this.f44169d, eVar.f44169d) || this.f44169d == null) {
            return false;
        }
        return true;
    }

    public C18512e(String str, long j, AbstractC18400b.AbstractC18404d dVar, WebView webView) {
        C89219l.m154719c(str, "");
        this.f44166a = str;
        this.f44167b = j;
        this.f44168c = dVar;
        this.f44169d = webView;
    }
}
