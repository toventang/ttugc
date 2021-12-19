package com.snapchat.kit.sdk.core.metrics.p2068a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.p2069b.C28991a;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.a.b */
public final class C28982b implements AbstractC88078c<C28980a> {

    /* renamed from: a */
    private final AbstractC89405a<SharedPreferences> f68466a;

    /* renamed from: b */
    private final AbstractC89405a<MetricsClient> f68467b;

    /* renamed from: c */
    private final AbstractC89405a<C28991a> f68468c;

    static {
        Covode.recordClassIndex(35179);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C28980a(this.f68466a.get(), this.f68467b.get(), this.f68468c.get());
    }

    public C28982b(AbstractC89405a<SharedPreferences> aVar, AbstractC89405a<MetricsClient> aVar2, AbstractC89405a<C28991a> aVar3) {
        this.f68466a = aVar;
        this.f68467b = aVar2;
        this.f68468c = aVar3;
    }
}
