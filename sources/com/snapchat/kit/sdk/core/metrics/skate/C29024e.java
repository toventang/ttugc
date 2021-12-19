package com.snapchat.kit.sdk.core.metrics.skate;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import java.util.Random;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.skate.e */
public final class C29024e implements AbstractC88078c<C29023d> {

    /* renamed from: a */
    private final AbstractC89405a<SharedPreferences> f68571a;

    /* renamed from: b */
    private final AbstractC89405a<Random> f68572b;

    static {
        Covode.recordClassIndex(35351);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C29023d(this.f68571a.get(), this.f68572b.get());
    }

    public C29024e(AbstractC89405a<SharedPreferences> aVar, AbstractC89405a<Random> aVar2) {
        this.f68571a = aVar;
        this.f68572b = aVar2;
    }
}
