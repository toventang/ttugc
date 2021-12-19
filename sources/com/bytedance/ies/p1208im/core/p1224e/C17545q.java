package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1399im.core.p1404a.C19499m;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.q */
public final class C17545q {

    /* renamed from: a */
    public static final C19499m f41982a;

    /* renamed from: b */
    static final AbstractC89244h f41983b = C89250i.m154773a((AbstractC89171a) C17546a.f41985a);

    /* renamed from: c */
    public static final C17545q f41984c = new C17545q();

    private C17545q() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.q$a */
    static final class C17546a extends AbstractC89220m implements AbstractC89171a<C19499m> {

        /* renamed from: a */
        public static final C17546a f41985a = new C17546a();

        static {
            Covode.recordClassIndex(20035);
        }

        C17546a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19499m invoke() {
            return m32509a();
        }

        /* renamed from: a */
        private static C19499m m32509a() {
            C19499m mVar;
            try {
                mVar = (C19499m) SettingsManager.m29616a().mo25396a("im_sdk_report_task_info", C19499m.class);
            } catch (Throwable unused) {
                mVar = C17545q.f41982a;
            }
            if (mVar == null) {
                return C17545q.f41982a;
            }
            return mVar;
        }
    }

    static {
        Covode.recordClassIndex(20034);
        C19499m mVar = new C19499m();
        mVar.enable = 1;
        mVar.timeoutDurationMs = 30000;
        mVar.executeTooLongMs = 30000;
        mVar.callbackTooLongMs = 5000;
        f41982a = mVar;
    }
}
