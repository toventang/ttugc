package com.p2082ss.android.ugc.aweme.common;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.k */
public final class C39139k<DATA> {

    /* renamed from: a */
    public final AbstractC1204m f92346a;

    /* renamed from: b */
    public final AbstractC89172b<DATA, C89391z> f92347b;

    /* renamed from: c */
    public final AbstractC89172b<Throwable, C89391z> f92348c;

    static {
        Covode.recordClassIndex(46757);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39139k)) {
            return false;
        }
        C39139k kVar = (C39139k) obj;
        return C89219l.m154714a(this.f92346a, kVar.f92346a) && C89219l.m154714a(this.f92347b, kVar.f92347b) && C89219l.m154714a(this.f92348c, kVar.f92348c);
    }

    public final int hashCode() {
        AbstractC1204m mVar = this.f92346a;
        int i = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        AbstractC89172b<DATA, C89391z> bVar = this.f92347b;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        AbstractC89172b<Throwable, C89391z> bVar2 = this.f92348c;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EasyRxSubscriber(lifecycleOwner=" + this.f92346a + ", onSuccess=" + this.f92347b + ", onError=" + this.f92348c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super DATA, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39139k(AbstractC1204m mVar, AbstractC89172b<? super DATA, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        this.f92346a = mVar;
        this.f92347b = bVar;
        this.f92348c = bVar2;
    }
}
