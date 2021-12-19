package com.bytedance.android.live.network;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.C22092q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.network.j */
public final class C5812j extends AbstractC22019c.AbstractC22020a {

    /* renamed from: a */
    public static final C5813a f14666a = new C5813a((byte) 0);

    /* renamed from: b */
    private final AbstractC22019c.AbstractC22020a f14667b;

    static {
        Covode.recordClassIndex(6417);
    }

    /* renamed from: com.bytedance.android.live.network.j$a */
    public static final class C5813a {
        static {
            Covode.recordClassIndex(6418);
        }

        private C5813a() {
        }

        public /* synthetic */ C5813a(byte b) {
            this();
        }
    }

    public C5812j(AbstractC22019c.AbstractC22020a aVar) {
        C89219l.m154721d(aVar, "");
        this.f14667b = aVar;
    }

    @Override // com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a
    /* renamed from: a */
    public final AbstractC22019c<?> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar) {
        Annotation[] annotationArr2;
        AbstractC5796a.EnumC5797a a;
        if (annotationArr == null) {
            annotationArr2 = new Annotation[0];
        } else {
            annotationArr2 = annotationArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotationArr2) {
            if (annotation instanceof AbstractC5796a) {
                arrayList.add(annotation);
            }
        }
        AbstractC5796a aVar = (AbstractC5796a) C89070n.m154583g((List) arrayList);
        if (aVar == null || (a = aVar.mo11568a()) == null) {
            return this.f14667b.mo11589a(type, annotationArr, qVar);
        }
        AbstractC22019c<?> a2 = this.f14667b.mo11589a(type, annotationArr, qVar);
        if (a2 != null) {
            return new C5816m(a2, a);
        }
        return null;
    }
}
