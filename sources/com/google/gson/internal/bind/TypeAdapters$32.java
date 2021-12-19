package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;

/* access modifiers changed from: package-private */
public class TypeAdapters$32 implements AbstractC28033w {

    /* renamed from: a */
    final /* synthetic */ Class f65646a;

    /* renamed from: b */
    final /* synthetic */ AbstractC28031v f65647b;

    static {
        Covode.recordClassIndex(33545);
    }

    public final String toString() {
        return "Factory[type=" + this.f65646a.getName() + ",adapter=" + this.f65647b + "]";
    }

    TypeAdapters$32(Class cls, AbstractC28031v vVar) {
        this.f65646a = cls;
        this.f65647b = vVar;
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        if (aVar.rawType == this.f65646a) {
            return this.f65647b;
        }
        return null;
    }
}
