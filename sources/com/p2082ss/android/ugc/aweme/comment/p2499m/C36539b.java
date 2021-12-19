package com.p2082ss.android.ugc.aweme.comment.p2499m;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.discover.mob.C42456h;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.comment.m.b */
public final class C36539b {
    static {
        Covode.recordClassIndex(43842);
    }

    /* renamed from: a */
    public static void m74375a(LinkedHashMap<String, Integer> linkedHashMap) {
        if (!linkedHashMap.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
                sb.append(entry.getKey()).append(',');
                sb2.append(entry.getValue()).append(',');
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            C39162r.m79460a("send_emoji", new C33744d().mo59983a("enter_from", UGCMonitor.EVENT_COMMENT).mo59983a("cnt", sb2.toString()).f79943a);
        }
    }

    /* renamed from: a */
    public static void m74374a(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, String str8, int i3) {
        C33744d a = m74367a(str, str2, str3, str4, str5, i, i2, str6);
        a.mo59983a("enter_from", str7).mo59983a("reply_type", (!"message".equals(str7) || str3 == null || str8 == null || !str3.equals(str8)) ? "0" : "1").mo59980a("is_others_video", i3);
        C39162r.m79460a("reply_via_video", a.f79943a);
    }

    /* renamed from: a */
    public static void m74372a(String str, String str2, String str3, String str4) {
        C33743c a = new C33743c().mo59976a("return_method", str).mo59976a("group_id", str3).mo59976a("enter_from", str2).mo59976a("author_id", str4);
        C17867d.m33078a();
        C39162r.m79456a("emoji_to_keyboard", str2, str3, 0, a.mo59977a());
        C39162r.m79460a("emoji_to_keyboard", new C33744d().mo59983a("enter_from", str2).mo59983a("return_method", str).mo59983a("group_id", str3).mo59983a("author_id", str4).f79943a);
    }

    /* renamed from: a */
    public static String m74368a(Comment comment) {
        if (comment == null) {
            return "original";
        }
        String replyId = comment.getReplyId();
        boolean a = C13603b.m24435a((Collection) comment.getReplyComments());
        if (comment.getCommentType() == 0) {
            return "reply";
        }
        if (!TextUtils.isEmpty(replyId) && !TextUtils.equals(replyId, "0")) {
            return "reply_to_reply";
        }
        if (a) {
            return "reply";
        }
        return "original";
    }

    /* renamed from: a */
    public static C33744d m74366a(String str, String str2) {
        C33744d dVar = new C33744d();
        dVar.mo59983a("enter_from", str).mo59983a("group_id", str2);
        Aweme b = AwemeService.m70060b().mo60684b(str2);
        if (b != null) {
            dVar.mo59983a("author_id", b.getAuthorUid());
        }
        return dVar;
    }

    /* renamed from: b */
    public static void m74376b(String str, String str2, String str3, String str4) {
        C33744d a = m74366a(str, str2);
        a.mo59983a("enter_from", str);
        a.mo59983a("group_id", str2);
        a.mo59983a("author_id", str3);
        a.mo59983a("comment_id", str4);
        C39162r.m79460a("creator_like_comment_show", a.f79943a);
    }

    /* renamed from: a */
    public static void m74370a(String str, int i, String str2, String str3, String str4) {
        if (i == 2) {
            C39162r.m79460a("click_fast_emoji", new C33744d().mo59983a("enter_from", str2).mo59983a("group_id", str3).mo59983a("author_id", str4).mo59983a("emoji_code", str).f79943a);
        }
    }

