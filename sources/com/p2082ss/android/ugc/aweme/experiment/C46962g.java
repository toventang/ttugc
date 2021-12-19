package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.p1007g.C14853c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.g */
public final class C46962g {

    /* renamed from: a */
    public static final int f109443a = 0;

    /* renamed from: b */
    public static final int f109444b = -1;

    /* renamed from: c */
    public static final AbstractC89244h<Integer> f109445c = C89250i.m154773a((AbstractC89171a) C46963a.f109450a);

    /* renamed from: d */
    public static final C46962g f109446d = new C46962g();

    /* renamed from: e */
    private static final int f109447e = 180000;

    /* renamed from: f */
    private static final int f109448f = 240000;

    /* renamed from: g */
    private static final int f109449g = 300000;

    private C46962g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.g$a */
    static final class C46963a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46963a f109450a = new C46963a();

        static {
            Covode.recordClassIndex(55564);
        }

        C46963a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25411a("aot_delay_client_experiment", ClientExpManager.aot_delay_client_experiment()));
        }
    }

    /* renamed from: a */
    public static boolean m90246a() {
        if (C14853c.f36267d && f109445c.getValue().intValue() != f109443a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(55563);
    }
}
