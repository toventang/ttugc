package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.p2070c.C29004i;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.l */
public final class C29013l implements AbstractC88078c<C29004i> {

    /* renamed from: a */
    private final AbstractC89405a<SharedPreferences> f68534a;

    static {
        Covode.recordClassIndex(35210);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        C29004i iVar = new C29004i(this.f68534a.get());
        iVar.f68517b = iVar.f68516a.getLong("sequence_id_max", 0);
        return C88081f.m153153a(iVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public C29013l(AbstractC89405a<SharedPreferences> aVar) {
        this.f68534a = aVar;
    }
}
