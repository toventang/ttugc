package com.p2082ss.android.ugc.aweme.profile.widgets.p3590g;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.AbstractC12798a;
import com.bytedance.covode.number.Covode;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.d */
public final class C64867d implements AbstractC12798a {

    /* renamed from: a */
    public final C12776a<C89378p<Exception, Integer>> f146656a;

    static {
        Covode.recordClassIndex(76334);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C64867d) && C89219l.m154714a(this.f146656a, ((C64867d) obj).f146656a);
        }
        return true;
    }

    public final int hashCode() {
        C12776a<C89378p<Exception, Integer>> aVar = this.f146656a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MineProfileEditData(onUserUpdateFailed=" + this.f146656a + ")";
    }

    public /* synthetic */ C64867d() {
        this(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends h.p<? extends java.lang.Exception, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C64867d(C12776a<? extends C89378p<? extends Exception, Integer>> aVar) {
        this.f146656a = aVar;
    }
}
