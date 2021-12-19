package com.p2082ss.android.ugc.aweme.common.p2636h;

import android.animation.TypeEvaluator;
import com.bytedance.covode.number.Covode;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.common.h.b */
public final class C39126b implements TypeEvaluator<C89378p<? extends Float, ? extends Float>> {

    /* renamed from: a */
    public static final C39126b f92328a = new C39126b();

    private C39126b() {
    }

    static {
        Covode.recordClassIndex(46744);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ C89378p<? extends Float, ? extends Float> evaluate(float f, C89378p<? extends Float, ? extends Float> pVar, C89378p<? extends Float, ? extends Float> pVar2) {
        C89378p<? extends Float, ? extends Float> pVar3 = pVar;
        C89378p<? extends Float, ? extends Float> pVar4 = pVar2;
        if (pVar3 == null || pVar4 == null) {
            return new C89378p(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        return new C89378p(Float.valueOf(((((Number) pVar4.getFirst()).floatValue() - ((Number) pVar3.getFirst()).floatValue()) * f) + ((Number) pVar3.getFirst()).floatValue()), Float.valueOf(((((Number) pVar4.getSecond()).floatValue() - ((Number) pVar3.getSecond()).floatValue()) * f) + ((Number) pVar3.getSecond()).floatValue()));
    }
}
