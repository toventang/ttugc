package com.p2082ss.android.p2152i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.i.a */
public final class C29944a {

    /* renamed from: a */
    public static boolean f71429a;

    /* renamed from: b */
    public static final C29944a f71430b = new C29944a();

    /* renamed from: c */
    private static final AbstractC89244h f71431c = C89250i.m154773a((AbstractC89171a) C29945a.f71432a);

    /* renamed from: b */
    private static boolean m60345b() {
        return ((Boolean) f71431c.getValue()).booleanValue();
    }

    private C29944a() {
    }

    /* renamed from: com.ss.android.i.a$a */
    static final class C29945a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C29945a f71432a = new C29945a();

        static {
            Covode.recordClassIndex(36358);
        }

        C29945a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "btm_switch", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(36357);
    }

    /* renamed from: a */
    public static boolean m60344a() {
        if (f71429a) {
            return m60345b();
        }
        if (C16048b.m29633a().mo25412a(true, "btm_switch", 0) == 1) {
            return true;
        }
        return false;
    }
}
