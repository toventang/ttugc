package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.internal.C27980c;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2019b.C27895a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements AbstractC28033w {

    /* renamed from: a */
    private final C27980c f65605a;

    static {
        Covode.recordClassIndex(33528);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(C27980c cVar) {
        this.f65605a = cVar;
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        AbstractC27890b bVar = (AbstractC27890b) aVar.rawType.getAnnotation(AbstractC27890b.class);
        if (bVar == null) {
            return null;
        }
        return (AbstractC28031v<T>) m55988a(this.f65605a, fVar, aVar, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.gson.AbstractC28031v<?> m55988a(com.google.gson.internal.C27980c r6, com.google.gson.C27910f r7, com.google.gson.p2019b.C27895a<?> r8, com.google.gson.p2018a.AbstractC27890b r9) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.m55988a(com.google.gson.internal.c, com.google.gson.f, com.google.gson.b.a, com.google.gson.a.b):com.google.gson.v");
    }
}
