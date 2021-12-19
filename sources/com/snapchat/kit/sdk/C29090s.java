package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.s */
public final class C29090s implements AbstractC88078c<C29072l> {

    /* renamed from: a */
    private final C29085n f68761a;

    /* renamed from: b */
    private final AbstractC89405a<SharedPreferences> f68762b;

    /* renamed from: c */
    private final AbstractC89405a<C27910f> f68763c;

    static {
        Covode.recordClassIndex(35439);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return C88081f.m153153a(new C29072l(this.f68762b.get(), this.f68763c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    C29090s(C29085n nVar, AbstractC89405a<SharedPreferences> aVar, AbstractC89405a<C27910f> aVar2) {
        this.f68761a = nVar;
        this.f68762b = aVar;
        this.f68763c = aVar2;
    }
}
