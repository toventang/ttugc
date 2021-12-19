package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;
import okhttp3.C90040c;

/* renamed from: com.snapchat.kit.sdk.core.networking.e */
public final class C29029e implements AbstractC88078c<C29025a> {

    /* renamed from: a */
    private final AbstractC89405a<C90040c> f68584a;

    /* renamed from: b */
    private final AbstractC89405a<C27910f> f68585b;

    /* renamed from: c */
    private final AbstractC89405a<C29027c> f68586c;

    /* renamed from: d */
    private final AbstractC89405a<C29031g> f68587d;

    /* renamed from: e */
    private final AbstractC89405a<C29034i> f68588e;

    static {
        Covode.recordClassIndex(35362);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C29025a(this.f68584a.get(), this.f68585b.get(), this.f68586c.get(), this.f68587d.get(), this.f68588e.get());
    }

    public C29029e(AbstractC89405a<C90040c> aVar, AbstractC89405a<C27910f> aVar2, AbstractC89405a<C29027c> aVar3, AbstractC89405a<C29031g> aVar4, AbstractC89405a<C29034i> aVar5) {
        this.f68584a = aVar;
        this.f68585b = aVar2;
        this.f68586c = aVar3;
        this.f68587d = aVar4;
        this.f68588e = aVar5;
    }
}
