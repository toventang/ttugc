package com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.a */
public final class C40091a {

    /* renamed from: a */
    public static final C40091a f94157a = new C40091a();

    /* renamed from: b */
    private static final boolean f94158b = true;

    /* renamed from: c */
    private static final AbstractC89244h f94159c = C89250i.m154773a((AbstractC89171a) C40092a.f94160a);

    /* renamed from: b */
    private static boolean m81078b() {
        return ((Boolean) f94159c.getValue()).booleanValue();
    }

    private C40091a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.a$a */
    static final class C40092a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C40092a f94160a = new C40092a();

        static {
            Covode.recordClassIndex(47868);
        }

        C40092a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "is_opt_restrict_mode", false));
        }
    }

    static {
        Covode.recordClassIndex(47867);
    }

    /* renamed from: a */
    public static boolean m81077a() {
        if (C46796cm.f109016a) {
            return m81078b();
        }
        return C16048b.m29633a().mo25421a(true, "is_opt_restrict_mode", false);
    }
}
