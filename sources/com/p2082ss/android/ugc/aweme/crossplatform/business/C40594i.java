package com.p2082ss.android.ugc.aweme.crossplatform.business;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.i */
public final class C40594i {

    /* renamed from: a */
    public static final C40595a f95003a = new C40595a((byte) 0);

    static {
        Covode.recordClassIndex(48433);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.i$a */
    public static final class C40595a {
        static {
            Covode.recordClassIndex(48434);
        }

        private C40595a() {
        }

        public /* synthetic */ C40595a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Class<? extends AbsShareBusiness> m81944a(int i) {
            if (i == 1 || i != 2) {
                return ShareBusiness.class;
            }
            return LandingShareBusiness.class;
        }
    }
}
