package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;

/* access modifiers changed from: package-private */
public class TypeAdapters$31 implements AbstractC28033w {

    /* renamed from: a */
    final /* synthetic */ C27895a f65644a;

    /* renamed from: b */
    final /* synthetic */ AbstractC28031v f65645b;

    static {
        Covode.recordClassIndex(33544);
    }

    TypeAdapters$31(C27895a aVar, AbstractC28031v vVar) {
        this.f65644a = aVar;
        this.f65645b = vVar;
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        if (aVar.equals(this.f65644a)) {
            return this.f65645b;
        }
        return null;
    }
}
