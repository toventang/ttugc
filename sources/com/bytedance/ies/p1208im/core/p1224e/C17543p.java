package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.p */
public final class C17543p {

    /* renamed from: a */
    public static final boolean f41978a = true;

    /* renamed from: b */
    static final AbstractC89244h f41979b = C89250i.m154773a((AbstractC89171a) C17544a.f41981a);

    /* renamed from: c */
    public static final C17543p f41980c = new C17543p();

    private C17543p() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.p$a */
    static final class C17544a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17544a f41981a = new C17544a();

        static {
            Covode.recordClassIndex(20033);
        }

        C17544a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.m29616a().mo25400a("im_sdk_report_db_metrics_by_tea", true));
        }
    }

    static {
        Covode.recordClassIndex(20032);
    }
}
