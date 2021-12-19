package com.facebook.imagepipeline.p1889n;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1826c.p1827a.AbstractC24026e;

/* renamed from: com.facebook.imagepipeline.n.ar */
public final class C24555ar extends C24611r {

    /* renamed from: c */
    private final AbstractC24380f f58326c;

    static {
        Covode.recordClassIndex(28699);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.C24611r
    /* renamed from: b */
    public final Pair<AbstractC24026e, C24636b.EnumC24638b> mo40388a(AbstractC24545al alVar) {
        C24636b a = alVar.mo40413a();
        AbstractC24380f fVar = this.f58326c;
        alVar.mo40417d();
        return Pair.create(fVar.mo40189b(a), alVar.mo40418e());
    }

    public C24555ar(AbstractC24380f fVar, AbstractC24544ak akVar) {
        super(fVar, akVar);
        this.f58326c = fVar;
    }
}
