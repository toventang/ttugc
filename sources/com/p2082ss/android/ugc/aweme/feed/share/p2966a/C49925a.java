package com.p2082ss.android.ugc.aweme.feed.share.p2966a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.share.p3752h.C68956a;
import com.p2082ss.android.ugc.aweme.share.p3752h.C68958c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.share.a.a */
public final class C49925a {
    static {
        Covode.recordClassIndex(59036);
    }

    /* renamed from: a */
    public static boolean m93732a(Aweme aweme) {
        return TextUtils.equals(C31575b.m65865g().getCurUserId(), aweme.getAuthorUid());
    }

    /* renamed from: b */
    public static boolean m93734b(Aweme aweme) {
        if (m93735c(aweme) || m93736d(aweme)) {
            return true;
        }
        if (aweme == null || !m93732a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m93735c(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null || !aweme.getStatus().isReviewed() || !aweme.getStatus().isSelfSee() || !C33842s.C33843a.f80132a.mo60064h().mo59941c().booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m93736d(Aweme aweme) {
        Integer c = C33842s.C33843a.f80132a.mo60074r().mo59941c();
        if (c != null && c.intValue() == 2) {
            User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
            if (aweme == null || currentUser == null || !TextUtils.equals(aweme.getRegion(), currentUser.getRegion()) || aweme.isReviewed() || m93732a(aweme)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m93731a(Context context, Aweme aweme) {
        String c;
        Integer c2 = C33842s.C33843a.f80132a.mo60074r().mo59941c();
        if (c2 != null && c2.intValue() == 1 && aweme != null && !aweme.isReviewed() && !m93732a(aweme)) {
            C33594aj<String> downloadForbiddenToast = SharePrefCache.inst().getDownloadForbiddenToast();
            if (downloadForbiddenToast == null) {
                c = null;
            } else {
                c = downloadForbiddenToast.mo59941c();
            }
            if (TextUtils.isEmpty(c)) {
                c = context.getString(R.string.bbc);
            }
            new C79459a(context).mo123052a(c).mo123053a();
            return false;
        } else if (C50545m.m94762a(aweme) || aweme == null || aweme.getDownloadStatus() == 0) {
            return true;
        } else {
            new C79459a(context).mo123052a(context.getString(R.string.bzu)).mo123053a();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m93733a(Aweme aweme, boolean z) {
        if (aweme != null && !m93735c(aweme) && !m93736d(aweme)) {
            boolean isReviewed = aweme.isReviewed();
            if (m93732a(aweme)) {
                if (!isReviewed && C16048b.m29633a().mo25412a(true, "close_client_watermark", 0) == C68956a.f154265a) {
                    return false;
                }
                return true;
            } else if (aweme.isImage()) {
                return true;
            } else {
                if (!z || (!isReviewed && !C68958c.m121642a())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
