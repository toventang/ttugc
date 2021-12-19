package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1399im.core.p1404a.C19493g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.s */
public final class C17549s {

    /* renamed from: a */
    public static final C19493g f41991a;

    /* renamed from: b */
    static final AbstractC89244h f41992b = C89250i.m154773a((AbstractC89171a) C17550a.f41994a);

    /* renamed from: c */
    public static final C17549s f41993c = new C17549s();

    private C17549s() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.s$a */
    static final class C17550a extends AbstractC89220m implements AbstractC89171a<C19493g> {

        /* renamed from: a */
        public static final C17550a f41994a = new C17550a();

        static {
            Covode.recordClassIndex(20039);
        }

        C17550a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19493g invoke() {
            return m32510a();
        }

        /* renamed from: a */
        private static C19493g m32510a() {
            C19493g gVar;
            try {
                gVar = (C19493g) SettingsManager.m29616a().mo25396a("im_sdk_trace_config", C19493g.class);
            } catch (Throwable unused) {
                gVar = C17549s.f41991a;
            }
            if (gVar == null) {
                return C17549s.f41991a;
            }
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(20038);
        C19493g gVar = new C19493g();
        gVar.enableNetworkTrace = true;
        gVar.logCmdUsage = true;
        f41991a = gVar;
    }
}
