package com.bytedance.android.live.core.performance;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.performance.b */
public final class C4017b {

    /* renamed from: a */
    public static boolean f11013a;

    /* renamed from: b */
    private static String f11014b = "ttlive_feed_base_performance_monitor_all";

    /* renamed from: c */
    private static String f11015c = "ttlive_create_room_base_performance_monitor_all";

    /* renamed from: d */
    private static String f11016d = "ttlive_enter_room_base_performance_monitor_all";

    /* renamed from: e */
    private static String f11017e = "ttlive_pk_watch_room_base_performance_monitor_all";

    /* renamed from: f */
    private static ConcurrentHashMap<String, Long> f11018f = new ConcurrentHashMap<>(200);

    /* renamed from: g */
    private static ConcurrentHashMap<String, Long> f11019g = new ConcurrentHashMap<>(200);

    static {
        Covode.recordClassIndex(4551);
    }

    /* renamed from: com.bytedance.android.live.core.performance.b$a */
    public enum EnumC4018a {
        LiveFeedInit,
        LiveFeedPreview,
        LiveFeedScroll,
        StartLivePlay,
        ScrollWatchLivePlay,
        CreateStartLivePreview,
        CreateLive,
        ShowBInteractionFirstWidget,
        ShowVideoGift,
        ShowBarrage,
        ShowCInteractionFirstWidget,
        LivePk;

        static {
            Covode.recordClassIndex(4552);
        }
    }

    /* renamed from: c */
    public static void m9801c(EnumC4018a aVar) {
        if (f11013a) {
            m9795a(aVar, (HashMap<String, String>) null);
        }
    }

    /* renamed from: b */
    public static void m9800b(EnumC4018a aVar) {
        if (f11013a) {
            f11018f.put(aVar.name(), Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: a */
    public static void m9794a(EnumC4018a aVar) {
        if (aVar != null) {
            if (f11018f.containsKey(aVar.name())) {
                f11018f.remove(aVar.name());
            }
            if (f11019g.containsKey(aVar.name())) {
                f11019g.remove(aVar.name());
            }
        }
    }

    /* renamed from: a */
    private static String m9792a(String str) {
        String str2 = f11014b;
        if (TextUtils.equals(str, EnumC4018a.LiveFeedInit.name()) || TextUtils.equals(str, EnumC4018a.LiveFeedPreview.name()) || TextUtils.equals(str, EnumC4018a.LiveFeedScroll.name())) {
            return f11014b;
        }
        if (TextUtils.equals(str, EnumC4018a.CreateStartLivePreview.name()) || TextUtils.equals(str, EnumC4018a.CreateLive.name()) || TextUtils.equals(str, EnumC4018a.CreateStartLivePreview.name()) || TextUtils.equals(str, EnumC4018a.ShowBInteractionFirstWidget.name())) {
            return f11015c;
        }
        if (TextUtils.equals(str, EnumC4018a.StartLivePlay.name()) || TextUtils.equals(str, EnumC4018a.ScrollWatchLivePlay.name()) || TextUtils.equals(str, EnumC4018a.ShowCInteractionFirstWidget.name()) || TextUtils.equals(str, EnumC4018a.ShowBarrage.name()) || TextUtils.equals(str, EnumC4018a.ShowVideoGift.name())) {
            return f11016d;
        }
        if (TextUtils.equals(str, EnumC4018a.LivePk.name())) {
            return f11017e;
        }
        return str2;
    }

    /* renamed from: a */
    public static HashMap<String, String> m9793a(String str, String str2) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        return hashMap;
    }

    /* renamed from: a */
    public static void m9795a(EnumC4018a aVar, HashMap<String, String> hashMap) {
        if (f11013a && f11018f.containsKey(aVar.name())) {
            f11019g.put(aVar.name(), Long.valueOf(SystemClock.elapsedRealtime()));
            m9797a(aVar.name(), hashMap);
        }
    }

    /* renamed from: a */
    private static void m9797a(String str, HashMap<String, String> hashMap) {
        String str2;
        if (f11019g.containsKey(str) && f11018f.containsKey(str)) {
            long longValue = f11019g.get(str).longValue() - f11018f.get(str).longValue();
            if (hashMap != null) {
                str2 = C4139e.C4140a.f11575b.mo46674b(hashMap);
            } else {
                str2 = "";
            }
            C3854a.m9453a(3, "TimeCostUtil", str + "->" + longValue + ":" + str2);
            f11019g.remove(str);
            f11018f.remove(str);
            m9796a(str, longValue, str2);
        }
    }

    /* renamed from: a */
    public static void m9798a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            C3854a.m9460b("TimeCostUtil", "", e);
        }
    }

    /* renamed from: a */
    private static void m9796a(String str, long j, String str2) {
        JSONObject jSONObject = new JSONObject();
        m9799a(jSONObject, "biz", str);
        m9798a(jSONObject, "duration", j);
        if (!TextUtils.isEmpty(str2)) {
            m9799a(jSONObject, "extra", str2);
        }
        C3868c.m9497b(m9792a(str), 0, jSONObject);
    }

    /* renamed from: a */
    public static void m9799a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C3854a.m9460b("TimeCostUtil", "", e);
        }
    }
}
