package com.p2082ss.android.ugc.aweme.livewallpaper.p3419f;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.f.h */
public final class C58905h {

    /* renamed from: a */
    public static final C58905h f134087a = new C58905h();

    /* renamed from: b */
    private static final AbstractC89244h f134088b = C89250i.m154773a((AbstractC89171a) C58906a.f134089a);

    /* renamed from: a */
    public static Keva m108238a() {
        return (Keva) f134088b.getValue();
    }

    private C58905h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.f.h$a */
    static final class C58906a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C58906a f134089a = new C58906a();

        static {
            Covode.recordClassIndex(69222);
        }

        C58906a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("keva_repo_live_wallpaper", 1);
        }
    }

    /* renamed from: b */
    public static String[] m108242b() {
        return m108238a().getStringArray("keva_key_wallpaper_active_date", null);
    }

    /* renamed from: c */
    public static long m108243c() {
        return m108238a().getLong("keva_key_already_upload_date", 0);
    }

    /* renamed from: d */
    public static int m108244d() {
        return m108238a().getInt("keva_key_active_check_interval_hour", 2);
    }

    /* renamed from: e */
    public static boolean m108245e() {
        return m108238a().getBoolean("keva_key_enable_double_tap_pause_video", false);
    }

    /* renamed from: f */
    public static int m108246f() {
        return m108238a().getInt("keva_key_wallpaper_sound_slider_progress", 0);
    }

    /* renamed from: g */
    public static void m108247g() {
        m108238a().erase("keva_key_already_upload_date");
    }

    static {
        Covode.recordClassIndex(69221);
    }

    /* renamed from: a */
    public static void m108239a(int i) {
        m108238a().storeInt("keva_key_wallpaper_sound_slider_progress", i);
    }

    /* renamed from: a */
    public static void m108240a(boolean z) {
        m108238a().storeBoolean("keva_key_enable_double_tap_pause_video", z);
    }

    /* renamed from: a */
    public static void m108241a(String[] strArr) {
        m108238a().storeStringArray("keva_key_wallpaper_active_date", strArr);
    }
}
