package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.f */
public final class C31646f extends AbstractC31648g {

    /* renamed from: a */
    public static final C31646f f75697a = new C31646f();

    /* renamed from: b */
    private static final int f75698b = 1;

    /* renamed from: c */
    private static final int f75699c = 2;

    /* renamed from: d */
    private static final int f75700d = 3;

    /* renamed from: e */
    private static final AbstractC89244h f75701e = C89250i.m154773a((AbstractC89171a) C31647a.f75702a);

    /* renamed from: d */
    private static int m65953d() {
        return ((Number) f75701e.getValue()).intValue();
    }

    private C31646f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.f$a */
    static final class C31647a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C31647a f75702a = new C31647a();

        static {
            Covode.recordClassIndex(38378);
        }

        C31647a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25411a("gm_age_gate_education", ClientExpManager.gm_age_gate_education()));
        }
    }

    static {
        Covode.recordClassIndex(38377);
    }

    /* renamed from: a */
    public final boolean mo57650a() {
        if (mo57652c() && m65953d() == f75698b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo57651b() {
        if (!mo57652c()) {
            return false;
        }
        if (m65953d() == f75698b || m65953d() == f75699c) {
            return true;
        }
        return false;
    }
}
