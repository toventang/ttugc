package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.ev */
public final class C46914ev {

    /* renamed from: a */
    public static final boolean f109330a;

    /* renamed from: b */
    public static final C46914ev f109331b = new C46914ev();

    /* renamed from: c */
    private static final AbstractC89244h f109332c;

    private C46914ev() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ev$a */
    static final class C46915a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46915a f109333a = new C46915a();

        static {
            Covode.recordClassIndex(55516);
        }

        C46915a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "copy_optimisation_group", 0));
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(55515);
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) C46915a.f109333a);
        f109332c = a;
        if (((Number) a.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        f109330a = z;
    }
}
