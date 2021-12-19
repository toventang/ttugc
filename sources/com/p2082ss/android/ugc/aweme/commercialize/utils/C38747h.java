package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.C38027a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.h */
public final class C38747h {

    /* renamed from: a */
    public static final C38747h f91502a = new C38747h();

    private C38747h() {
    }

    static {
        Covode.recordClassIndex(46288);
    }

    /* renamed from: a */
    private static int m78586a(Aweme aweme) {
        if (!C37699a.m76290d(aweme)) {
            return -1;
        }
        CardStruct e = C37699a.m76292e(aweme);
        C89219l.m154716b(e, "");
        return e.getCardType();
    }

    /* renamed from: b */
    private static long m78590b(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Long creativeId;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
            return 0;
        }
        return creativeId.longValue();
    }

    /* renamed from: c */
    private static String m78592c(Aweme aweme) {
        CardStruct e;
        if (aweme == null || !aweme.isAd() || (e = C37699a.m76292e(aweme)) == null) {
            return null;
        }
        return e.getCardUrl();
    }

    /* renamed from: a */
    public static final void m78589a(String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                List<JSONObject> list = C38027a.f89857c;
                if (list.size() > 0) {
                    jSONObject.put("url", str);
                    jSONObject.put("error_details", list);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (jSONObject.length() > 0) {
                C12290b.m22060a("aweme_ad_card_load_details", 0, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public static final void m78587a(Aweme aweme, Boolean bool) {
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", m78586a(aweme));
                jSONObject.put("url", m78592c(aweme));
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    jSONObject.put("card_opt_version", "1");
                }
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", m78590b(aweme));
                }
                if (aweme.isLive()) {
                    jSONObject.put("sub_type", "feed_live");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            C12290b.m22060a("aweme_ad_card_show_error_rate", 0, jSONObject);
            C12290b.m22060a("aweme_ad_card_show_error_rate_v2", 0, jSONObject);
        }
    }

    /* renamed from: b */
    public static final void m78591b(Aweme aweme, String str, Boolean bool) {
        C89219l.m154721d(str, "");
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", m78586a(aweme));
                jSONObject.put("url", m78592c(aweme));
                jSONObject.put("error_msg", str);
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    jSONObject.put("card_opt_version", "1");
                }
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", m78590b(aweme));
                }
                if (aweme.isLive()) {
                    jSONObject.put("sub_type", "feed_live");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            C12290b.m22060a("aweme_ad_card_show_error_rate_v2", 2, jSONObject);
            C12290b.m22060a("aweme_ad_card_show_error", 2, jSONObject);
        }
    }

    /* renamed from: a */
    public static final void m78588a(Aweme aweme, String str, Boolean bool) {
        C89219l.m154721d(str, "");
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", m78586a(aweme));
                jSONObject.put("url", m78592c(aweme));
                jSONObject.put("error_msg", str);
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    jSONObject.put("card_opt_version", "1");
                }
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", m78590b(aweme));
                }
                if (aweme.isLive()) {
                    jSONObject.put("sub_type", "feed_live");
                }
                jSONObject.put("error_details", C38027a.f89857c);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C12290b.m22060a("aweme_ad_card_show_error_rate", 1, jSONObject);
            C12290b.m22060a("aweme_ad_card_show_error_rate_v2", 1, jSONObject);
            C12290b.m22060a("aweme_ad_card_show_error", 1, jSONObject);
        }
    }
}
