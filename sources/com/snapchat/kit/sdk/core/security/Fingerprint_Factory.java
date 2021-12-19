package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

public final class Fingerprint_Factory implements AbstractC88078c<Fingerprint> {
    private final AbstractC89405a<Context> contextProvider;

    static {
        Covode.recordClassIndex(35378);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final Fingerprint get() {
        return new Fingerprint(this.contextProvider.get());
    }

    public Fingerprint_Factory(AbstractC89405a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static AbstractC88078c<Fingerprint> create(AbstractC89405a<Context> aVar) {
        return new Fingerprint_Factory(aVar);
    }
}
