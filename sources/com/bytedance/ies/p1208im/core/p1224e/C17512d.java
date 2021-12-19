package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.d */
public final class C17512d {

    /* renamed from: a */
    public static final AbstractC89244h f41917a = C89250i.m154773a((AbstractC89171a) C17513a.f41919a);

    /* renamed from: b */
    public static final C17512d f41918b = new C17512d();

    private C17512d() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.d$a */
    static final class C17513a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17513a f41919a = new C17513a();

        static {
            Covode.recordClassIndex(20002);
        }

        C17513a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.m29616a().mo25400a("mt_im_sdk_init_lock", true));
        }
    }

    static {
        Covode.recordClassIndex(20001);
    }
}
