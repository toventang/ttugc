package com.snapchat.kit.sdk.core.metrics.p2070c;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.p2069b.C28991a;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.c.c */
public final class C28998c implements AbstractC88078c<C28996b> {

    /* renamed from: a */
    private final AbstractC89405a<SharedPreferences> f68503a;

    /* renamed from: b */
    private final AbstractC89405a<C29004i> f68504b;

    /* renamed from: c */
    private final AbstractC89405a<MetricsClient> f68505c;

    /* renamed from: d */
    private final AbstractC89405a<C28991a> f68506d;

    static {
        Covode.recordClassIndex(35195);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C28996b(this.f68503a.get(), this.f68504b.get(), this.f68505c.get(), this.f68506d.get());
    }

    public C28998c(AbstractC89405a<SharedPreferences> aVar, AbstractC89405a<C29004i> aVar2, AbstractC89405a<MetricsClient> aVar3, AbstractC89405a<C28991a> aVar4) {
        this.f68503a = aVar;
        this.f68504b = aVar2;
        this.f68505c = aVar3;
        this.f68506d = aVar4;
    }
}
