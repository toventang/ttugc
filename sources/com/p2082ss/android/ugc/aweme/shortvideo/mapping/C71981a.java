package com.p2082ss.android.ugc.aweme.shortvideo.mapping;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.p936a.p937a.C14081a;
import java.io.Serializable;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mapping.a */
public final class C71981a {

    /* renamed from: a */
    public static final C14081a f161310a = new C14081a(C71982a.f161311a);

    static {
        Covode.recordClassIndex(84533);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mapping.a$a */
    static final class C71982a extends AbstractC89220m implements AbstractC89172b<Class<?>, Boolean> {

        /* renamed from: a */
        public static final C71982a f161311a = new C71982a();

        static {
            Covode.recordClassIndex(84534);
        }

        C71982a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            C89219l.m154721d(cls2, "");
            return Boolean.valueOf(Serializable.class.isAssignableFrom(cls2));
        }
    }
}
