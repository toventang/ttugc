package com.bytedance.android.live.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.mime.TypedInput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.network.g */
final /* synthetic */ class C5808g implements AbstractC22043e {

    /* renamed from: a */
    private final C5806f f14651a;

    /* renamed from: b */
    private final Class f14652b;

    /* renamed from: c */
    private final Class[] f14653c;

    /* renamed from: d */
    private final String f14654d;

    /* renamed from: e */
    private final Type f14655e;

    /* renamed from: f */
    private final Annotation[] f14656f;

    /* renamed from: g */
    private final C22092q f14657g;

    static {
        Covode.recordClassIndex(6408);
    }

    C5808g(C5806f fVar, Class cls, Class[] clsArr, String str, Type type, Annotation[] annotationArr, C22092q qVar) {
        this.f14651a = fVar;
        this.f14652b = cls;
        this.f14653c = clsArr;
        this.f14654d = str;
        this.f14655e = type;
        this.f14656f = annotationArr;
        this.f14657g = qVar;
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e
    /* renamed from: a */
    public final Object mo11580a(Object obj) {
        return this.f14651a.mo11576a(this.f14652b, this.f14653c, this.f14654d, this.f14655e, this.f14656f, this.f14657g, (TypedInput) obj);
    }
}
