package com.p2082ss.android.ugc.aweme.search.gson;

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
/* renamed from: com.ss.android.ugc.aweme.search.gson.a */
public final class C67445a<T> extends AbstractC28031v<T> {

    /* renamed from: a */
    private final C27910f f151108a;

    /* renamed from: b */
    private final AbstractC28031v<T> f151109b;

    /* renamed from: c */
    private final Type f151110c;

    static {
        Covode.recordClassIndex(79082);
    }

    @Override // com.google.gson.AbstractC28031v
    public final T read(C27897a aVar) {
        return this.f151109b.read(aVar);
    }

    @Override // com.google.gson.AbstractC28031v
    public final void write(C27900c cVar, T t) {
        AbstractC28031v<T> vVar = this.f151109b;
        Type type = this.f151110c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f151110c) {
            vVar = this.f151108a.mo46663a((C27895a) C27895a.get(type));
            if (vVar instanceof ReflectiveTypeAdapterFactory.C27932a) {
                AbstractC28031v<T> vVar2 = this.f151109b;
                if (!(vVar2 instanceof ReflectiveTypeAdapterFactory.C27932a)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.write(cVar, t);
    }

    C67445a(C27910f fVar, AbstractC28031v<T> vVar, Type type) {
        this.f151108a = fVar;
        this.f151109b = vVar;
        this.f151110c = type;
    }
}
