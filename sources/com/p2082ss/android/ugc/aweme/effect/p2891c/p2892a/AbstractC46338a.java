package com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import dmt.p4542av.video.C88300w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.c.a.a */
public abstract class AbstractC46338a {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC31071f> f108016a;

    static {
        Covode.recordClassIndex(54915);
    }

    /* renamed from: a */
    public abstract void mo78833a(C88300w wVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo78834a();

    /* renamed from: b */
    public abstract void mo78836b(C88300w wVar);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.asve.editor.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC46338a(AbstractC89171a<? extends AbstractC31071f> aVar) {
        C89219l.m154721d(aVar, "");
        this.f108016a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo78832a(C88300w wVar, int i) {
        if (wVar == null) {
            wVar = C88300w.m153449a();
        }
        AbstractC31071f invoke = this.f108016a.invoke();
        if (C88300w.m153452a(wVar)) {
            if (mo78834a()) {
                return invoke.mo56246G() - i;
            }
            return i;
        } else if (C88300w.m153455b(wVar) || C88300w.m153456c(wVar)) {
            return invoke.mo56384r(i);
        } else {
            if (C88300w.m153457d(wVar)) {
                return i;
            }
            throw new UnsupportedOperationException("apply time effect: " + wVar + " is not supported yet.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo78835b(C88300w wVar, int i) {
        if (wVar == null) {
            wVar = C88300w.m153449a();
        }
        AbstractC31071f invoke = this.f108016a.invoke();
        if (C88300w.m153452a(wVar)) {
            if (mo78834a()) {
                return invoke.mo56246G() - i;
            }
            return i;
        } else if (C88300w.m153455b(wVar) || C88300w.m153456c(wVar)) {
            return invoke.mo56386s(i);
        } else {
            if (C88300w.m153457d(wVar)) {
                return i;
            }
            throw new UnsupportedOperationException("apply time effect: " + wVar + " is not supported yet.");
        }
    }
}