    /* renamed from: a */
    private static C33744d m74367a(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        return new C33744d().mo59983a("enter_method", str).mo59983a("group_id", str2).mo59983a("comment_id", str3).mo59983a("comment_user_id", str4).mo59983a("author_id", C31575b.m65865g().getCurUserId()).mo59983a("parent_id", str5).mo59980a("parent_position", i).mo59980a("secondary_position", i2).mo59983a("comment_category", str6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r22v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m74369a(Aweme aweme, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6) {
        User user;
        String str7 = str2;
        if ("opus".equals(str7) || "collection".equals(str7)) {
            if (z) {
                str7 = "personal_homepage";
            } else {
                str7 = "others_homepage";
            }
        }
        C33743c a = new C33743c().mo59976a("reply_uid", str5).mo59976a("reply_comment_id", str4).mo59974a("is_photo", Integer.valueOf(z2 ? 1 : 0)).mo59974a("is_retry", (Integer) 0);
        C17867d.m33078a();
        C39162r.m79456a(str, str7, str3, 0, a.mo59977a());
        C33744d dVar = new C33744d();
        dVar.mo59983a("reply_uid", str5);
        dVar.mo59983a("reply_comment_id", str4);
        dVar.mo59980a("is_photo", (int) z2);
        dVar.mo59980a("is_retry", 0);
        dVar.mo59983a("enter_from", str7);
        dVar.mo59983a("group_id", str3);
        if (!TextUtils.isEmpty(str6)) {
            dVar.mo59983a("news_id", str6);
        }
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        C80409eu.m139390a(dVar, user);
        C39162r.m79460a(str, dVar.f79943a);
    }

    /* renamed from: a */
    public static void m74373a(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, String str8) {
        C33744d a = m74367a(str, str2, str3, str4, str5, i, i2, str6);
        a.mo59983a("enter_from", str7).mo59983a("comment_group_id", str8);
        C39162r.m79460a("video_comment_show", a.f79943a);
    }

    /* renamed from: a */
    public static void m74371a(String str, String str2, Aweme aweme, String str3, boolean z, String str4, String str5, boolean z2, String str6, int i, String str7, String str8, int i2, String str9, String str10, String str11) {
        User user;
        String str12;
        String str13;
        C33744d a = new C33744d().mo59985a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.m95759b().mo86844a(str, aweme)).mo59985a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.m95759b().mo86843a(aweme, str4)).mo59980a("is_success", z ? 1 : 0);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo59983a("country_name", aweme.getAuthor().getRegion());
        }
        String str14 = "";
        if (TextUtils.equals(str, "general_search")) {
            if (C42456h.f98974a) {
                if (aweme == null || aweme.getVideo() == null || aweme.getVideo().getVideoTag() == null) {
                    a.mo59983a("video_tag", str14);
                } else {
                    a.mo59983a("video_tag", aweme.getVideo().getVideoTag().getTitle());
                }
            }
            if (C41223i.f96336a) {
                str13 = "1";
            } else {
                str13 = "0";
            }
            a.mo59983a("is_fullscreen", str13);
            a.mo59983a("rank", C59208ac.m108764b(aweme, 9));
        }
        if (z) {
            a.mo59983a("comment_id", str3);
        }
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        C80409eu.m139390a(a, user);
        a.mo59983a("user_level", str10);
        a.mo59983a("comment_author_level", str11);
        if (aweme != null) {
            C79900c.m138665a(a, aweme, str);
        }
        if (z2 && !TextUtils.equals(str, "homepage_fresh_topic")) {
            a.mo59983a("enter_from", "trending_page");
            a.mo59983a("is_fullscreen", "0");
        }
        if (aweme != null) {
            C33744d a2 = a.mo59983a("enter_method", str2).mo59980a("follow_status", C76598h.m134176a(aweme.getAuthor())).mo59980a("follow_status_to_user", i);
            if (C76706a.m134278d(aweme)) {
                str12 = "story";
            } else {
                str12 = UGCMonitor.TYPE_POST;
            }
            a2.mo59983a("story_type", str12).mo59983a("story_collection_id", C76706a.m134276b(aweme));
        }
        if (TextUtils.equals("1", str6)) {
            if (!TextUtils.isEmpty(str) && (TextUtils.equals(str, "click_comment_chain") || TextUtils.equals(str, "click_comment_bubble") || TextUtils.equals(str, "push"))) {
                a.mo59983a("comment_enter_method", str);
                a.mo59983a("last_group_id", str7);
            } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str, "notification_page")) {
                a.mo59983a("comment_enter_method", "notification");
                a.mo59983a("last_group_id", str7);
            } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str, UGCMonitor.EVENT_COMMENT)) {
                a.mo59983a("comment_enter_method", "comment_panel");
                a.mo59983a("last_group_id", str7);
            }
            if (!TextUtils.isEmpty(str8)) {
                a.mo59983a("is_video", str8);
                if (TextUtils.equals(str8, "1")) {
                    a.mo59980a("is_others_video", i2);
                }
            }
        }
        String str15 = "like_comment";
        if (C59208ac.m108762a(str)) {
            a.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(aweme)));
            if (!TextUtils.isEmpty(str5)) {
                str14 = str5;
            }
            a.mo59983a("comment_user_id", str14);
            if (!TextUtils.isEmpty(str8)) {
                a.mo59983a("is_video", str8);
                if (TextUtils.equals(str8, "1")) {
                    a.mo59980a("is_others_video", i2);
                }
            }
            if (!TextUtils.equals("1", str6)) {
                str15 = "cancel_like_comment";
            }
            C39162r.m79461a(str15, C59208ac.m108761a(a.f79943a));
            return;
        }
        if (!TextUtils.isEmpty(str8)) {
            a.mo59983a("is_video", str8);
            if (TextUtils.equals(str8, "1")) {
                a.mo59980a("is_others_video", i2);
            }
        }
        if (!TextUtils.isEmpty(str9)) {
            a.mo59983a("news_id", str9);
        }
        if (!TextUtils.equals("1", str6)) {
            str15 = "cancel_like_comment";
        }
        C39162r.m79460a(str15, a.f79943a);
    }
}
