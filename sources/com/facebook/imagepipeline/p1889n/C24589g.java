package com.facebook.imagepipeline.p1889n;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1826c.p1827a.AbstractC24026e;

/* renamed from: com.facebook.imagepipeline.n.g */
public final class C24589g extends AbstractC24523ae<Pair<AbstractC24026e, C24636b.EnumC24638b>, C24117a<AbstractC24454c>> {

    /* renamed from: c */
    private final AbstractC24380f f58422c;

    static {
        Covode.recordClassIndex(28733);
    }

    /* Return type fixed from 'java.io.Closeable' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.io.Closeable] */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24523ae
    /* renamed from: a */
    public final /* synthetic */ C24117a<AbstractC24454c> mo40387a(C24117a<AbstractC24454c> aVar) {
        return C24117a.m45711b(aVar);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24523ae
    /* renamed from: a */
    public final /* synthetic */ Pair<AbstractC24026e, C24636b.EnumC24638b> mo40388a(AbstractC24545al alVar) {
        return Pair.create(this.f58422c.mo40188a(alVar.mo40413a(), alVar.mo40417d()), alVar.mo40418e());
    }

    public C24589g(AbstractC24380f fVar, AbstractC24544ak akVar) {
        super(akVar);
        this.f58422c = fVar;
    }
}
