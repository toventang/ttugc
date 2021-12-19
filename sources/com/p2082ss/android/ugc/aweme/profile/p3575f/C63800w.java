package com.p2082ss.android.ugc.aweme.profile.p3575f;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.experiment.C46935fl;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.profile.model.LiveEventStruct;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f.w */
public final class C63800w {

    /* renamed from: a */
    public static final C63800w f144623a = new C63800w();

    private C63800w() {
    }

    static {
        Covode.recordClassIndex(75128);
    }

    /* renamed from: a */
    public static final void m115393a(Context context, LiveEventStruct liveEventStruct) {
        C89219l.m154721d(liveEventStruct, "");
        String a = C46935fl.m90229a();
        if (context != null && !TextUtils.isEmpty(a)) {
            C29844g gVar = new C29844g("sslocal://webcast_webview");
            gVar.mo52128a("hide_nav_bar", 1);
            gVar.mo52128a("hide_status_bar", 1);
            C29844g gVar2 = new C29844g(a);
            gVar2.mo52130a("event_id", liveEventStruct.getId());
            gVar2.mo52130a("live_event_enter_from", "live_event_card");
            gVar.mo52130a("url", gVar2.mo52126a());
            String a2 = gVar.mo52126a();
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            s.mo95830d().mo13004a(context, Uri.parse(a2));
        }
    }
}
