package com.p2082ss.android.ugc.aweme.qna.p3649g;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.g.a */
public final class C66277a<T> implements AbstractC1214u<C66278b<? extends T>> {

    /* renamed from: a */
    private final AbstractC89172b<T, C89391z> f149004a;

    static {
        Covode.recordClassIndex(77785);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super T, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C66277a(AbstractC89172b<? super T, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f149004a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(Object obj) {
        C66278b bVar = (C66278b) obj;
        if (bVar != null && !bVar.f149005a) {
            bVar.f149005a = true;
            T t = bVar.f149006b;
            if (t != null) {
                this.f149004a.invoke(t);
            }
        }
    }
}
