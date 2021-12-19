package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bu */
final /* synthetic */ class RunnableC50152bu implements Runnable {

    /* renamed from: a */
    private final C50150bt f115754a;

    /* renamed from: b */
    private final String f115755b;

    /* renamed from: c */
    private final C33942b f115756c;

    /* renamed from: d */
    private final IVideoGiftService f115757d;

    static {
        Covode.recordClassIndex(59278);
    }

    RunnableC50152bu(C50150bt btVar, String str, C33942b bVar, IVideoGiftService iVideoGiftService) {
        this.f115754a = btVar;
        this.f115755b = str;
        this.f115756c = bVar;
        this.f115757d = iVideoGiftService;
    }

    public final void run() {
        C50150bt btVar = this.f115754a;
        String str = this.f115755b;
        C33942b bVar = this.f115756c;
        IVideoGiftService iVideoGiftService = this.f115757d;
        str.hashCode();
        int i = 1;
        switch (str.hashCode()) {
            case -1180796502:
                if (!str.equals("on_viewpager_page_selected") || !iVideoGiftService.mo108903a(btVar.f113953L)) {
                    return;
                }
                if (C50108be.m94062b(btVar.f113953L.getAid())) {
                    btVar.f115751e.setVisibility(0);
                    String aid = btVar.f113953L.getAid();
                    C89219l.m154721d(aid, "");
                    C50108be.f115668a.add(aid);
                    C33744d a = new C33744d().mo59983a("enter_from", btVar.f113954M).mo59983a("group_id", C59208ac.m108771e(btVar.f113953L)).mo59983a("author_id", C59208ac.m108758a(btVar.f113953L)).mo59983a("user_id", C31575b.m65865g().getCurUserId());
                    if (btVar.f113953L.getFollowStatus() != 1) {
                        i = 0;
                    }
                    C39162r.m79460a("show_gift_icon", a.mo59980a("is_follow", i).mo59980a("is_like", btVar.f113953L.isLike() ? 1 : 0).f79943a);
                    return;
                }
                C50108be.m94061a(btVar.f113953L.getAid());
                return;
            case -330388150:
                if (str.equals("action_video_on_play_progress_change")) {
                    C0692e eVar = (C0692e) bVar.mo60212a();
                    if (iVideoGiftService.mo108903a(btVar.f113953L) && btVar.f115751e.getVisibility() == 8 && eVar != null && eVar.f2750a.floatValue() > 80.0f) {
                        btVar.f115751e.setAlpha(0.0f);
                        btVar.f115751e.setVisibility(0);
                        btVar.f115751e.animate().alpha(1.0f).setDuration(600).start();
                        return;
                    }
                    return;
                }
                return;
            case -213371911:
                if (str.equals("video_open_comment_dialog") && btVar.f115750d != null) {
                    btVar.f115750d.callOnClick();
                    return;
                }
                return;
            case 281945252:
                if (!str.equals("show_festival_activity_icon")) {
                    return;
                }
                break;
            case 350216171:
                if (!str.equals("on_page_selected")) {
                    return;
                }
                break;
            default:
                return;
        }
        HashMap hashMap = new HashMap();
        if (str.equals("show_festival_activity_icon")) {
            hashMap.put("isInActivityState", Boolean.valueOf(C33918a.m69450a()));
        }
        btVar.mo81274a(hashMap);
    }
}
