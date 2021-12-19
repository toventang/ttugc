package com.bytedance.frameworks.baselib.network.http.retrofit.p996a.p997a;

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

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.a */
public final class C14761a extends AbstractC22043e.AbstractC22044a {

    /* renamed from: a */
    private final C27910f f35975a;

    static {
        Covode.recordClassIndex(16860);
    }

    /* renamed from: a */
    public static C14761a m27085a() {
        return m27086a(new C27910f());
    }

    /* renamed from: a */
    public static C14761a m27086a(C27910f fVar) {
        return new C14761a(fVar);
    }

    private C14761a(C27910f fVar) {
        Objects.requireNonNull(fVar, "gson == null");
        this.f35975a = fVar;
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<TypedInput, ?> mo11574a(Type type, Annotation[] annotationArr, C22092q qVar) {
        return new C14763c(this.f35975a, this.f35975a.mo46663a((C27895a) C27895a.get(type)));
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<?, TypedOutput> mo11575a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C22092q qVar) {
        return new C14762b(this.f35975a, this.f35975a.mo46663a((C27895a) C27895a.get(type)));
    }
}
