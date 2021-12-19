package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.snapchat.kit.sdk.core.controller.C28971b;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.p2070c.C29001f;
import com.snapchat.kit.sdk.core.networking.C29037l;
import com.snapchat.kit.sdk.core.security.SecureSharedPreferences;
import dagger.AbstractC88075a;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88077b;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;
import okhttp3.C90208y;

/* renamed from: com.snapchat.kit.sdk.v */
public final class C29093v implements AbstractC88078c<C29073m> {

    /* renamed from: a */
    private final C29085n f68766a;

    /* renamed from: b */
    private final AbstractC89405a<SecureSharedPreferences> f68767b;

    /* renamed from: c */
    private final AbstractC89405a<C29072l> f68768c;

    /* renamed from: d */
    private final AbstractC89405a<C28971b> f68769d;

    /* renamed from: e */
    private final AbstractC89405a<C90208y> f68770e;

    /* renamed from: f */
    private final AbstractC89405a<C29037l> f68771f;

    /* renamed from: g */
    private final AbstractC89405a<C27910f> f68772g;

    /* renamed from: h */
    private final AbstractC89405a<MetricQueue<ServerEvent>> f68773h;

    /* renamed from: i */
    private final AbstractC89405a<C29001f> f68774i;

    /* renamed from: j */
    private final AbstractC89405a<MetricQueue<OpMetric>> f68775j;

    static {
        Covode.recordClassIndex(35442);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        C29085n nVar = this.f68766a;
        AbstractC88075a b = C88077b.m153150b(this.f68775j);
        return C88081f.m153153a(new C29073m(nVar.f68749b, nVar.f68750c, nVar.f68751d, nVar.f68748a, this.f68767b.get(), this.f68768c.get(), this.f68769d.get(), this.f68770e.get(), C88077b.m153150b(this.f68771f), this.f68772g.get(), C88077b.m153150b(this.f68773h), this.f68774i.get(), b, nVar.f68753f, nVar.f68754g), "Cannot return null from a non-@Nullable @Provides method");
    }

    C29093v(C29085n nVar, AbstractC89405a<SecureSharedPreferences> aVar, AbstractC89405a<C29072l> aVar2, AbstractC89405a<C28971b> aVar3, AbstractC89405a<C90208y> aVar4, AbstractC89405a<C29037l> aVar5, AbstractC89405a<C27910f> aVar6, AbstractC89405a<MetricQueue<ServerEvent>> aVar7, AbstractC89405a<C29001f> aVar8, AbstractC89405a<MetricQueue<OpMetric>> aVar9) {
        this.f68766a = nVar;
        this.f68767b = aVar;
        this.f68768c = aVar2;
        this.f68769d = aVar3;
        this.f68770e = aVar4;
        this.f68771f = aVar5;
        this.f68772g = aVar6;
        this.f68773h = aVar7;
        this.f68774i = aVar8;
        this.f68775j = aVar9;
    }
}
