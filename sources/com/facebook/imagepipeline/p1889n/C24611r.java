package com.facebook.imagepipeline.p1889n;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1826c.p1827a.AbstractC24026e;

/* renamed from: com.facebook.imagepipeline.n.r */
public class C24611r extends AbstractC24523ae<Pair<AbstractC24026e, C24636b.EnumC24638b>, C24456e> {

    /* renamed from: c */
    private final AbstractC24380f f58487c;

    static {
        Covode.recordClassIndex(28755);
    }

    /* Return type fixed from 'java.io.Closeable' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.io.Closeable] */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24523ae
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C24456e mo40387a(C24456e eVar) {
        return C24456e.m46679a(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Pair<AbstractC24026e, C24636b.EnumC24638b> mo40388a(AbstractC24545al alVar) {
        AbstractC24380f fVar = this.f58487c;
        C24636b a = alVar.mo40413a();
        alVar.mo40417d();
        return Pair.create(fVar.mo40187a(a), alVar.mo40418e());
    }

    public C24611r(AbstractC24380f fVar, AbstractC24544ak akVar) {
        super(akVar);
        this.f58487c = fVar;
    }
}
