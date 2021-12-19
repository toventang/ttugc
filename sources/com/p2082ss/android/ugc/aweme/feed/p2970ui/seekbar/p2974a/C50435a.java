package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.a */
public final class C50435a {

    /* renamed from: a */
    static final int f116479a = 1;

    /* renamed from: b */
    public static final C50435a f116480b = new C50435a();

    /* renamed from: c */
    private static final AbstractC89244h f116481c = C89250i.m154773a((AbstractC89171a) C50436a.f116482a);

    private C50435a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.a$a */
    static final class C50436a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C50436a f116482a = new C50436a();

        static {
            Covode.recordClassIndex(59572);
        }

        C50436a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (SettingsManager.m29616a().mo25394a("allow_long_video_scrubbing", 0) == C50435a.f116479a) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(59571);
    }

    /* renamed from: a */
    public static boolean m94589a() {
        if (C46796cm.f109016a) {
            return ((Boolean) f116481c.getValue()).booleanValue();
        }
        if (SettingsManager.m29616a().mo25394a("allow_long_video_scrubbing", 0) == f116479a) {
            return true;
        }
        return false;
    }
}
