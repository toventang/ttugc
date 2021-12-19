package com.bytedance.ies.p1208im.core.p1222c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.c.c */
public final class C17496c {

    /* renamed from: a */
    public static final long f41878a = 1000;

    /* renamed from: b */
    public static final C17496c f41879b = new C17496c();

    /* renamed from: c */
    private static final long f41880c = 7000;

    /* renamed from: d */
    private static final long f41881d = 15000;

    /* renamed from: e */
    private static final AbstractC89244h f41882e = C89250i.m154773a((AbstractC89171a) C17497a.f41883a);

    /* renamed from: a */
    public static final long m32481a() {
        return ((Number) f41882e.getValue()).longValue();
    }

    private C17496c() {
    }

    /* renamed from: com.bytedance.ies.im.core.c.c$a */
    static final class C17497a extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C17497a f41883a = new C17497a();

        static {
            Covode.recordClassIndex(19986);
        }

        C17497a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(C16048b.m29633a().mo25413a(true, "im_extend_report_interval", 1000L));
        }
    }

    static {
        Covode.recordClassIndex(19985);
    }
}
