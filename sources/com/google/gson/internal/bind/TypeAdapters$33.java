package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;

/* access modifiers changed from: package-private */
public class TypeAdapters$33 implements AbstractC28033w {

    /* renamed from: a */
    final /* synthetic */ Class f65648a;

    /* renamed from: b */
    final /* synthetic */ Class f65649b;

    /* renamed from: c */
    final /* synthetic */ AbstractC28031v f65650c;

    static {
        Covode.recordClassIndex(33546);
    }

    public final String toString() {
        return "Factory[type=" + this.f65649b.getName() + "+" + this.f65648a.getName() + ",adapter=" + this.f65650c + "]";
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (cls == this.f65648a || cls == this.f65649b) {
            return this.f65650c;
        }
        return null;
    }

    TypeAdapters$33(Class cls, Class cls2, AbstractC28031v vVar) {
        this.f65648a = cls;
        this.f65649b = cls2;
        this.f65650c = vVar;
    }
}
