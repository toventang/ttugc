package com.p2082ss.android.ugc.aweme.upvote.p4190d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.upvote.d.b */
public final class C79716b {

    /* renamed from: a */
    public static final boolean f178872a = true;

    /* renamed from: b */
    public static final AbstractC89244h f178873b = C89250i.m154773a((AbstractC89171a) C79717a.f178875a);

    /* renamed from: c */
    public static final C79716b f178874c = new C79716b();

    private C79716b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.d.b$a */
    static final class C79717a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C79717a f178875a = new C79717a();

        static {
            Covode.recordClassIndex(92938);
        }

        C79717a() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m138542a() {
            try {
                return SettingsManager.m29616a().mo25400a("tt_upvote_detail_panel_refresh_setting", true);
            } catch (Throwable unused) {
                return C79716b.f178872a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m138542a());
        }
    }

    static {
        Covode.recordClassIndex(92937);
    }
}
