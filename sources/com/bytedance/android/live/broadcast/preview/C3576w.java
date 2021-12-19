package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.model.C3260f;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.preview.w */
public final /* synthetic */ class C3576w implements AbstractC89172b {

    /* renamed from: a */
    private final C3561v f9904a;

    static {
        Covode.recordClassIndex(4063);
    }

    C3576w(C3561v vVar) {
        this.f9904a = vVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C3561v vVar = this.f9904a;
        C3260f fVar = (C3260f) obj;
        if (vVar.f9871a != null) {
            C6203g.m13467b(new RunnableC3650x(vVar, fVar), null);
            C6203g.m13467b(new RunnableC3651y(vVar, fVar), null);
            C6203g.m13467b(new RunnableC3652z(vVar), null);
        }
        return C89391z.f203057a;
    }
}
