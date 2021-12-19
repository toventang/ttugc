package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.timegap.AdShowTimeGapManager;
import com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38159af;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38180e;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38223aj;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.splash.C38493d;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38580b;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38587g;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.business.p2708a.C40584a;
import com.p2082ss.android.ugc.aweme.experiment.C46820d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p3426m.C58975a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.j */
public final class C38189j {

    /* renamed from: a */
    private static final List<String> f90227a = Arrays.asList("pause", "resume", "skip", "click", "buffer_start", "buffer_end", "slide", "splash_click", "otherclick");

    /* renamed from: b */
    private static final List<String> f90228b = Collections.singletonList("draw_ad");

    /* renamed from: c */
    private static final List<String> f90229c = Arrays.asList("click", "otherclick", "music_click");

    /* renamed from: d */
    private static AbstractC38159af f90230d;

    /* renamed from: b */
    public static boolean m77514b(Context context, AwemeRawAd awemeRawAd) {
        return (context == null || awemeRawAd == null) ? false : true;
    }

    /* renamed from: a */
    private static JSONObject m77472a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C28022o j = C28024q.m56139a(jSONObject.getString("log_extra")).mo46789j();
            JSONObject jSONObject2 = new JSONObject();
            if (j.mo46803c("rit") != null) {
                jSONObject2.put("ctr_rit", j.mo46803c("rit").mo46689c());
            }
            return jSONObject2;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m77476a(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        String aT = C37699a.m76248aT(aweme);
        int i = 1;
        if (C37699a.m76199B(aweme)) {
            HashMap hashMap2 = new HashMap();
            if (!C38493d.f90924d) {
                i = 2;
            }
            hashMap2.put("awemelaunch", String.valueOf(i));
            ISplashAdService i2 = SplashAdServiceImpl.m33397i();
            if (i2 != null) {
                hashMap2.put("ad_sequence", Integer.valueOf(i2.mo28702a()));
            }
            hashMap.put("ad_extra_data", new C27910f().mo46674b(hashMap2));
            C18129a.C18130a a = C18129a.m33746a("draw_ad", "show", aweme.getAwemeRawAd()).mo28897a("awemelaunch", String.valueOf(i)).mo28898a(hashMap2);
            if (aweme.getAwemeRawAd().isReshowAd()) {
                a.mo28897a("is_reshow", 1);
            }
            if (!TextUtils.isEmpty(aT)) {
                try {
                    a.mo28900b("study_id", Integer.valueOf(Integer.parseInt(aT)));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            a.mo28902c();
        } else if (aweme.isAd()) {
            C18129a.C18130a a2 = C18129a.m33746a("draw_ad", "show", aweme.getAwemeRawAd()).mo28897a("anchor_id", m77501b(aweme)).mo28897a("room_id", m77461a(aweme));
            if (aweme.getAwemeRawAd().isReshowAd()) {
                a2.mo28897a("is_reshow", 1);
            }
            if (AdShowTimeGapManager.m77034a() && !aweme.getAwemeRawAd().isReshowAd()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = AdShowTimeGapManager.f89777d;
                long j2 = -1;
                if (j != -1) {
                    j2 = currentTimeMillis - j;
                }
                a2.mo28897a("showtime_gap", Long.valueOf(j2));
                a2.mo28897a("adgap", Integer.valueOf(AdShowTimeGapManager.m77031a(aweme.getAid())));
            }
            if (!TextUtils.isEmpty(aT)) {
                try {
                    a2.mo28900b("study_id", Integer.valueOf(Integer.parseInt(aT)));
                } catch (NumberFormatException e2) {
                    e2.printStackTrace();
                }
            }
            a2.mo28902c();
        }
        JSONObject a3 = m77468a(context, aweme, false, (Map<String, String>) hashMap);
        if (!TextUtils.isEmpty(aT)) {
            try {
                a3.put("study_id", Integer.parseInt(aT));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        m77510b(context, "show", aweme, a3);
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            C38164aj.m77369a("show", awemeRawAd.getTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38190k(aweme));
        }
        C38703bs.m78520a(aweme);
        C33830n.m69192a("ctr_monitor", "ctr_show", m77472a(m77468a(context, aweme, false, (Map<String, String>) null)));
    }

    /* renamed from: a */
    public static void m77485a(Context context, Aweme aweme, JSONObject jSONObject) {
        m77510b(context, "show_failed", aweme, m77503b(context, aweme, jSONObject));
    }

    /* renamed from: a */
    public static void m77477a(Context context, Aweme aweme, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("filter_reason", Integer.valueOf(i));
        hashMap.put("ad_extra_data", new C27910f().mo46674b(hashMap2));
        m77510b(context, "item_repeat", aweme, m77468a(context, aweme, false, (Map<String, String>) hashMap));
    }

    /* renamed from: a */
    public static void m77489a(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m77551z(context, aweme)) {
            m77493a(context, "landing_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    public static void m77479a(Context context, Aweme aweme, long j, int i) {
        m77480a(context, aweme, j, i, "break");
    }

    /* renamed from: a */
    public static void m77475a(Context context, C38661b bVar) {
        if (context != null && bVar != null) {
            String str = bVar.f91342b;
            Aweme aweme = bVar.f91341a;
            String str2 = bVar.f91343c;
            JSONObject a = m77467a(context, aweme, str, str2);
            HashMap hashMap = new HashMap();
            hashMap.put("fail_reason", bVar.f91344d);
            hashMap.put("card_type", bVar.f91345e);
            hashMap.put("status", bVar.f91346f);
            hashMap.put("is_preload", Boolean.valueOf(bVar.f91347g));
            hashMap.put("anchor_id", bVar.f91348h);
            hashMap.put("room_id", Long.valueOf(bVar.f91349i));
            m77499a(a, hashMap);
            m77510b(context, str, aweme, a);
            if (aweme != null && aweme.isAd()) {
                C18129a.m33746a("draw_ad", str, aweme.getAwemeRawAd()).mo28900b("refer", str2).mo28897a("fail_reason", bVar.f91344d).mo28897a("card_type", bVar.f91345e).mo28897a("status", bVar.f91346f).mo28897a("is_preload", Boolean.valueOf(bVar.f91347g)).mo28897a("anchor_id", bVar.f91348h).mo28897a("room_id", Long.valueOf(bVar.f91349i)).mo28902c();
            }
            if (TextUtils.equals(bVar.f91342b, "click") && TextUtils.equals(bVar.f91343c, "card")) {
                C40584a.m81930a("draw_ad", "card");
            }
        }
    }

    /* renamed from: a */
    private static void m77499a(JSONObject jSONObject, Map<String, Object> map) {
        if (jSONObject != null && map.size() != 0) {
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if ((!(value instanceof String) || !TextUtils.isEmpty((String) value)) && (!(value instanceof Long) || ((Long) value).longValue() != 0)) {
                        optJSONObject.put(entry.getKey(), value);
                    }
                }
                if (optJSONObject.length() > 0) {
                    jSONObject.put("ad_extra_data", optJSONObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m77483a(Context context, Aweme aweme, String str, Map<String, Object> map) {
        JSONObject a = m77468a(context, aweme, false, map == null ? null : m77464a(map));
        if (str != null) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m77510b(context, "click_source", aweme, a);
    }

    /* renamed from: a */
    public static void m77487a(Context context, AwemeRawAd awemeRawAd, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        hashMap.put("ad_extra_data", new C27910f().mo46674b(hashMap2));
        m77490a(context, "open_url_app", awemeRawAd, m77470a(context, awemeRawAd, false, (Map<String, String>) hashMap));
    }

    /* renamed from: a */
    public static void m77488a(Context context, AwemeRawAd awemeRawAd, String str, String str2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap2.put("fail_reason", str2);
        }
        hashMap.put("ad_extra_data", new C27910f().mo46674b(hashMap2));
        m77490a(context, "deeplink_failed", awemeRawAd, m77470a(context, awemeRawAd, false, (Map<String, String>) hashMap));
    }

    /* renamed from: b */
    public static void m77509b(Context context, AwemeRawAd awemeRawAd, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("fail_reason", "app_uninstalled");
        hashMap2.put("url", str);
        hashMap.put("ad_extra_data", new C27910f().mo46674b(hashMap2));
        m77490a(context, "deeplink_failed", awemeRawAd, m77470a(context, awemeRawAd, false, (Map<String, String>) hashMap));
    }

    /* renamed from: a */
    public static void m77484a(Context context, Aweme aweme, Map<String, String> map) {
        HashMap hashMap;
        if (map.size() != 0) {
            hashMap = new HashMap();
            hashMap.put("ad_extra_data", new C27910f().mo46674b(map));
        } else {
            hashMap = null;
        }
        m77519c(context, "othershow", aweme, m77468a(context, aweme, false, (Map<String, String>) hashMap));
    }

    /* renamed from: a */
    public static void m77481a(Context context, Aweme aweme, FollowStatus followStatus) {
        HashMap hashMap = new HashMap();
        if (C37699a.m76222Y(aweme)) {
            int i = 1;
            hashMap.put("is_cheated_follow", Integer.valueOf((followStatus == null || !followStatus.isCheating()) ? 0 : 1));
            if (followStatus != null) {
                i = followStatus.followStatus;
            }
            hashMap.put("follow_status", Integer.valueOf(i));
        }
        hashMap.put("anchor_id", m77501b(aweme));
        hashMap.put("room_id", m77461a(aweme));
        m77510b(context, "follow", aweme, m77468a(context, aweme, false, m77464a(hashMap)));
    }

    /* renamed from: a */
    public static void m77478a(Context context, Aweme aweme, long j) {
        aweme.isAd();
        if (C37699a.m76199B(aweme)) {
            if (m77513b() && m77551z(context, aweme)) {
                m77510b(context, "first_view", aweme, m77503b(context, aweme, m77465a(j)));
                C18129a.m33746a("draw_ad", "first_view", aweme.getAwemeRawAd()).mo28897a("launchduration", Long.valueOf(j)).mo28902c();
                C38580b.m78284a(j, 1, System.currentTimeMillis());
                aweme.getAwemeRawAd().getCreativeId();
            }
        } else if (m77513b()) {
            m77512b(context, "splash_ad", "first_view", m77465a(j), "-1", 0);
            C18129a.m33747a("splash_ad", "first_view", "-1", null, "0").mo28897a("launchduration", Long.valueOf(j)).mo28902c();
        }
    }

    /* renamed from: a */
    private static JSONObject m77465a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("launchduration", Long.valueOf(j));
            jSONObject.put("ad_extra_data", new C27910f().mo46674b(hashMap));
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m77468a(Context context, Aweme aweme, boolean z, Map<String, String> map) {
        if (!m77551z(context, aweme)) {
            return new JSONObject();
        }
        return m77470a(context, aweme.getAwemeRawAd(), z, map);
    }

    /* renamed from: a */
    private static JSONObject m77469a(Context context, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            m77471a(context, jSONObject, awemeRawAd.getLogExtra());
        } catch (JSONException e) {
            C51423a.m95786a((Exception) e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m77470a(Context context, AwemeRawAd awemeRawAd, boolean z, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (awemeRawAd == null) {
            return jSONObject;
        }
        try {
            m77471a(context, jSONObject, awemeRawAd.getLogExtra());
            if (z) {
                jSONObject.put("has_v3", "1");
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (JSONException e) {
            C51423a.m95786a((Exception) e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m77466a(Context context, C38214ac acVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            m77471a(context, jSONObject, acVar.logExtra);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("refer", str);
                jSONObject.put("item_id", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m77471a(Context context, JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("log_extra", str);
        }
        jSONObject.put("is_ad_event", "1");
        String b = m77500b(context);
        if (!C13627m.m24498a(b)) {
            jSONObject.put("nt", b);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m77510b(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m77551z(context, aweme)) {
            m77493a(context, "draw_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    public static void m77492a(Context context, String str, String str2, Aweme aweme, JSONObject jSONObject) {
        if (m77551z(context, aweme)) {
            m77493a(context, str, str2, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    public static void m77490a(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (m77514b(context, awemeRawAd)) {
            m77493a(context, "draw_ad", str, jSONObject, awemeRawAd);
        }
    }

    /* renamed from: b */
    public static void m77511b(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (m77514b(context, awemeRawAd)) {
            m77493a(context, "comment_end_ad", str, jSONObject, awemeRawAd);
        }
    }

    /* renamed from: a */
    public static void m77493a(Context context, String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        String str3 = str;
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            str3 = TextUtils.equals(str3, "background_ad") ? "background_ads" : "topic_ads";
        }
        if (TextUtils.equals("click", str2)) {
            C38703bs.m78523a(awemeRawAd);
        }
        if (C37699a.m76282b(awemeRawAd)) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                JSONObject jSONObject2 = TextUtils.isEmpty(optString) ? new JSONObject() : new JSONObject(optString);
                jSONObject2.put("anchor_id", awemeRawAd.getSplashInfo().anchorId);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        m77494a(context, str3, str2, jSONObject, m77502b(awemeRawAd), m77458a(awemeRawAd));
    }

    /* renamed from: a */
    public static void m77498a(String str, String str2, JSONObject jSONObject) {
        if ((TextUtils.equals(str, "draw_ad") && f90227a.contains(str2)) || (AbstractC37639a.f89001b.contains(str2) && AbstractC37639a.f89000a.contains(str))) {
            long c = C37438a.m75484d().mo65140c();
            int i = C37438a.m75484d().f88368f + 1;
            if (c < 0) {
                c = C37438a.m75484d().f88370h;
            }
            if (c >= 0) {
                try {
                    String optString = jSONObject.optString("ad_extra_data");
                    JSONObject jSONObject2 = TextUtils.isEmpty(optString) ? new JSONObject() : new JSONObject(optString);
                    jSONObject2.put("duration", c);
                    jSONObject2.put("play_order", i);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m77491a(Context context, String str, String str2) {
        if (C37438a.m75484d().f88371i != null && C37438a.m75484d().mo65124a() != null && f90228b.contains(str) && f90229c.contains(str2)) {
            C37438a.m75484d().mo65138b(C37438a.m75484d().f88371i, context, C37438a.m75484d().mo65124a());
        }
    }

    /* renamed from: a */
    public static void m77494a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        AbstractC38159af afVar = f90230d;
        if (afVar == null || !afVar.mo66463a(new AbstractC38159af.C38160a(context, str, str2, str3, j, jSONObject))) {
            m77512b(context, str, str2, jSONObject, str3, j);
        }
    }

    /* renamed from: b */
    private static void m77512b(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        m77498a(str, str2, jSONObject);
        String a = C16048b.m29633a().mo25417a(true, "enable_send_staging_adlog", "v3");
        if (TextUtils.equals(a, "v1") || TextUtils.equals(str2, "click")) {
            m77491a(context, str, str2);
        }
        if (!TextUtils.equals(str2, "click")) {
            if (!TextUtils.equals(a, "v3")) {
                if (TextUtils.equals(a, "all")) {
                    try {
                        jSONObject.put("_ad_staging_flag", "1");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        ITalentAdRevenueShareService e2 = TalentAdRevenueShareServiceImpl.m77931e();
        if (e2 != null) {
            e2.mo67028a(str3, jSONObject);
        }
        if (TextUtils.equals("click", str2)) {
            C38587g.m78300a(str3);
            m77497a(str, str3, j, jSONObject);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        C39162r.m79456a(str, str2, str3, j, jSONObject);
    }

    /* renamed from: a */
    public static void m77497a(String str, String str2, long j, JSONObject jSONObject) {
        long j2;
        try {
            j2 = Long.parseLong(str2);
        } catch (Exception e) {
            e.printStackTrace();
            j2 = 0;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals("has_v3", next)) {
                    try {
                        jSONObject2.put(next, jSONObject.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        C38180e.C38181a aVar = new C38180e.C38181a();
        aVar.f90202c = str;
        aVar.f90201b = "realtime_click";
        aVar.f90203d = j2;
        aVar.f90204e = j;
        aVar.f90200a = "event_v3";
        aVar.f90205f = jSONObject2;
        aVar.mo66481a().mo66480a();
        C33830n.m69192a("ctr_monitor", "ctr_click", m77472a(jSONObject));
    }

    /* renamed from: a */
    public static void m77474a(Context context, C38214ac acVar, Aweme aweme, boolean z) {
        m77496a("link_click", context, acVar, aweme, z, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m77496a(java.lang.String r13, android.content.Context r14, com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac r15, com.p2082ss.android.ugc.aweme.feed.model.Aweme r16, boolean r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77496a(java.lang.String, android.content.Context, com.ss.android.ugc.aweme.commercialize.model.ac, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m77473a(android.content.Context r12, com.p2082ss.android.ugc.aweme.commercialize.link.p2574a.C38036a r13) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.log.C38189j.m77473a(android.content.Context, com.ss.android.ugc.aweme.commercialize.link.a.a):void");
    }

    /* renamed from: a */
    public static void m77482a(Context context, Aweme aweme, String str) {
        JSONObject a = m77468a(context, aweme, true, (Map<String, String>) null);
        if (str != null) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", m77501b(aweme));
        hashMap.put("room_id", m77461a(aweme));
        try {
            a.put("ad_extra_data", new C27910f().mo46674b(hashMap));
        } catch (JSONException unused2) {
        }
        m77510b(context, "click", aweme, a);
        if (C37699a.m76314s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38204y(awemeRawAd));
        }
        C40584a.m81930a("draw_ad", str);
    }

    /* renamed from: a */
    public static void m77486a(Context context, AwemeRawAd awemeRawAd) {
        m77511b(context, "othershow", awemeRawAd, m77470a(context, awemeRawAd, false, (Map<String, String>) null));
    }

    /* renamed from: b */
    private static boolean m77513b() {
        if (C38493d.f90923c) {
            return false;
        }
        C38493d.f90923c = true;
        return true;
    }

    /* renamed from: a */
    public static JSONObject m77467a(Context context, Aweme aweme, String str, String str2) {
        JSONObject a = m77468a(context, aweme, false, (Map<String, String>) null);
        try {
            if (!TextUtils.isEmpty(str2)) {
                a.put("refer", str2);
            }
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: a */
    public static void m77495a(String str, Context context, C38214ac acVar, Aweme aweme, boolean z) {
        m77496a(str, context, acVar, aweme, z, true);
    }

    static {
        Covode.recordClassIndex(45668);
    }

    /* renamed from: a */
    public static Map<String, Object> m77462a() {
        long c = C37438a.m75484d().mo65140c();
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(c));
        hashMap.put("play_order", Integer.valueOf(C37438a.m75484d().f88368f + 1));
        return hashMap;
    }

    /* renamed from: a */
    public static long m77458a(AwemeRawAd awemeRawAd) {
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId.longValue();
    }

    /* renamed from: b */
    public static String m77502b(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return "0";
        }
        return String.valueOf(creativeId);
    }

    /* renamed from: b */
    private static String m77500b(Context context) {
        if (!TextUtils.isEmpty(C58029j.f132254f) && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132254f;
        }
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        C58029j.f132254f = networkAccessType;
        return networkAccessType;
    }

    /* renamed from: d */
    public static long m77520d(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return m77458a(awemeRawAd);
        }
        return 0;
    }

    /* renamed from: a */
    private static Context m77459a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: c */
    public static HashMap<String, String> m77515c(Aweme aweme) {
        if (aweme.getPromotion() == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("commodity_id", aweme.getPromotion().getPromotionId());
        hashMap2.put("commodity_type", Integer.valueOf(aweme.getPromotion().getPromotionSource()));
        hashMap.put("ad_extra_data", new C27910f().mo46674b(hashMap2));
        return hashMap;
    }

    /* renamed from: b */
    public static String m77501b(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().getAnchorId());
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().getUid());
        }
    }

    /* renamed from: a */
    public static String m77461a(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().f114485id);
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().roomId);
        }
    }

    /* renamed from: a */
    public static Map<String, String> m77463a(int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("play_order", Integer.valueOf(i));
        hashMap.put("ad_extra_data", new C27910f().mo46674b(hashMap2));
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m77464a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_extra_data", new C27910f().mo46674b(map));
        return hashMap;
    }

    /* renamed from: h */
    public static void m77533h(Context context, Aweme aweme) {
        m77518c(context, aweme, "");
    }

    /* renamed from: c */
    public static void m77516c(Context context, Aweme aweme) {
        m77510b(context, "open_url_app", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: e */
    public static void m77525e(Context context, Aweme aweme) {
        m77510b(context, "deeplink_failed", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: f */
    public static void m77529f(Context context, Aweme aweme) {
        m77510b(context, "open_url_h5", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: i */
    public static void m77534i(Context context, Aweme aweme) {
        m77510b(context, "like", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: j */
    public static void m77535j(Context context, Aweme aweme) {
        m77510b(context, "like_cancel", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: k */
    public static void m77536k(Context context, Aweme aweme) {
        m77510b(context, "open_url_window_show", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: m */
    public static void m77538m(Context context, Aweme aweme) {
        m77519c(context, "click_button", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: n */
    public static void m77539n(Context context, Aweme aweme) {
        m77510b(context, "live_show_failed", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: o */
    public static void m77540o(Context context, Aweme aweme) {
        m77510b(context, "challenge_click", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: q */
    public static void m77542q(Context context, Aweme aweme) {
        m77510b(context, "click_redpacket", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: r */
    public static void m77543r(Context context, Aweme aweme) {
        m77524d(context, "click_button", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: s */
    public static void m77544s(Context context, Aweme aweme) {
        m77524d(context, "click_call", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: t */
    public static void m77545t(Context context, Aweme aweme) {
        m77524d(context, "click_form", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: u */
    public static void m77546u(Context context, Aweme aweme) {
        m77524d(context, "load_fail", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: v */
    public static void m77547v(Context context, Aweme aweme) {
        m77524d(context, "click_redpacket", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: x */
    public static void m77549x(Context context, Aweme aweme) {
        m77527e(context, "click_cancel", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: y */
    public static void m77550y(Context context, Aweme aweme) {
        m77527e(context, "load_fail", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: z */
    public static boolean m77551z(Context context, Aweme aweme) {
        if (context == null || aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    /* renamed from: a */
    public static int m77457a(long j, int i) {
        if (i <= 0 || j <= 0) {
            return 0;
        }
        return Math.min((int) ((j * 100) / ((long) i)), 100);
    }

    /* renamed from: g */
    public static void m77532g(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("render_type", "lynx");
        m77510b(context, "open_url_h5", aweme, m77468a(context, aweme, false, m77464a(hashMap)));
    }

    /* renamed from: d */
    public static void m77521d(Context context, Aweme aweme) {
        if (m77551z(context, aweme)) {
            m77510b(context, "deeplink_success", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
            new C38223aj.C38224a().mo66651a("draw_ad").mo66649a(System.currentTimeMillis() - 5000).mo66650a(aweme.getAwemeRawAd()).mo66652a();
        }
    }

    /* renamed from: p */
    public static void m77541p(Context context, Aweme aweme) {
        JSONObject a = m77468a(context, aweme, false, (Map<String, String>) null);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", m77501b(aweme));
            hashMap.put("room_id", m77461a(aweme));
            a.put("ad_extra_data", new C27910f().mo46674b(hashMap));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m77510b(context, "share", aweme, a);
    }

    /* renamed from: w */
    public static void m77548w(Context context, Aweme aweme) {
        C38182f.C38184b a = C38182f.m77418a();
        a.f90211a = "homepage_ad";
        a.f90212b = "resume";
        a.mo66497b(aweme).mo66495a(context);
        if (aweme != null) {
            C18129a.m33746a("homepage_ad", "resume", aweme.getAwemeRawAd()).mo28902c();
        }
    }

    /* renamed from: a */
    private static Object m77460a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4355);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(4355);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: l */
    public static void m77537l(Context context, Aweme aweme) {
        m77519c(context, "replay", aweme, m77467a(context, aweme, "raw ad background replay", "button"));
        if (C37699a.m76314s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C38164aj.m77369a("play", awemeRawAd.getPlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38155ab(aweme));
            C18129a.m33746a("background_ad", "replay", aweme.getAwemeRawAd()).mo28900b("refer", "button").mo28902c();
        }
    }

    /* renamed from: b */
    public static void m77504b(Context context, Aweme aweme) {
        m77530f(context, "receive", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
    }

    /* renamed from: b */
    public static void m77505b(Context context, Aweme aweme, int i) {
        m77526e(context, aweme, i);
        C38587g.m78296a(aweme);
    }

    /* renamed from: d */
    public static void m77522d(Context context, Aweme aweme, int i) {
        m77510b(context, "unmute", aweme, m77531g(context, aweme, i));
    }

    /* renamed from: c */
    public static void m77517c(Context context, Aweme aweme, int i) {
        m77510b(context, "mute", aweme, m77528f(context, aweme, i));
    }

    /* renamed from: b */
    public static JSONObject m77503b(Context context, Aweme aweme, JSONObject jSONObject) {
        if (!m77551z(context, aweme)) {
            return jSONObject;
        }
        return m77469a(context, aweme.getAwemeRawAd(), jSONObject);
    }

    /* renamed from: f */
    private static JSONObject m77528f(Context context, Aweme aweme, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("playervol", Float.valueOf(0.0f));
        hashMap.put("play_order", Integer.valueOf(i));
        return m77468a(context, aweme, false, m77464a(hashMap));
    }

    /* renamed from: c */
    public static void m77518c(Context context, Aweme aweme, String str) {
        JSONObject a = m77468a(context, aweme, false, (Map<String, String>) null);
        if (!TextUtils.isEmpty(str)) {
            try {
                a.put("refer", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", m77501b(aweme));
        hashMap.put("room_id", m77461a(aweme));
        try {
            a.put("ad_extra_data", new C27910f().mo46674b(hashMap));
        } catch (JSONException unused) {
        }
        m77510b(context, "slide", aweme, a);
        if (aweme != null) {
            C18129a.m33746a("draw_ad", "slide", aweme.getAwemeRawAd()).mo28897a("refer", str).mo28897a("room_id", m77461a(aweme)).mo28897a("anchor_id", m77501b(aweme)).mo28902c();
        }
        if (C37699a.m76222Y(aweme)) {
            m77510b(context, "click", aweme, m77468a(context, aweme, false, (Map<String, String>) null));
        }
    }

    /* renamed from: d */
    public static void m77523d(Context context, Aweme aweme, String str) {
        JSONObject a = m77468a(context, aweme, true, (Map<String, String>) null);
        try {
            if (!TextUtils.isEmpty(str)) {
                a.put("refer", str);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", m77501b(aweme));
            hashMap.put("room_id", m77461a(aweme));
            a.put("ad_extra_data", new C27910f().mo46674b(hashMap));
        } catch (JSONException unused) {
        }
        m77524d(context, "click", aweme, a);
        if (C37699a.m76314s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38193n(awemeRawAd));
        }
    }

    /* renamed from: g */
    private static JSONObject m77531g(Context context, Aweme aweme, int i) {
        int i2;
        AudioManager audioManager = (AudioManager) m77460a(m77459a(context), DataType.AUDIO);
        HashMap hashMap = new HashMap();
        int i3 = -1;
        if (audioManager != null) {
            i2 = audioManager.getStreamVolume(3);
            i3 = audioManager.getStreamMaxVolume(3);
        } else {
            i2 = -1;
        }
        float f = 0.0f;
        if (i2 > 0 && i3 > 0) {
            f = ((float) i2) / ((float) i3);
        }
        hashMap.put("playervol", Float.valueOf(((float) ((int) (f * 1000.0f))) * 0.001f));
        hashMap.put("play_order", Integer.valueOf(i));
        return m77468a(context, aweme, false, m77464a(hashMap));
    }

    /* renamed from: e */
    private static void m77526e(Context context, Aweme aweme, int i) {
        float f = 0.0f;
        if (context != null) {
            if (((Boolean) C46820d.f109073b.getValue()).booleanValue()) {
                f = (float) C58975a.m108341a(3);
            } else {
                AudioManager audioManager = (AudioManager) m77460a(m77459a(context), DataType.AUDIO);
                if (audioManager != null) {
                    int streamVolume = audioManager.getStreamVolume(3);
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (streamVolume > 0 && streamMaxVolume > 0) {
                        f = ((float) streamVolume) / ((float) streamMaxVolume);
                    }
                }
                f = ((float) ((int) (f * 1000.0f))) * 0.001f;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("play_order", Integer.valueOf(i));
        hashMap.put("playervol", Float.valueOf(f));
        m77510b(context, "play", aweme, m77468a(context, aweme, false, m77464a(hashMap)));
        if (C37699a.m76314s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C38164aj.m77369a("play", awemeRawAd.getPlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38191l(aweme));
            C18129a.m33746a("draw_ad", "play", awemeRawAd).mo28897a("play_order", Integer.valueOf(i)).mo28897a("playervol", Float.valueOf(f)).mo28897a("anchor_id", m77501b(aweme)).mo28897a("room_id", m77461a(aweme)).mo28902c();
        }
    }

    /* renamed from: b */
    public static void m77507b(Context context, Aweme aweme, String str) {
        JSONObject a = m77468a(context, aweme, false, (Map<String, String>) null);
        if (!TextUtils.isEmpty(str)) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m77510b(context, "otherclick", aweme, a);
    }

    /* renamed from: b */
    public static void m77508b(Context context, Aweme aweme, Map<String, String> map) {
        JSONObject a = m77468a(context, aweme, true, map);
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", m77501b(aweme));
        hashMap.put("room_id", m77461a(aweme));
        try {
            a.put("ad_extra_data", new C27910f().mo46674b(hashMap));
        } catch (JSONException unused) {
        }
        m77519c(context, "click", aweme, a);
        if (C37699a.m76314s(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38156ac(awemeRawAd));
        }
        C40584a.m81930a("background_ad", map.get("refer"));
    }

    /* renamed from: e */
    private static void m77527e(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m77551z(context, aweme)) {
            m77493a(context, "feed_form", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: f */
    private static void m77530f(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m77551z(context, aweme)) {
            m77493a(context, "receive_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: c */
    public static void m77519c(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m77551z(context, aweme)) {
            m77493a(context, "background_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: d */
    public static void m77524d(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m77551z(context, aweme)) {
            m77493a(context, "homepage_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    private static void m77480a(Context context, Aweme aweme, long j, int i, String str) {
        m77506b(context, aweme, j, i, str);
    }

    /* renamed from: b */
    private static void m77506b(Context context, Aweme aweme, long j, int i, String str) {
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("play_order", Integer.valueOf(i));
            hashMap.put("anchor_id", m77501b(aweme));
            hashMap.put("room_id", m77461a(aweme));
            if (aweme.getAwemeRawAd().isReshowAd()) {
                hashMap.put("is_reshow", 1);
            }
            if (C38587g.m78302e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(C38587g.m78301d(aweme) ? 1 : 0));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", j);
                int i2 = 0;
                if (aweme.getVideo() != null) {
                    i2 = aweme.getVideo().getVideoLength();
                }
                jSONObject.put("video_length", i2);
                if (TextUtils.equals(str, "play_break")) {
                    jSONObject.put("user_id", C31575b.m65865g().getCurUserId());
                }
                int a = m77457a(j, i2);
                jSONObject.put("percent", a);
                String str2 = null;
                C18129a.C18130a b = C18129a.m33746a("draw_ad", str, aweme.getAwemeRawAd()).mo28900b("duration", Long.valueOf(j)).mo28900b("percent", Integer.valueOf(a)).mo28900b("break_reason", null).mo28900b("video_length", Integer.valueOf(i2));
                if (TextUtils.equals(str, "play_break")) {
                    str2 = C31575b.m65865g().getCurUserId();
                }
                b.mo28900b("user_id", str2).mo28898a(hashMap).mo28897a("anchor_id", m77501b(aweme)).mo28897a("room_id", m77461a(aweme)).mo28902c();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C38587g.m78297a(aweme, j);
            m77510b(context, str, aweme, jSONObject);
            C38703bs.m78527a("pause", aweme, "play_break");
        }
    }
}
