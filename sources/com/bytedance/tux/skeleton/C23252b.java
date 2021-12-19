package com.bytedance.tux.skeleton;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.AbstractC89222o;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4620k.AbstractC89278d;

/* renamed from: com.bytedance.tux.skeleton.b */
final /* synthetic */ class C23252b extends AbstractC89222o {
    static {
        Covode.recordClassIndex(27195);
    }

    C23252b(AbstractC23237a aVar) {
        super(aVar);
    }

    @Override // p4600h.p4620k.AbstractC89276b, p4600h.p4611f.p4613b.AbstractC89208c
    public final String getName() {
        return "radius";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final String getSignature() {
        return "getRadius()F";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final AbstractC89278d getOwner() {
        return C89204ab.m154669a(AbstractC23237a.class);
    }

    @Override // p4600h.p4620k.AbstractC89288j
    public final Object get() {
        return Float.valueOf(((AbstractC23237a) this.receiver).getRadius());
    }
}
