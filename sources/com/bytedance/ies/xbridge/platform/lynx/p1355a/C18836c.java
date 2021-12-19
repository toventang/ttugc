package com.bytedance.ies.xbridge.platform.lynx.p1355a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18687l;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.lynx.a.c */
public final class C18836c implements AbstractC18687l {

    /* renamed from: a */
    private final ReadableMapKeySetIterator f44644a;

    static {
        Covode.recordClassIndex(21533);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18687l
    /* renamed from: a */
    public final boolean mo29723a() {
        return this.f44644a.hasNextKey();
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18687l
    /* renamed from: b */
    public final String mo29724b() {
        String nextKey = this.f44644a.nextKey();
        C89219l.m154709a((Object) nextKey, "");
        return nextKey;
    }

    public C18836c(ReadableMapKeySetIterator readableMapKeySetIterator) {
        C89219l.m154719c(readableMapKeySetIterator, "");
        this.f44644a = readableMapKeySetIterator;
    }
}
