package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.google.gson.internal.bind.a */
public final class C27937a<E> extends AbstractC28031v<Object> {

    /* renamed from: a */
    public static final AbstractC28033w f65658a = new ArrayTypeAdapter$1();

    /* renamed from: b */
    private final Class<E> f65659b;

    /* renamed from: c */
    private final AbstractC28031v<E> f65660c;

    static {
        Covode.recordClassIndex(33550);
    }

    @Override // com.google.gson.AbstractC28031v
    public final Object read(C27897a aVar) {
        if (aVar.mo46627f() == EnumC27899b.NULL) {
            aVar.mo46631k();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo46621a();
        while (aVar.mo46626e()) {
            arrayList.add(this.f65660c.read(aVar));
        }
        aVar.mo46622b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f65659b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.gson.v<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.AbstractC28031v
    public final void write(C27900c cVar, Object obj) {
        if (obj == null) {
            cVar.mo46654f();
            return;
        }
        cVar.mo46647b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f65660c.write(cVar, Array.get(obj, i));
        }
        cVar.mo46649c();
    }

    public C27937a(C27910f fVar, AbstractC28031v<E> vVar, Class<E> cls) {
        this.f65660c = new C27948h(fVar, vVar, cls);
        this.f65659b = cls;
    }
}
