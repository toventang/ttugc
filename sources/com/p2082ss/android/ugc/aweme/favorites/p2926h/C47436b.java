package com.p2082ss.android.ugc.aweme.favorites.p2926h;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.favorites.h.b */
public final class C47436b {
    static {
        Covode.recordClassIndex(56049);
    }

    /* renamed from: a */
    public static boolean m90458a(Aweme aweme, String str) {
        if (aweme == null || !TextUtils.equals(str, "collection_video") || !aweme.isCollected()) {
            return false;
        }
        if (!aweme.isCanPlay() || C58956a.m108315a(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m90456a(Activity activity, Challenge challenge, String str, String str2) {
        String str3;
        if (challenge != null) {
            String uuid = UUID.randomUUID().toString();
            SmartRoute withParam = SmartRouter.buildRoute(activity, "aweme://challenge/detail/").withParam("id", challenge.getCid());
            if (CommerceChallengeServiceImpl.m75741e().mo65392b(challenge)) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            withParam.withParam("is_commerce", str3).withParam("enter_from", str).withParam("process_id", uuid).open();
            C47434a.m90449a(challenge.getCid(), str, str2, uuid);
            C47434a.m90454b(challenge.getCid(), str, str2);
        }
    }

    /* renamed from: a */
    public static void m90457a(Context context, View view, Music music, String str, String str2, boolean z) {
        boolean z2;
        if (music != null) {
            if (music.getMusicStatus() == 0) {
                String offlineDesc = music.getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = context.getString(R.string.dau);
                }
                new C23144b(view).mo37635a(offlineDesc).mo37637b();
            } else if (!z) {
                C39162r.m79460a("enter_music_detail_failed", new C33744d().mo59983a("group_id", "").mo59983a("author_id", "").mo59983a("music_id", music.getMid()).mo59983a("enter_from", str).f79943a);
            } else {
                String uuid = UUID.randomUUID().toString();
                String mid = music.getMid();
                if (music.getMatchedPGCSoundInfo() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C47434a.m90450a(mid, str, str2, uuid, z2);
                SmartRouter.buildRoute(C17867d.m33078a(), "aweme://music/detail/").withParam("id", music.getMid()).withParam("extra_music_from", str).withParam("process_id", uuid).open();
            }
        }
    }
}
