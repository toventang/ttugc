package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.C28027t;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;

/* access modifiers changed from: package-private */
public class TypeAdapters$35 implements AbstractC28033w {

    /* renamed from: a */
    final /* synthetic */ Class f65654a;

    /* renamed from: b */
    final /* synthetic */ AbstractC28031v f65655b;

    static {
        Covode.recordClassIndex(33548);
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f65654a.getName() + ",adapter=" + this.f65655b + "]";
    }

    TypeAdapters$35(Class cls, AbstractC28031v vVar) {
        this.f65654a = cls;
        this.f65655b = vVar;
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T2> AbstractC28031v<T2> create(C27910f fVar, C27895a<T2> aVar) {
        final Class<? super T> cls = aVar.rawType;
        if (!this.f65654a.isAssignableFrom(cls)) {
            return null;
        }
        return new AbstractC28031v<T1>() {
            /* class com.google.gson.internal.bind.TypeAdapters$35.C279361 */

            static {
                Covode.recordClassIndex(33549);
            }

            @Override // com.google.gson.AbstractC28031v
            public final T1 read(C27897a aVar) {
                T1 t1 = (T1) TypeAdapters$35.this.f65655b.read(aVar);
                if (t1 == null || cls.isInstance(t1)) {
                    return t1;
                }
                throw new C28027t("Expected a " + cls.getName() + " but was " + t1.getClass().getName());
            }

            @Override // com.google.gson.AbstractC28031v
            public final void write(C27900c cVar, T1 t1) {
                TypeAdapters$35.this.f65655b.write(cVar, t1);
            }
        };
    }
}
