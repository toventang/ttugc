package com.facebook.imagepipeline.p1879d;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.AbstractC24092j;
import com.facebook.common.p1836h.C24117a;

/* renamed from: com.facebook.imagepipeline.d.o */
public final class C24396o<K, V> implements AbstractC24397p<K, V> {

    /* renamed from: a */
    private final AbstractC24397p<K, V> f57847a;

    /* renamed from: b */
    private final AbstractC24399r f57848b;

    static {
        Covode.recordClassIndex(28539);
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24397p
    /* renamed from: a */
    public final int mo40200a(AbstractC24092j<K> jVar) {
        return this.f57847a.mo40200a((AbstractC24092j) jVar);
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24397p
    /* renamed from: a */
    public final C24117a<V> mo40201a(K k) {
        C24117a<V> a = this.f57847a.mo40201a((Object) k);
        if (a == null) {
            this.f57848b.mo40171a();
        } else {
            this.f57848b.mo40172b();
        }
        return a;
    }

    public C24396o(AbstractC24397p<K, V> pVar, AbstractC24399r rVar) {
        this.f57847a = pVar;
        this.f57848b = rVar;
    }

    @Override // com.facebook.imagepipeline.p1879d.AbstractC24397p
    /* renamed from: a */
    public final C24117a<V> mo40202a(K k, C24117a<V> aVar) {
        return this.f57847a.mo40202a(k, aVar);
    }
}
