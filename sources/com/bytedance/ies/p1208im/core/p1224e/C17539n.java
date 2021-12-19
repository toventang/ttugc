package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.n */
public final class C17539n {

    /* renamed from: a */
    static final AbstractC89244h f41971a = C89250i.m154773a((AbstractC89171a) C17540a.f41973a);

    /* renamed from: b */
    public static final C17539n f41972b = new C17539n();

    private C17539n() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.n$a */
    static final class C17540a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C17540a f41973a = new C17540a();

        static {
            Covode.recordClassIndex(20029);
        }

        C17540a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("im_sdk_recover_version", 0));
        }
    }

    static {
        Covode.recordClassIndex(20028);
    }
}
