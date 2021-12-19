package com.snapchat.kit.sdk.core.config;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.config.g */
public final class C28969g implements AbstractC88078c<C28965f> {

    /* renamed from: a */
    private final AbstractC89405a<ConfigClient> f68444a;

    /* renamed from: b */
    private final AbstractC89405a<SharedPreferences> f68445b;

    static {
        Covode.recordClassIndex(35155);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C28965f(this.f68444a.get(), this.f68445b.get());
    }

    public C28969g(AbstractC89405a<ConfigClient> aVar, AbstractC89405a<SharedPreferences> aVar2) {
        this.f68444a = aVar;
        this.f68445b = aVar2;
    }
}
