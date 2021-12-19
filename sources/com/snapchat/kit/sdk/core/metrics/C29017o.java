package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.p2069b.C28991a;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.o */
public final class C29017o implements AbstractC88078c<C29015n> {

    /* renamed from: a */
    private final AbstractC89405a<SharedPreferences> f68542a;

    /* renamed from: b */
    private final AbstractC89405a<MetricsClient> f68543b;

    /* renamed from: c */
    private final AbstractC89405a<C28991a> f68544c;

    /* renamed from: d */
    private final AbstractC89405a<String> f68545d;

    static {
        Covode.recordClassIndex(35343);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C29015n(this.f68542a.get(), this.f68543b.get(), this.f68544c.get(), this.f68545d.get());
    }

    public C29017o(AbstractC89405a<SharedPreferences> aVar, AbstractC89405a<MetricsClient> aVar2, AbstractC89405a<C28991a> aVar3, AbstractC89405a<String> aVar4) {
        this.f68542a = aVar;
        this.f68543b = aVar2;
        this.f68544c = aVar3;
        this.f68545d = aVar4;
    }
}
