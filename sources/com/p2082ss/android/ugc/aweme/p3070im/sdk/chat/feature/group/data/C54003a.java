package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.a */
public final class C54003a<T> implements AbstractC1214u<C54005c<? extends T>> {

    /* renamed from: a */
    private final AbstractC89172b<T, C89391z> f123828a;

    static {
        Covode.recordClassIndex(63672);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super T, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C54003a(AbstractC89172b<? super T, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f123828a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(Object obj) {
        C54005c cVar = (C54005c) obj;
        if (cVar != null && !cVar.f123829a) {
            cVar.f123829a = true;
            T t = cVar.f123830b;
            if (t != null) {
                this.f123828a.invoke(t);
            }
        }
    }
}
