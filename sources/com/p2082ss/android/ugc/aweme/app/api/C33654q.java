package com.p2082ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: com.ss.android.ugc.aweme.app.api.q */
public final class C33654q<T extends Message<T, ?>> implements AbstractC22043e<TypedInput, T> {

    /* renamed from: a */
    private final ProtoAdapter<T> f79850a;

    static {
        Covode.recordClassIndex(40547);
    }

    public C33654q(ProtoAdapter<T> protoAdapter) {
        this.f79850a = protoAdapter;
    }

    /* renamed from: a */
    public final T mo11580a(TypedInput typedInput) {
        try {
            return this.f79850a.decode(typedInput.mo11577in());
        } finally {
            typedInput.mo11577in().reset();
        }
    }
}
