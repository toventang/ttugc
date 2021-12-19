package com.bytedance.tux.skeleton;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.AbstractC89222o;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4620k.AbstractC89278d;

/* renamed from: com.bytedance.tux.skeleton.d */
final /* synthetic */ class C23254d extends AbstractC89222o {
    static {
        Covode.recordClassIndex(27197);
    }

    C23254d(AbstractC23237a aVar) {
        super(aVar);
    }

    @Override // p4600h.p4620k.AbstractC89276b, p4600h.p4611f.p4613b.AbstractC89208c
    public final String getName() {
        return "pulsingColor";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final String getSignature() {
        return "getPulsingColor()I";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final AbstractC89278d getOwner() {
        return C89204ab.m154669a(AbstractC23237a.class);
    }

    @Override // p4600h.p4620k.AbstractC89288j
    public final Object get() {
        return Integer.valueOf(((AbstractC23237a) this.receiver).getPulsingColor());
    }
}
