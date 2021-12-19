package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.internal.bind.C27949i;
import com.google.gson.p2019b.C27895a;

class TypeAdapters$30 implements AbstractC28033w {
    static {
        Covode.recordClassIndex(33543);
    }

    TypeAdapters$30() {
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new C27949i.C27979a(cls);
    }
}
