package com.p2082ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okhttp3.C90204w;
import p4632k.AbstractC89425g;
import p4632k.C89420f;

/* renamed from: com.ss.android.ugc.aweme.app.api.p */
final class C33653p<T extends Message<T, ?>> implements AbstractC22043e<T, TypedOutput> {

    /* renamed from: a */
    private static final C90204w f79848a = C90204w.m156843b("application/x-protobuf");

    /* renamed from: b */
    private final ProtoAdapter<T> f79849b;

    static {
        Covode.recordClassIndex(40546);
    }

    C33653p(ProtoAdapter<T> protoAdapter) {
        this.f79849b = protoAdapter;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.retrofit2.AbstractC22043e
    /* renamed from: a */
    public final /* synthetic */ TypedOutput mo11580a(Object obj) {
        C89420f fVar = new C89420f();
        this.f79849b.encode((AbstractC89425g) fVar, (T) obj);
        return new TypedByteArray(f79848a.f204877a, fVar.mo143853u(), new String[0]);
    }
}
