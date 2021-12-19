package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.ax */
public final class C85376ax {

    /* renamed from: a */
    static String f191100a = "VERuntimeConfig";

    /* renamed from: b */
    static boolean f191101b;

    /* renamed from: c */
    public static boolean f191102c;

    /* renamed from: d */
    public static boolean f191103d;

    /* renamed from: e */
    public static boolean f191104e;

    /* renamed from: f */
    public static boolean f191105f;

    /* renamed from: g */
    public static int f191106g = EnumC85377a.HW_ENC_FALLBACK_NONE.getValue();

    /* renamed from: h */
    public static Map<String, Long> f191107h = new HashMap();

    /* renamed from: com.ss.android.vesdk.ax$a */
    public enum EnumC85377a {
        HW_ENC_FALLBACK_NONE(0),
        VIDEO_ENC_INIT_FALLBACK(1),
        AUDIO_ENC_INIT_FALLBACK(2),
        VIDEO_ENC_ENCODING_FALLBACK(3),
        AUDIO_ENC_ENCODING_FALLBACK(4);
        

        /* renamed from: a */
        private int f191109a;

        public final int getValue() {
            return this.f191109a;
        }

        static {
            Covode.recordClassIndex(99489);
        }

        private EnumC85377a(int i) {
            this.f191109a = i;
        }
    }

    static {
        Covode.recordClassIndex(99488);
    }

    /* renamed from: a */
    public static boolean m146866a() {
        if (f191101b || ((Boolean) C85568t.m147473a().mo131557a("vesdk_use_agfxcontext", (Object) false)).booleanValue()) {
            return true;
        }
        return false;
    }
}
