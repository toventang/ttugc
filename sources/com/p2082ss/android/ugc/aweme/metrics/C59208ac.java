package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.ac */
public final class C59208ac {

    /* renamed from: a */
    public static String f134749a = "";

    static {
        Covode.recordClassIndex(69571);
    }

    /* renamed from: c */
    public static String m108768c(String str) {
        return C48027ac.C48028a.f111257a.mo80055a(m108760a(str, 0));
    }

    /* renamed from: d */
    private static Object m108769d(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return C48027ac.C48028a.f111257a.mo80055a(str);
        }
    }

    /* renamed from: e */
    public static String m108771e(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    /* renamed from: i */
    public static String m108775i(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAuthorUid();
        }
        return "";
    }

    /* renamed from: a */
    public static String m108758a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return "";
        }
        return aweme.getAuthor().getUid();
    }

    /* renamed from: b */
    public static String m108763b(Aweme aweme) {
        if (aweme == null || aweme.getRequestId() == null) {
            return "";
        }
        return aweme.getRequestId();
    }

    /* renamed from: f */
    public static String m108772f(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isImage()) {
            return "1";
        }
        return "0";
    }

    /* renamed from: g */
    public static String m108773g(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isImage()) {
            return UGCMonitor.TYPE_PHOTO;
        }
        if (aweme.isLive()) {
            return "live";
        }
        return "video";
    }

    /* renamed from: h */
    public static boolean m108774h(Aweme aweme) {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        if (aweme == null || !TextUtils.equals(aweme.getAuthorUid(), e.getCurUserId())) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static String m108777k(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme() || !TextUtils.isEmpty(aweme.getRepostFromUserId())) {
            return UGCMonitor.TYPE_REPOST;
        }
        return "item";
    }

    /* renamed from: m */
    public static String m108779m(Aweme aweme) {
        if (aweme == null || aweme.getRelationRecommendInfo() == null) {
            return "";
        }
        return String.valueOf(aweme.getRelationRecommendInfo().getRecommendType());
    }

    /* renamed from: n */
    public static String m108780n(Aweme aweme) {
        if (aweme == null || aweme.getRelationRecommendInfo() == null) {
            return "";
        }
        return String.valueOf(aweme.getRelationRecommendInfo().getRelationTextKey());
    }

    /* renamed from: b */
    public static JSONObject m108765b(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    Object obj = map.get(str);
                    if (!TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, obj);
                    } else if (obj instanceof String) {
                        jSONObject.put(str, m108769d((String) obj));
                    }
                } catch (JSONException e) {
                    C51423a.m95790a((Throwable) e);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static Long m108767c(Aweme aweme) {
        long j = 0;
        if (aweme == null) {
            return 0L;
        }
        if (aweme.getAwemeType() == 13 && (aweme = aweme.getForwardItem()) == null) {
            return 0L;
        }
        if (aweme.getMusic() != null) {
            j = aweme.getMusic().getId();
        }
        return Long.valueOf(j);
    }

    /* renamed from: d */
    public static String m108770d(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if ((aweme.getAwemeType() == 13 && (aweme = aweme.getForwardItem()) == null) || aweme.getMusic() == null) {
            return "";
        }
        return new StringBuilder().append(aweme.getMusic().getId()).toString();
    }

    /* renamed from: j */
    public static String m108776j(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getDistributeType() == 1) {
            return "short";
        }
        if (aweme.getDistributeType() == 2) {
            return "long_direct";
        }
        if (aweme.getDistributeType() == 3) {
            return "long_with_short";
        }
        return "";
    }

    /* renamed from: l */
    public static String m108778l(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme()) {
            return aweme.getAuthorUid();
        }
        if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
            return aweme.getRepostFromUserId();
        }
        return aweme.getAuthorUid();
    }

    /* renamed from: a */
    public static JSONObject m108761a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    String str2 = map.get(str);
                    if (TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, m108769d(str2));
                    } else {
                        jSONObject.put(str, str2);
                    }
                } catch (JSONException e) {
                    C51423a.m95790a((Throwable) e);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static boolean m108766b(String str) {
        if (TextUtils.equals("homepage_follow", str) || TextUtils.equals("homepage_friends", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m108762a(String str) {
        if ("homepage_hot".equals(str) || "homepage_follow".equals(str) || "rec_follow".equals(str) || "homepage_fresh".equals(str) || "general_search".equals(str) || "search_result".equals(str) || "search_sug".equals(str) || "homepage_channel".equals(str) || "others_homepage".equals(str) || "find_friends".equals(str) || "challenge".equalsIgnoreCase(str) || "hot_search_video_board".equals(str) || "homepage_country".equals(str) || "homepage_friends".equals(str) || "personal_homepage".equals(str) || "playlist".equals(str) || "homepage_fresh_feed".equalsIgnoreCase(str) || "like_list".equals(str) || "homepage_familiar".equals(str) || TextUtils.equals("discovery_category", str) || "compilation_detail".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m108759a(Aweme aweme, int i) {
        if (aweme == null) {
            return "";
        }
        return m108760a(aweme.getAid(), i);
    }

    /* renamed from: b */
    public static String m108764b(Aweme aweme, int i) {
        return RequestIdService.m70076a().mo60695b(aweme, i).optString("order");
    }

    /* renamed from: a */
    public static String m108760a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return RequestIdService.m70076a().mo60692a(str + i).f81071a;
    }
}
