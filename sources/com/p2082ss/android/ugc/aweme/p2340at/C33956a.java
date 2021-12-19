package com.p2082ss.android.ugc.aweme.p2340at;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.experiment.C46924fc;
import com.p2082ss.android.ugc.aweme.experiment.C46986gs;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.at.a */
public final class C33956a {

    /* renamed from: a */
    public static final Map<String, AtomicBoolean> f80310a = new HashMap(5);

    /* renamed from: b */
    public static int f80311b = -1;

    /* renamed from: c */
    public static boolean f80312c = false;

    /* renamed from: d */
    private static boolean f80313d = true;

    /* renamed from: e */
    private static Runnable f80314e = RunnableC33958c.f80321a;

    /* renamed from: f */
    private static Runnable f80315f = RunnableC33959d.f80322a;

    /* renamed from: g */
    private static final Runnable f80316g = RunnableC33960e.f80323a;

    /* renamed from: h */
    private static final Runnable f80317h = RunnableC33961f.f80324a;

    /* renamed from: i */
    private static final Runnable f80318i = RunnableC33962g.f80325a;

    /* renamed from: j */
    private static final Runnable f80319j = RunnableC33963h.f80326a;

    /* renamed from: f */
    private static boolean m69550f() {
        if (!f80313d) {
            return true;
        }
        f80313d = false;
        return false;
    }

    static {
        Covode.recordClassIndex(40882);
    }

    /* renamed from: b */
    public static void m69541b() {
        if (C46986gs.m90266b() && !m69548e("system_launch_1_minute")) {
            m69549f("system_launch_1_minute");
            C34727m.m70943a().removeCallbacks(f80316g);
            C80330da.C80331a.m139266a("system_launch_1_minute").mo123700b();
        }
    }

    /* renamed from: c */
    public static void m69543c() {
        if (C46986gs.m90267c() && !m69548e("system_launch_1_minute_feed")) {
            m69549f("system_launch_1_minute_feed");
            C34727m.m70943a().removeCallbacks(f80317h);
            C80330da.C80331a.m139266a("system_launch_1_minute_feed").mo123700b();
        }
    }

    /* renamed from: d */
    public static void m69545d() {
        if (C46986gs.m90268d() && !m69548e("system_launch_2_minute")) {
            m69549f("system_launch_2_minute");
            C34727m.m70943a().removeCallbacks(f80318i);
            C80330da.C80331a.m139266a("system_launch_2_minute").mo123700b();
        }
    }

    /* renamed from: e */
    public static void m69547e() {
        if (C46986gs.m90269e() && !m69548e("system_launch_2_minute_feed")) {
            m69549f("system_launch_2_minute_feed");
            C34727m.m70943a().removeCallbacks(f80319j);
            C80330da.C80331a.m139266a("system_launch_2_minute_feed").mo123700b();
        }
    }

    /* renamed from: a */
    public static void m69538a() {
        if (!m69548e("system_launch")) {
            C34727m.m70945a(f80315f, 5000);
        }
        if (!m69548e("system_launch_1_minute") && C46986gs.m90266b()) {
            C34727m.m70945a(f80316g, 60000);
        }
        if (!m69548e("system_launch_1_minute_feed") && C46986gs.m90267c()) {
            C34727m.m70945a(f80317h, 60000);
        }
        if (!m69548e("system_launch_2_minute") && C46986gs.m90268d()) {
            C34727m.m70945a(f80318i, 120000);
        }
        if (!m69548e("system_launch_2_minute_feed") && C46986gs.m90269e()) {
            C34727m.m70945a(f80319j, 120000);
        }
    }

    /* renamed from: f */
    private static void m69549f(String str) {
        AtomicBoolean atomicBoolean = f80310a.get(str);
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
    }

    /* renamed from: a */
    public static void m69540a(String str) {
        if (f80312c) {
            C34727m.m70943a().removeCallbacks(f80314e);
            m69544c(str);
        }
    }

    /* renamed from: b */
    public static void m69542b(String str) {
        if (!m69548e("system_launch")) {
            C34727m.m70943a().removeCallbacks(f80315f);
            m69546d(str);
            C46924fc.f109352a = false;
        }
    }

    /* renamed from: c */
    static void m69544c(String str) {
        f80312c = false;
        C80330da.C80331a.m139266a("video_play").mo123696a("is_pause", str);
        C80330da.C80331a.m139266a("video_play").mo123700b();
    }

    /* renamed from: d */
    static void m69546d(String str) {
        if (!m69548e("system_launch")) {
            m69549f("system_launch");
            C80330da.C80331a.m139266a("system_launch").mo123696a("is_pause", str);
            C80330da.C80331a.m139266a("system_launch").mo123700b();
        }
    }

    /* renamed from: e */
    private static boolean m69548e(String str) {
        AtomicBoolean atomicBoolean = f80310a.get(str);
        if (atomicBoolean == null) {
            return false;
        }
        return atomicBoolean.get();
    }

    /* renamed from: a */
    public static String m69537a(Aweme aweme) {
        if (aweme == null) {
            return "others";
        }
        if (aweme.isAd()) {
            return "ad";
        }
        if (aweme.isMixAweme()) {
            return "mix";
        }
        if (aweme.isLive()) {
            return "live";
        }
        if (aweme.getDistributeType() == 2) {
            return "long";
        }
        return "video";
    }

    /* renamed from: a */
    public static void m69539a(int i, Aweme aweme) {
        if (m69550f()) {
            f80311b = i;
            String a = m69537a(aweme);
            f80312c = true;
            C80330da.C80331a.m139266a("video_play").mo123696a("launch_vv", Integer.toString(i)).mo123696a("current_video", a).mo123696a("video_scene", C33968k.f80342a).mo123697a();
            C34727m.m70945a(f80314e, 5000);
        }
    }
}
