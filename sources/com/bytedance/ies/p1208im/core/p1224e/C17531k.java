package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.k */
public final class C17531k {

    /* renamed from: a */
    static final AbstractC89244h f41955a = C89250i.m154773a((AbstractC89171a) C17532a.f41957a);

    /* renamed from: b */
    public static final C17531k f41956b = new C17531k();

    private C17531k() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.k$a */
    static final class C17532a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17532a f41957a = new C17532a();

        static {
            Covode.recordClassIndex(20021);
        }

        C17532a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.m29616a().mo25400a("im_sdk_pull_recent_cmd_parallel", false));
        }
    }

    static {
        Covode.recordClassIndex(20020);
    }
}
