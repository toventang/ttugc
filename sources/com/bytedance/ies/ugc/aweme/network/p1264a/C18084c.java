package com.bytedance.ies.ugc.aweme.network.p1264a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: com.bytedance.ies.ugc.aweme.network.a.c */
public final class C18084c extends AbstractC22043e.AbstractC22044a {

    /* renamed from: a */
    private final C27910f f43053a;

    static {
        Covode.recordClassIndex(20721);
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<?, TypedOutput> mo11575a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C22092q qVar) {
        return null;
    }

    public C18084c(C27910f fVar) {
        Objects.requireNonNull(fVar, "gson == null");
        this.f43053a = fVar;
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<TypedInput, ?> mo11574a(Type type, Annotation[] annotationArr, C22092q qVar) {
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class) || !C18079b.class.isAssignableFrom((Class) rawType)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            return new C18085d(this.f43053a, this.f43053a.mo46663a((C27895a) C27895a.get(actualTypeArguments[0])));
        }
        throw new RuntimeException("ChunkBundle should have one generic type.");
    }
}
