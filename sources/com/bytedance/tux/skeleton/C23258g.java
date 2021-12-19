package com.bytedance.tux.skeleton;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.AbstractC89222o;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4620k.AbstractC89278d;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.tux.skeleton.g */
public final /* synthetic */ class C23258g extends AbstractC89222o {
    static {
        Covode.recordClassIndex(27201);
    }

    C23258g(AbstractC23256f fVar) {
        super(fVar);
    }

    @Override // p4600h.p4620k.AbstractC89276b, p4600h.p4611f.p4613b.AbstractC89208c
    public final String getName() {
        return "animator";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final String getSignature() {
        return "getAnimator()Landroid/animation/ValueAnimator;";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final AbstractC89278d getOwner() {
        return C89204ab.m154669a(AbstractC23256f.class);
    }

    @Override // p4600h.p4620k.AbstractC89288j
    public final Object get() {
        return ((AbstractC23237a) this.receiver).getAnimator();
    }
}
