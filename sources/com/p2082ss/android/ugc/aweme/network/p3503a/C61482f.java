package com.p2082ss.android.ugc.aweme.network.p3503a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.network.a.f */
public final class C61482f {

    /* renamed from: a */
    public static final C61482f f139568a = new C61482f();

    /* renamed from: b */
    private static final AbstractC89244h f139569b = C89250i.m154773a((AbstractC89171a) C61483a.f139570a);

    /* renamed from: a */
    public static final boolean m111327a() {
        return ((Boolean) f139569b.getValue()).booleanValue();
    }

    private C61482f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a.f$a */
    static final class C61483a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C61483a f139570a = new C61483a();

        static {
            Covode.recordClassIndex(72140);
        }

        C61483a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "power_preload_trigger_enable", false));
        }
    }

    static {
        Covode.recordClassIndex(72139);
    }
}
