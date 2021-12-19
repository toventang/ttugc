package com.p2082ss.android.ugc.aweme.shortvideo.stitch;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.c */
public final class C73125c {

    /* renamed from: a */
    static SharedPreferences f164205a = C34822d.m71158a(C63247i.f143610a, "av_settings.xml", 0);

    /* renamed from: b */
    public static final C73125c f164206b = new C73125c();

    private C73125c() {
    }

    /* renamed from: a */
    public static boolean m129135a() {
        return f164205a.getBoolean("stitch_introduce_shown", false);
    }

    /* renamed from: b */
    public static boolean m129136b() {
        return f164205a.getBoolean("stich_microphone_guide", false);
    }

    static {
        Covode.recordClassIndex(85839);
    }

    /* renamed from: c */
    public static void m129137c() {
        f164205a.edit().putBoolean("stich_microphone_guide", true).apply();
    }
}
