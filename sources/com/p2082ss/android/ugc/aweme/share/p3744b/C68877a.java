package com.p2082ss.android.ugc.aweme.share.p3744b;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.VideoControl;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.p3763k.C69273a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.b.a */
public final class C68877a {

    /* renamed from: a */
    public static JSONObject f154054a;

    /* renamed from: b */
    public static final C68878a f154055b = new C68878a((byte) 0);

    /* renamed from: a */
    public static final void m121549a(String str, Bundle bundle) {
        C68878a.m121551a(str, null, bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.b.a$a */
    public static final class C68878a {
        static {
            Covode.recordClassIndex(81183);
        }

        private C68878a() {
        }

        public /* synthetic */ C68878a(byte b) {
            this();
        }

        /* renamed from: a */
        private static boolean m121552a(JSONObject jSONObject) {
            Iterator<String> keys = C68877a.f154054a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.has(next)) {
                    Object opt = jSONObject.opt(next);
                    Object opt2 = C68877a.f154054a.opt(next);
                    if (opt != null && (!C89219l.m154714a(opt, opt2))) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        private static Object m121550a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static void m121551a(String str, Aweme aweme, Bundle bundle) {
            JSONObject jSONObject;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            C89219l.m154721d(str, "");
            if (C69273a.m122469a()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ftc_child_mode", C80580in.m139687c() ? 1 : 0);
                jSONObject2.put("teen_mode_status", C39223a.m79601o().mo68703a() ? 1 : 0);
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                int i6 = 0;
                if (g.isLogin()) {
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, "");
                    User curUser = g2.getCurUser();
                    if (curUser == null || !curUser.isSecret()) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                    jSONObject2.put("current_user_secret", i5);
                }
                jSONObject2.put("region", C58071d.m104913g());
                if (aweme != null) {
                    jSONObject2.put("aweme_is_ads", aweme.isAd() ? 1 : 0);
                    AwemeStatus status = aweme.getStatus();
                    jSONObject2.put("aweme_private_status", status != null ? Integer.valueOf(status.getPrivateStatus()) : null);
                    AwemeStatus status2 = aweme.getStatus();
                    if (status2 == null || !status2.isInReviewing()) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    jSONObject2.put("aweme_in_reviewing", i);
                    AwemeStatus status3 = aweme.getStatus();
                    if (status3 == null || !status3.isReviewed()) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    jSONObject2.put("aweme_reviewed", i2);
                    AwemeStatus status4 = aweme.getStatus();
                    if (status4 == null || !status4.isSelfSee()) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    jSONObject2.put("aweme_self_see", i3);
                    AwemeStatus status5 = aweme.getStatus();
                    if (status5 == null || !status5.isProhibited()) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    jSONObject2.put("aweme_is_prohibited", i4);
                    AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
                    if (awemeRiskModel != null && awemeRiskModel.isWarn()) {
                        i6 = 1;
                    }
                    jSONObject2.put("aweme_warning", i6);
                    AwemeStatus status6 = aweme.getStatus();
                    jSONObject2.put("aweme_download_status", status6 != null ? Integer.valueOf(status6.getDownloadStatus()) : null);
                    jSONObject2.put("aweme_prevent_download", aweme.isPreventDownload() ? 1 : 0);
                    VideoControl videoControl = aweme.getVideoControl();
                    jSONObject2.put("aweme_prevent_download_type", videoControl != null ? Integer.valueOf(videoControl.preventDownloadType) : null);
                    Music music = aweme.getMusic();
                    if (music != null) {
                        jSONObject2.put("music_prevent_download", music.isPreventDownload() ? 1 : 0);
                        jSONObject2.put("music_mute_share", music.isMuteShare() ? 1 : 0);
                    }
                    User author = aweme.getAuthor();
                    if (author != null) {
                        IAccountUserService g3 = C31575b.m65865g();
                        C89219l.m154716b(g3, "");
                        User curUser2 = g3.getCurUser();
                        if (curUser2 == null || !TextUtils.equals(curUser2.getUid(), author.getUid())) {
                            curUser2 = author;
                        }
                        jSONObject2.put("author_secret", curUser2.isSecret() ? 1 : 0);
                        String uid = author.getUid();
                        IAccountUserService g4 = C31575b.m65865g();
                        C89219l.m154716b(g4, "");
                        User curUser3 = g4.getCurUser();
                        C89219l.m154716b(curUser3, "");
                        jSONObject2.put("author_is_current", TextUtils.equals(uid, curUser3.getUid()) ? 1 : 0);
                        jSONObject2.put("author_follow_status", curUser2.getFollowStatus());
                        jSONObject2.put("author_download_setting", curUser2.getDownloadSetting());
                    }
                    jSONObject = new JSONObject();
                    jSONObject.put("aweme_id", aweme.getAid());
                } else {
                    jSONObject = null;
                }
                if (bundle != null) {
                    for (String str2 : bundle.keySet()) {
                        Object a = m121550a(bundle, str2);
                        jSONObject2.put(str2, a != null ? a.toString() : null);
                    }
                }
                if (m121552a(jSONObject2)) {
                    C12290b.m22066a(str, jSONObject2, (JSONObject) null, jSONObject);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(81182);
        JSONObject jSONObject = new JSONObject();
        f154054a = jSONObject;
        jSONObject.put("ftc_child_mode", 0);
        f154054a.put("teen_mode_status", 0);
        f154054a.put("current_user_secret", 0);
        f154054a.put("publish_private_status", 0);
        f154054a.put("aweme_is_ads", 0);
        f154054a.put("aweme_private_status", 0);
        f154054a.put("aweme_in_reviewing", 0);
        f154054a.put("aweme_reviewed", 1);
        f154054a.put("aweme_self_see", 0);
        f154054a.put("aweme_is_prohibited", 0);
        f154054a.put("aweme_warning", 0);
        f154054a.put("aweme_download_status", 0);
        f154054a.put("aweme_prevent_download", 0);
        f154054a.put("aweme_prevent_download_type", 0);
        f154054a.put("music_prevent_download", 0);
        f154054a.put("music_mute_share", 0);
        f154054a.put("author_secret", 0);
        f154054a.put("author_download_setting", 0);
    }
}
