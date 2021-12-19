package com.snapchat.kit.sdk.core.metrics.skate;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.config.C28965f;
import com.snapchat.kit.sdk.core.metrics.p2069b.C28991a;
import com.snapchat.kit.sdk.core.metrics.p2070c.C29004i;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.skate.b */
public final class C29020b implements AbstractC88078c<C29018a> {

    /* renamed from: a */
    private final AbstractC89405a<C28965f> f68553a;

    /* renamed from: b */
    private final AbstractC89405a<SharedPreferences> f68554b;

    /* renamed from: c */
    private final AbstractC89405a<C29004i> f68555c;

    /* renamed from: d */
    private final AbstractC89405a<SkateClient> f68556d;

    /* renamed from: e */
    private final AbstractC89405a<C28991a> f68557e;

    static {
        Covode.recordClassIndex(35347);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C29018a(this.f68553a.get(), this.f68554b.get(), this.f68555c.get(), this.f68556d.get(), this.f68557e.get());
    }

    public C29020b(AbstractC89405a<C28965f> aVar, AbstractC89405a<SharedPreferences> aVar2, AbstractC89405a<C29004i> aVar3, AbstractC89405a<SkateClient> aVar4, AbstractC89405a<C28991a> aVar5) {
        this.f68553a = aVar;
        this.f68554b = aVar2;
        this.f68555c = aVar3;
        this.f68556d = aVar4;
        this.f68557e = aVar5;
    }
}
