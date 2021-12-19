package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.hk */
public final class C47015hk {

    /* renamed from: a */
    public static final AbstractC89244h f109542a = C89250i.m154773a((AbstractC89171a) C47016a.f109544a);

    /* renamed from: b */
    public static final C47015hk f109543b = new C47015hk();

    private C47015hk() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.hk$a */
    static final class C47016a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C47016a f109544a = new C47016a();

        static {
            Covode.recordClassIndex(55617);
        }

        C47016a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "wallpaper_set_need_sys_preview", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(55616);
    }
}
