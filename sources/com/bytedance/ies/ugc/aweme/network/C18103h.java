package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22092q;

/* renamed from: com.bytedance.ies.ugc.aweme.network.h */
final class C18103h implements AbstractC18099f {

    /* renamed from: a */
    private final C22092q f43095a;

    static {
        Covode.recordClassIndex(20742);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.AbstractC18099f
    /* renamed from: a */
    public final <T> T mo28858a(Class<T> cls) {
        return (T) this.f43095a.mo35884a(cls);
    }

    C18103h(C18077a aVar) {
        this.f43095a = RetrofitFactory.m33636a(aVar);
    }
}
