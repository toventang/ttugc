package com.p2082ss.android.ugc.aweme.ecommerce.p2819ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.PDPHeaderImageExperiment */
public final class PDPHeaderImageExperiment {
    public static final PDPHeaderImageExperiment INSTANCE = new PDPHeaderImageExperiment();
    private static final AbstractC89244h config$delegate = C89250i.m154773a((AbstractC89171a) C43316a.f101091a);
    public static final PDPImageConfig none = new PDPImageConfig();

    private final PDPImageConfig getConfig() {
        return (PDPImageConfig) config$delegate.getValue();
    }

    private PDPHeaderImageExperiment() {
    }

    public final boolean isProgressiveSwitch() {
        if (getConfig().f101092a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.PDPHeaderImageExperiment$a */
    static final class C43316a extends AbstractC89220m implements AbstractC89171a<PDPImageConfig> {

        /* renamed from: a */
        public static final C43316a f101091a = new C43316a();

        static {
            Covode.recordClassIndex(51529);
        }

        C43316a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PDPImageConfig invoke() {
            Object a = C16048b.m29633a().mo25416a(true, "ecom_pdp_header_img_setting", PDPImageConfig.class, PDPHeaderImageExperiment.none);
            if (a != null) {
                return a;
            }
            PDPHeaderImageExperiment pDPHeaderImageExperiment = PDPHeaderImageExperiment.INSTANCE;
            return PDPHeaderImageExperiment.none;
        }
    }

    static {
        Covode.recordClassIndex(51528);
    }
}
