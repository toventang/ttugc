package com.p2082ss.android.ugc.aweme.discover.repo.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.discover.repo.gson.b */
public final class C42523b<T> extends AbstractC28031v<T> {

    /* renamed from: a */
    private final C27910f f99144a;

    /* renamed from: b */
    private final AbstractC28031v<T> f99145b;

    /* renamed from: c */
    private final Type f99146c;

    static {
        Covode.recordClassIndex(50613);
    }

    @Override // com.google.gson.AbstractC28031v
    public final T read(C27897a aVar) {
        return this.f99145b.read(aVar);
    }

    @Override // com.google.gson.AbstractC28031v
    public final void write(C27900c cVar, T t) {
        AbstractC28031v<T> vVar = this.f99145b;
        Type type = this.f99146c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f99146c) {
            vVar = this.f99144a.mo46663a((C27895a) C27895a.get(type));
            if (vVar instanceof ReflectiveTypeAdapterFactory.C27932a) {
                AbstractC28031v<T> vVar2 = this.f99145b;
                if (!(vVar2 instanceof ReflectiveTypeAdapterFactory.C27932a)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.write(cVar, t);
    }

    C42523b(C27910f fVar, AbstractC28031v<T> vVar, Type type) {
        this.f99144a = fVar;
        this.f99145b = vVar;
        this.f99146c = type;
    }
}
