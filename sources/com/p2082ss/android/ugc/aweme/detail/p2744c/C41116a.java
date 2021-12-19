package com.p2082ss.android.ugc.aweme.detail.p2744c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.detail.c.a */
public final class C41116a {

    /* renamed from: a */
    public static final boolean f96110a = true;

    /* renamed from: b */
    public static final AbstractC89244h f96111b = C89250i.m154773a((AbstractC89171a) C41117a.f96113a);

    /* renamed from: c */
    public static final C41116a f96112c = new C41116a();

    private C41116a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.c.a$a */
    static final class C41117a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C41117a f96113a = new C41117a();

        static {
            Covode.recordClassIndex(48997);
        }

        C41117a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.m29616a().mo25400a("refresh_video_by_block_user", true));
        }
    }

    static {
        Covode.recordClassIndex(48996);
    }
}
