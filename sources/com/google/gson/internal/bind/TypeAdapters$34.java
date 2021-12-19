package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;

class TypeAdapters$34 implements AbstractC28033w {

    /* renamed from: a */
    final /* synthetic */ Class f65651a;

    /* renamed from: b */
    final /* synthetic */ Class f65652b;

    /* renamed from: c */
    final /* synthetic */ AbstractC28031v f65653c;

    static {
        Covode.recordClassIndex(33547);
    }

    public final String toString() {
        return "Factory[type=" + this.f65651a.getName() + "+" + this.f65652b.getName() + ",adapter=" + this.f65653c + "]";
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (cls == this.f65651a || cls == this.f65652b) {
            return this.f65653c;
        }
        return null;
    }

    TypeAdapters$34(Class cls, Class cls2, AbstractC28031v vVar) {
        this.f65651a = cls;
        this.f65652b = cls2;
        this.f65653c = vVar;
    }
}
