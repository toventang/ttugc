package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.gson.internal.bind.h */
final class C27948h<T> extends AbstractC28031v<T> {

    /* renamed from: a */
    private final C27910f f65682a;

    /* renamed from: b */
    private final AbstractC28031v<T> f65683b;

    /* renamed from: c */
    private final Type f65684c;

    static {
        Covode.recordClassIndex(33561);
    }

    @Override // com.google.gson.AbstractC28031v
    public final T read(C27897a aVar) {
        return this.f65683b.read(aVar);
    }

    @Override // com.google.gson.AbstractC28031v
    public final void write(C27900c cVar, T t) {
        AbstractC28031v<T> vVar = this.f65683b;
        Type type = this.f65684c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f65684c) {
            vVar = this.f65682a.mo46663a((C27895a) C27895a.get(type));
            if (vVar instanceof ReflectiveTypeAdapterFactory.C27932a) {
                AbstractC28031v<T> vVar2 = this.f65683b;
                if (!(vVar2 instanceof ReflectiveTypeAdapterFactory.C27932a)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.write(cVar, t);
    }

    C27948h(C27910f fVar, AbstractC28031v<T> vVar, Type type) {
        this.f65682a = fVar;
        this.f65683b = vVar;
        this.f65684c = type;
    }
}
