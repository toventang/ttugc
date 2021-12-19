package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.internal.C27925b;
import com.google.gson.p2019b.C27895a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

class ArrayTypeAdapter$1 implements AbstractC28033w {
    static {
        Covode.recordClassIndex(33524);
    }

    ArrayTypeAdapter$1() {
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        Type type;
        Type type2 = aVar.type;
        if (type2 instanceof GenericArrayType) {
            type = ((GenericArrayType) type2).getGenericComponentType();
        } else if (!(type2 instanceof Class) || !((Class) type2).isArray()) {
            return null;
        } else {
            type = ((Class) type2).getComponentType();
        }
        return new C27937a(fVar, fVar.mo46663a((C27895a) C27895a.get(type)), C27925b.m55985c(type));
    }
}
