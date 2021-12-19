package com.p2082ss.android.ugc.aweme.feed.assem.report;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34470e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.report.C67105b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.report.a */
public final class C48956a {

    /* renamed from: a */
    public static final C48956a f112859a = new C48956a();

    private C48956a() {
    }

    static {
        Covode.recordClassIndex(57745);
    }

    /* renamed from: a */
    public static void m92139a(Aweme aweme, View view) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(view, "");
        Activity a = C34470e.m70451a(view.getContext());
        if (aweme.isAd() && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(awemeRawAd, "");
            if (awemeRawAd.isReportEnable()) {
                C39223a.m79587a().mo68694b(a, C67105b.m118760a(aweme, "creative", "ad"));
                return;
            }
        }
        if (aweme.isLive()) {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            C89219l.m154716b(d, "");
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData != null) {
                long j = 0;
                try {
                    User user = newLiveRoomData.owner;
                    C89219l.m154716b(user, "");
                    String uid = user.getUid();
                    C89219l.m154716b(uid, "");
                    j = Long.parseLong(uid);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                long j2 = newLiveRoomData.f114485id;
                User user2 = newLiveRoomData.owner;
                C89219l.m154716b(user2, "");
                C11838d dVar = new C11838d(j2, j, j, user2.getSecUid(), "fast_report", "homepage_hot", "live_cell", "click", "fast_report", "");
                dVar.f28202a = "full_screen";
                d.mo12992a(view.getContext(), dVar);
                C39162r.m79460a("livesdk_live_user_report", new C33744d().mo59981a("anchor_id", j).mo59983a("request_page", "fast_report").mo59981a("room_id", newLiveRoomData.f114485id).mo59983a("action_type", "click").mo59983a("report_type", "report_user").mo59983a("admin_type", "viewer").mo59983a("request_id", aweme.getRequestId()).mo59983a("enter_method", "live_cell").mo59983a("enter_from_merge", "homepage_hot").f79943a);
                return;
            }
            return;
        }
        C39223a.m79587a().mo68690a(a, aweme);
    }
}
