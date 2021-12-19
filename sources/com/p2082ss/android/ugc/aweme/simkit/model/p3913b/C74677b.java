package com.p2082ss.android.ugc.aweme.simkit.model.p3913b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.simkit.model.b.b */
public class C74677b {
    @AbstractC27891c(mo46611a = "battery_percent_threshold")

    /* renamed from: a */
    public float f167844a = 0.2f;
    @AbstractC27891c(mo46611a = "video_time_percent_threshold")

    /* renamed from: b */
    public float f167845b = 0.7f;
    @AbstractC27891c(mo46611a = "quality_type_duration_threshold")

    /* renamed from: c */
    public Map<Integer, Long> f167846c = new HashMap();
    @AbstractC27891c(mo46611a = "resolution_duration_threshold")

    /* renamed from: d */
    public Map<Integer, Long> f167847d = new HashMap();
    @AbstractC27891c(mo46611a = "quality_type_min_duration_threshold")

    /* renamed from: e */
    public Map<Integer, Long> f167848e = new HashMap();
    @AbstractC27891c(mo46611a = "resolution_min_duration_threshold")

    /* renamed from: f */
    public Map<Integer, Long> f167849f = new HashMap();
    @AbstractC27891c(mo46611a = "dash_min_duration_threshold")

    /* renamed from: g */
    public long f167850g = 0;
    @AbstractC27891c(mo46611a = "horizontal_video_quality_type_duration_threshold")

    /* renamed from: h */
    public Map<Integer, Long> f167851h = new HashMap();
    @AbstractC27891c(mo46611a = "horizontal_video_resolution_duration_threshold")

    /* renamed from: i */
    public Map<Integer, Long> f167852i = new HashMap();
    @AbstractC27891c(mo46611a = "dash_sr")

    /* renamed from: j */
    public boolean f167853j = false;
    @AbstractC27891c(mo46611a = "splash_ad_sr")

    /* renamed from: k */
    public boolean f167854k = false;
    @AbstractC27891c(mo46611a = "ad_sr")

    /* renamed from: l */
    public boolean f167855l = false;
    @AbstractC27891c(mo46611a = "async_init_sr")

    /* renamed from: m */
    public int f167856m = 1;
    @AbstractC27891c(mo46611a = "close_sr_for_first_n_videos")

    /* renamed from: n */
    public int f167857n = 0;
    @AbstractC27891c(mo46611a = "close_sr_for_user_local_videos")

    /* renamed from: o */
    public boolean f167858o = false;
    @AbstractC27891c(mo46611a = "consider_bitrate")

    /* renamed from: p */
    public boolean f167859p = false;
    @AbstractC27891c(mo46611a = "decrease_quality_type_cnt")

    /* renamed from: q */
    public Map<Integer, Integer> f167860q = new HashMap();
    @AbstractC27891c(mo46611a = "decrease_resolution_cnt")

    /* renamed from: r */
    public Map<Integer, Integer> f167861r = new HashMap<Integer, Integer>() {
        /* class com.p2082ss.android.ugc.aweme.simkit.model.p3913b.C74677b.C746781 */

        static {
            Covode.recordClassIndex(87503);
        }

        {
            put(1080, 1);
        }
    };

    static {
        Covode.recordClassIndex(87502);
    }

    /* renamed from: a */
    public static boolean m131142a(C74677b bVar) {
        if (bVar == null || !bVar.f167854k) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m131141a(int i, String str) {
        int i2;
        if (i < 2 || i > 3) {
            i2 = 0;
        } else {
            i2 = 1080;
        }
        if (i >= 10 && i <= 18) {
            i2 = 720;
        }
        if (i >= 20 && i <= 28) {
            i2 = 540;
        }
        if (i >= 30 && i <= 38) {
            i2 = 480;
        }
        if (i >= 40 && i <= 48) {
            return 360;
        }
        if (i2 != 0 || TextUtils.isEmpty(str)) {
            return i2;
        }
        if (str.contains("1080")) {
            return 1080;
        }
        if (str.contains("720")) {
            return 720;
        }
        if (str.contains("540")) {
            return 540;
        }
        if (str.contains("480")) {
            return 480;
        }
        if (str.contains("360")) {
            return 360;
        }
        return 0;
    }
}
