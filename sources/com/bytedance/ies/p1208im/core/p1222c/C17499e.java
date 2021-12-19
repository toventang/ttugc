package com.bytedance.ies.p1208im.core.p1222c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.c.e */
public final class C17499e {

    /* renamed from: a */
    public static final boolean f41886a = true;

    /* renamed from: b */
    public static final AbstractC89244h f41887b = C89250i.m154773a((AbstractC89171a) C17500a.f41889a);

    /* renamed from: c */
    public static final C17499e f41888c = new C17499e();

    private C17499e() {
    }

    /* renamed from: com.bytedance.ies.im.core.c.e$a */
    static final class C17500a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17500a f41889a = new C17500a();

        static {
            Covode.recordClassIndex(19989);
        }

        C17500a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.m29616a().mo25400a("im_sdk_log_setting", true));
        }
    }

    static {
        Covode.recordClassIndex(19988);
    }
}
