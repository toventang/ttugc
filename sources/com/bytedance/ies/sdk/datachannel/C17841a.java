package com.bytedance.ies.sdk.datachannel;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.sdk.datachannel.a */
public class C17841a<O> implements AbstractC17842b<O> {

    /* renamed from: a */
    public volatile O f42559a;

    static {
        Covode.recordClassIndex(20409);
    }

    public C17841a() {
    }

    @Override // com.bytedance.ies.sdk.datachannel.AbstractC17842b
    public O getValue() {
        return this.f42559a;
    }

    public C17841a(O o) {
        this.f42559a = o;
    }
}
