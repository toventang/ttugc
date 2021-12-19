package com.p2082ss.android.ugc.aweme.player;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.player.p3549ab.C62907a;

/* renamed from: com.ss.android.ugc.aweme.player.e */
public final class C62956e {

    /* renamed from: a */
    public static final boolean f142892a = false;

    /* renamed from: b */
    public static final boolean f142893b = false;

    /* renamed from: c */
    public static C62907a f142894c;

    /* renamed from: d */
    public static Boolean f142895d;

    /* renamed from: e */
    public static String f142896e = null;

    /* renamed from: f */
    public static int f142897f = -1;

    /* renamed from: g */
    public static int f142898g = -1;

    /* renamed from: h */
    private static Boolean f142899h;

    /* renamed from: i */
    private static Boolean f142900i;

    /* renamed from: a */
    public static int m113374a() {
        int i = f142897f + 1;
        f142897f = i;
        return i;
    }

    /* renamed from: e */
    public static boolean m113381e() {
        if (C16048b.m29633a().mo25412a(true, "player_v3_up_mtk_enable", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m113382f() {
        if (C16048b.m29633a().mo25412a(false, "player_reuse_engine", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static String m113383g() {
        try {
            if (f142896e == null) {
                f142896e = Build.HARDWARE;
            }
        } catch (Throwable unused) {
            f142896e = null;
        }
        return f142896e;
    }

    static {
        Covode.recordClassIndex(73793);
    }

    /* renamed from: d */
    public static boolean m113380d() {
        if (m113383g() == null || !m113383g().toLowerCase().startsWith("mt")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m113378b() {
        if (f142899h == null) {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "player_preferch_tts_audio", 0) != 1) {
                z = false;
            }
            f142899h = Boolean.valueOf(z);
        }
        return f142899h.booleanValue();
    }

    /* renamed from: c */
    public static boolean m113379c() {
        if (f142900i == null) {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "player_prefetch_cla_caption", 0) != 1) {
                z = false;
            }
            f142900i = Boolean.valueOf(z);
        }
        return f142900i.booleanValue();
    }

    /* renamed from: a */
    public static String m113375a(Video video) {
        VideoUrlModel playAddr;
        if (video == null || (playAddr = video.getPlayAddr()) == null) {
            return "null";
        }
        if (playAddr.getSourceId() == null) {
            return "nullid";
        }
        return playAddr.getSourceId();
    }

    /* renamed from: a */
    public static String m113376a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "play";
        }
        StringBuilder append = new StringBuilder().append(str).append("_");
        int i = f142898g + 1;
        f142898g = i;
        return append.append(i).toString();
    }

    /* renamed from: a */
    public static String m113377a(String str, int i) {
        if (!TextUtils.isEmpty(str) && str.length() > i) {
            return str.substring(0, i - 1);
        }
        return str;
    }
}
