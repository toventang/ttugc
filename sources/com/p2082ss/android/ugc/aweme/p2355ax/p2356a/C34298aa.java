package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ax.a.aa */
public final class C34298aa<T extends AbstractC34346s> {

    /* renamed from: a */
    public final AbstractC89277c<T> f81132a;

    /* renamed from: b */
    public final AbstractC89187q<Uri, C34324g, Map<String, String>, T> f81133b;

    static {
        Covode.recordClassIndex(41242);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34298aa)) {
            return false;
        }
        C34298aa aaVar = (C34298aa) obj;
        return C89219l.m154714a(this.f81132a, aaVar.f81132a) && C89219l.m154714a(this.f81133b, aaVar.f81133b);
    }

    public final int hashCode() {
        AbstractC89277c<T> cVar = this.f81132a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        AbstractC89187q<Uri, C34324g, Map<String, String>, T> qVar = this.f81133b;
        if (qVar != null) {
            i = qVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SessionApi(iApi=" + this.f81132a + ", provider=" + this.f81133b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.q<? super android.net.Uri, ? super com.ss.android.ugc.aweme.ax.a.g, ? super java.util.Map<java.lang.String, java.lang.String>, ? extends T extends com.ss.android.ugc.aweme.ax.a.s> */
    /* JADX WARN: Multi-variable type inference failed */
    public C34298aa(AbstractC89277c<T> cVar, AbstractC89187q<? super Uri, ? super C34324g, ? super Map<String, String>, ? extends T> qVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(qVar, "");
        this.f81132a = cVar;
        this.f81133b = qVar;
    }
}
