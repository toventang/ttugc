package com.p2082ss.android.ugc.aweme.favorites.p2926h;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.h.c */
public final class C47437c {
    static {
        Covode.recordClassIndex(56050);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.h.c$a */
    static final class C47438a extends AbstractC89220m implements AbstractC89172b<T, R> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f110166a;

        static {
            Covode.recordClassIndex(56051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47438a(AbstractC89172b bVar) {
            super(1);
            this.f110166a = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final R invoke(T t) {
            return (R) this.f110166a.invoke(t);
        }
    }

    /* renamed from: a */
    public static final <T, R> AbstractC89172b<T, R> m90459a(AbstractC89172b<? super T, ? extends R> bVar) {
        C89219l.m154721d(bVar, "");
        return new C47438a(bVar);
    }
}
