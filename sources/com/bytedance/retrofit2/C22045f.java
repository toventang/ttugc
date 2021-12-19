package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22019c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.retrofit2.f */
public final class C22045f extends AbstractC22019c.AbstractC22020a {

    /* renamed from: a */
    static final AbstractC22019c.AbstractC22020a f52071a = new C22045f();

    C22045f() {
    }

    static {
        Covode.recordClassIndex(25735);
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a
    /* renamed from: a */
    public final AbstractC22019c<?> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar) {
        if (C22101w.m41534a(type) != AbstractC21983b.class) {
            return null;
        }
        final Type e = C22101w.m41547e(type);
        return new AbstractC22019c<AbstractC21983b<?>>() {
            /* class com.bytedance.retrofit2.C22045f.C220461 */

            static {
                Covode.recordClassIndex(25736);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.retrofit2.AbstractC22019c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ AbstractC21983b<?> mo11590a(AbstractC21983b bVar) {
                return bVar;
            }

            @Override // com.bytedance.retrofit2.AbstractC22019c
            /* renamed from: a */
            public final Type mo11591a() {
                return e;
            }
        };
    }
}
