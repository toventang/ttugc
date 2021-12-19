package com.p2082ss.android.ugc.aweme.network.p3503a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadCommentV2Experiment;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadProfileV2Experiment;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.network.a.e */
public final class C61479e {

    /* renamed from: a */
    public static final C61479e f139563a = new C61479e();

    /* renamed from: b */
    private static final AbstractC89244h f139564b = C89250i.m154773a((AbstractC89171a) C61481b.f139567a);

    /* renamed from: c */
    private static final AbstractC89244h f139565c = C89250i.m154773a((AbstractC89171a) C61480a.f139566a);

    /* renamed from: a */
    public static final boolean m111325a() {
        return ((Boolean) f139564b.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static final boolean m111326b() {
        return ((Boolean) f139565c.getValue()).booleanValue();
    }

    private C61479e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a.e$b */
    static final class C61481b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C61481b f139567a = new C61481b();

        static {
            Covode.recordClassIndex(72138);
        }

        C61481b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "power_preload_init_enable", true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a.e$a */
    static final class C61480a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C61480a f139566a = new C61480a();

        static {
            Covode.recordClassIndex(72137);
        }

        C61480a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((SmartPreloadCommentV2Experiment.C59983a.m109505c() || SmartPreloadProfileV2Experiment.C59985a.m109508c()) && C61479e.m111325a()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(72136);
    }
}
