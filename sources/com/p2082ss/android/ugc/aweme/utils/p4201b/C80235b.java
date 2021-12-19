package com.p2082ss.android.ugc.aweme.utils.p4201b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.utils.b.b */
public final class C80235b {

    /* renamed from: a */
    static final AbstractC89244h f179711a = C89250i.m154773a((AbstractC89171a) C80236a.f179713a);

    /* renamed from: b */
    public static final C80235b f179712b = new C80235b();

    private C80235b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.b.b$a */
    static final class C80236a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C80236a f179713a = new C80236a();

        static {
            Covode.recordClassIndex(93504);
        }

        C80236a() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m139072a() {
            try {
                return SettingsManager.m29616a().mo25400a("eventbus_logger", false);
            } catch (Throwable unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m139072a());
        }
    }

    static {
        Covode.recordClassIndex(93503);
    }
}
