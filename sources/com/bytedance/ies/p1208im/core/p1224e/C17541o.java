package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1399im.core.p1404a.C19498l;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.o */
public final class C17541o {

    /* renamed from: a */
    public static final C19498l f41974a;

    /* renamed from: b */
    static final AbstractC89244h f41975b = C89250i.m154773a((AbstractC89171a) C17542a.f41977a);

    /* renamed from: c */
    public static final C17541o f41976c = new C17541o();

    private C17541o() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.o$a */
    static final class C17542a extends AbstractC89220m implements AbstractC89171a<C19498l> {

        /* renamed from: a */
        public static final C17542a f41977a = new C17542a();

        static {
            Covode.recordClassIndex(20031);
        }

        C17542a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19498l invoke() {
            return m32508a();
        }

        /* renamed from: a */
        private static C19498l m32508a() {
            C19498l lVar;
            try {
                lVar = (C19498l) SettingsManager.m29616a().mo25396a("im_sdk_report_db_info", C19498l.class);
            } catch (Throwable unused) {
                lVar = C17541o.f41974a;
            }
            if (lVar == null) {
                return C17541o.f41974a;
            }
            return lVar;
        }
    }

    static {
        Covode.recordClassIndex(20030);
        C19498l lVar = new C19498l();
        lVar.enable = 1;
        f41974a = lVar;
    }
}
