package com.p2082ss.android.ugc.playerkit.exp;

import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.playerkit.exp.c */
public final class C84193c {
    static {
        Covode.recordClassIndex(98096);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.playerkit.exp.c$a */
    public static final class C84194a extends AbstractC89220m implements AbstractC89171a<C84190a<T>> {

        /* renamed from: a */
        final /* synthetic */ String f187924a;

        /* renamed from: b */
        final /* synthetic */ Object f187925b;

        static {
            Covode.recordClassIndex(98097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84194a(String str, Object obj) {
            super(0);
            this.f187924a = str;
            this.f187925b = obj;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return new C84190a(this.f187924a, this.f187925b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.playerkit.exp.c$b */
    public static final class C84195b extends AbstractC89220m implements AbstractC89171a<T> {

        /* renamed from: a */
        final /* synthetic */ String f187926a;

        /* renamed from: b */
        final /* synthetic */ Object f187927b;

        static {
            Covode.recordClassIndex(98098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84195b(String str, Object obj) {
            super(0);
            this.f187926a = str;
            this.f187927b = obj;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final T invoke() {
            return (T) new C84190a(this.f187926a, this.f187927b).mo128997a();
        }
    }

    /* renamed from: a */
    static final <T> AbstractC89244h<C84190a<T>> m144796a(String str, T t) {
        return C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C84194a(str, t));
    }

    /* renamed from: b */
    static final <T> AbstractC89244h<T> m144797b(String str, T t) {
        return C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C84195b(str, t));
    }
}
