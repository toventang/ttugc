package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: com.bytedance.ies.ugc.aweme.network.b */
public final class C18093b extends AbstractC22043e.AbstractC22044a {

    /* renamed from: a */
    private final C27910f f43080a;

    static {
        Covode.recordClassIndex(20731);
    }

    C18093b(C27910f fVar) {
        Objects.requireNonNull(fVar, "gson == null");
        this.f43080a = fVar;
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<TypedInput, ?> mo11574a(Type type, Annotation[] annotationArr, C22092q qVar) {
        return new C18095d(this.f43080a, this.f43080a.mo46663a((C27895a) C27895a.get(type)));
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<?, TypedOutput> mo11575a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C22092q qVar) {
        return new C18094c(this.f43080a, this.f43080a.mo46663a((C27895a) C27895a.get(type)));
    }
}
