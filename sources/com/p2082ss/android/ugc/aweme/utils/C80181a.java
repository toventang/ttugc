package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.p1115a.AbstractC16045a;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49527r;
import com.p2082ss.android.ugc.aweme.player.C62890a;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80680f;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80682h;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.aweme.video.simkit.SimKitCommonConfig;
import com.p2082ss.android.ugc.aweme.video.simpreloader.PreloaderExperiment;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.utils.a */
public final class C80181a {

    /* renamed from: a */
    public static AbstractC16045a f179632a = new AbstractC16045a() {
        /* class com.p2082ss.android.ugc.aweme.utils.C80181a.C801821 */

        static {
            Covode.recordClassIndex(93450);
        }

        @Override // com.bytedance.ies.abmock.p1115a.AbstractC16045a
        /* renamed from: a */
        public final void mo25404a() {
            C80181a.m138998a();
        }
    };

    static {
        Covode.recordClassIndex(93449);
    }

    /* renamed from: a */
    public static void m138998a() {
        boolean a = C16048b.m29633a().mo25421a(true, "ab_call_opt", false);
        if (a != C80286c.f179804a) {
            C80286c.f179804a = a;
            C62890a.f142627a = a;
        }
        if (a) {
            C1731i.m5640b(CallableC80233b.f179709a, C1731i.f5562a);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ Void m138999b() {
        System.currentTimeMillis();
        try {
            C49527r.f113905a = C16048b.m29633a().mo25412a(true, "share_guide", 0);
            C80682h.f180383b = Boolean.valueOf(C16048b.m29633a().mo25421a(true, "enable_ies_route", true));
            PreloaderExperiment.videoNetworkSpeedAlgorithmExperimentValue = C16048b.m29633a().mo25412a(true, "video_network_speed_algorithm", 0);
            C80695q.f180409a = C80680f.m139906a();
            SimKitCommonConfig.superResolutionStrategyExperimentValueInited = false;
            C80286c.m139191a();
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
