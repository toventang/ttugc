package com.p2082ss.android.ugc.playerkit.exp;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.model.NativeBitrateSelectConfig;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.playerkit.exp.b */
public final class C84191b {

    /* renamed from: A */
    private static final AbstractC89244h f187874A = C84193c.m144797b("cold_boot_video_url_select_enable", false);

    /* renamed from: B */
    private static final AbstractC89244h f187875B = C84193c.m144797b("cold_boot_video_force_h264", false);

    /* renamed from: C */
    private static final AbstractC89244h f187876C = C84193c.m144797b("cold_boot_video_precreate_decoder", false);

    /* renamed from: D */
    private static final AbstractC89244h f187877D = C84193c.m144797b("cold_boot_video_specific_preload_size", 0);

    /* renamed from: E */
    private static final AbstractC89244h f187878E = C84193c.m144797b("cold_boot_preload_add_media_delay", false);

    /* renamed from: F */
    private static final AbstractC89244h f187879F = C84193c.m144797b("cold_boot_video_playtime_lost_fix", false);

    /* renamed from: G */
    private static final AbstractC89244h f187880G = C84193c.m144797b("cold_boot_play_session_create_after_launch", -1);

    /* renamed from: H */
    private static final AbstractC89244h f187881H = C84193c.m144797b("origin_splash_ad_prerender_after_launch", -1);

    /* renamed from: I */
    private static final AbstractC89244h f187882I = C84193c.m144797b("player_setting_update_audio_addr_when_player_reset", false);

    /* renamed from: J */
    private static final AbstractC89244h f187883J = C84193c.m144797b("engine_reuse_restrict_decode_type", false);

    /* renamed from: K */
    private static final AbstractC89244h f187884K = C84193c.m144797b("engine_reuse_opt_codec_adjust_v2", 0);

    /* renamed from: L */
    private static final AbstractC89244h f187885L = C84193c.m144797b("engine_reuse_device_self_adaptive", false);

    /* renamed from: M */
    private static final AbstractC89244h f187886M = C84193c.m144796a("engine_reuse_opt_codec_adjust", false);

    /* renamed from: N */
    private static final AbstractC89244h f187887N = C84193c.m144797b("cold_boot_video_disable_texture_render", false);

    /* renamed from: O */
    private static final AbstractC89244h f187888O = C84193c.m144797b("player_setting_progress_clear_old_msg_before_new_msg", false);

    /* renamed from: P */
    private static final AbstractC89244h f187889P = C84193c.m144797b("player_setting_save_last_player_config", false);

    /* renamed from: Q */
    private static final AbstractC89244h f187890Q = C84193c.m144797b("player_setting_disable_engine_info_log_config", false);

    /* renamed from: R */
    private static final AbstractC89244h f187891R = C84193c.m144797b("player_setting_enable_odd_opt", false);

    /* renamed from: S */
    private static final AbstractC89244h f187892S = C84193c.m144797b("player_setting_min_progress_interval", -1);

    /* renamed from: T */
    private static final AbstractC89244h f187893T = C84193c.m144797b("call_start_after_surface_when_start_without_surface", false);

    /* renamed from: U */
    private static final AbstractC89244h f187894U = C84193c.m144797b("player_set_native_thread_pool_stack_size", 0);

    /* renamed from: V */
    private static final AbstractC89244h f187895V = C84193c.m144797b("enable_use_new_get_cache_method", false);

    /* renamed from: W */
    private static final AbstractC89244h f187896W = C84193c.m144797b("enable_handler_use_asynchronous_msg", false);

    /* renamed from: a */
    public static final AbstractC89244h f187897a = C84193c.m144796a("player_setting_only_select_bitrate_once", false);

    /* renamed from: b */
    public static final AbstractC89244h f187898b = C84193c.m144797b("player_set_surface_by_msg", false);

    /* renamed from: c */
    public static final AbstractC89244h f187899c = C84193c.m144796a("player_sleep_callback_retain", false);

    /* renamed from: d */
    public static final AbstractC89244h f187900d = C84193c.m144797b("player_sleep_release_background_session", false);

    /* renamed from: e */
    public static final AbstractC89244h f187901e = C84193c.m144797b("player_impl_prepare_custom_exception_report", 0);

    /* renamed from: f */
    public static final AbstractC89244h f187902f = C84193c.m144797b("cold_boot_video_url_select_strategy", 0);

    /* renamed from: g */
    public static final AbstractC89244h f187903g = C84193c.m144797b("play_auth_verify_restore_for_test", false);

    /* renamed from: h */
    public static final AbstractC89244h f187904h = C84193c.m144797b("sc_preload_sequence_single_thread", false);

    /* renamed from: i */
    public static final AbstractC89244h f187905i = C84193c.m144797b("sc_preload_sequence_single_thread_priority", 0);

    /* renamed from: j */
    public static final AbstractC89244h f187906j = C84193c.m144797b("engine_reuse_restrict_video_width_diff", 0);

    /* renamed from: k */
    public static final AbstractC89244h f187907k = C84193c.m144797b("engine_reuse_restrict_video_height_diff", 0);

    /* renamed from: l */
    public static final AbstractC89244h f187908l = C84193c.m144797b("engine_reuse_opt_codec_adjust_v3", false);

    /* renamed from: m */
    public static final AbstractC89244h f187909m = C84193c.m144797b("player_setting_enable_brightness_info", false);

    /* renamed from: n */
    public static final AbstractC89244h f187910n = C84193c.m144797b("mediacodec_capability_report_times", 0);

    /* renamed from: o */
    public static final AbstractC89244h f187911o = C84193c.m144797b("player_first_prerender_video_set_surface_early", false);

    /* renamed from: p */
    public static final AbstractC89244h f187912p = C84193c.m144797b("enable_use_custom_orderly_main_handler", false);

    /* renamed from: q */
    public static final C84191b f187913q = new C84191b();

    /* renamed from: r */
    private static final AbstractC89244h f187914r = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C84192a.f187923a);

    /* renamed from: s */
    private static final AbstractC89244h f187915s = C84193c.m144797b("open_crop_sr", false);

    /* renamed from: t */
    private static final AbstractC89244h f187916t = C84193c.m144797b("use_540_for_low_device", false);

    /* renamed from: u */
    private static final AbstractC89244h f187917u = C84193c.m144797b("bitrate_for_low_device", 540);

    /* renamed from: v */
    private static final AbstractC89244h f187918v = C84193c.m144797b("open_sr_opt_for_mali", false);

    /* renamed from: w */
    private static final AbstractC89244h f187919w = C84193c.m144797b("enable_audio_focus_when_play", false);

    /* renamed from: x */
    private static final AbstractC89244h f187920x = C84193c.m144797b("delay_sr_init", false);

    /* renamed from: y */
    private static final AbstractC89244h f187921y;

    /* renamed from: z */
    private static final AbstractC89244h f187922z = C84193c.m144796a("player_x_pcdn_min_cache", "");

    /* renamed from: a */
    public static boolean m144774a() {
        return ((Boolean) f187915s.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static boolean m144775b() {
        return ((Boolean) f187916t.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static int m144776c() {
        return ((Number) f187917u.getValue()).intValue();
    }

    /* renamed from: d */
    public static boolean m144777d() {
        return ((Boolean) f187918v.getValue()).booleanValue();
    }

    /* renamed from: e */
    public static boolean m144778e() {
        return ((Boolean) f187919w.getValue()).booleanValue();
    }

    /* renamed from: f */
    public static NativeBitrateSelectConfig m144779f() {
        return (NativeBitrateSelectConfig) f187921y.getValue();
    }

    /* renamed from: g */
    public static C84190a<String> m144780g() {
        return (C84190a) f187922z.getValue();
    }

    /* renamed from: h */
    public static boolean m144781h() {
        return ((Boolean) f187874A.getValue()).booleanValue();
    }

    /* renamed from: i */
    public static boolean m144782i() {
        return ((Boolean) f187875B.getValue()).booleanValue();
    }

    /* renamed from: j */
    public static boolean m144783j() {
        return ((Boolean) f187876C.getValue()).booleanValue();
    }

    /* renamed from: k */
    public static boolean m144784k() {
        return ((Boolean) f187882I.getValue()).booleanValue();
    }

    /* renamed from: l */
    public static boolean m144785l() {
        return ((Boolean) f187883J.getValue()).booleanValue();
    }

    /* renamed from: m */
    public static int m144786m() {
        return ((Number) f187884K.getValue()).intValue();
    }

    /* renamed from: n */
    public static C84190a<Boolean> m144787n() {
        return (C84190a) f187886M.getValue();
    }

    /* renamed from: o */
    public static boolean m144788o() {
        return ((Boolean) f187888O.getValue()).booleanValue();
    }

    /* renamed from: p */
    public static boolean m144789p() {
        return ((Boolean) f187890Q.getValue()).booleanValue();
    }

    /* renamed from: q */
    public static boolean m144790q() {
        return ((Boolean) f187891R.getValue()).booleanValue();
    }

    /* renamed from: r */
    public static int m144791r() {
        return ((Number) f187892S.getValue()).intValue();
    }

    /* renamed from: s */
    public static Boolean m144792s() {
        return (Boolean) f187893T.getValue();
    }

    /* renamed from: t */
    public static int m144793t() {
        return ((Number) f187894U.getValue()).intValue();
    }

    /* renamed from: u */
    public static boolean m144794u() {
        return ((Boolean) f187895V.getValue()).booleanValue();
    }

    /* renamed from: v */
    public static boolean m144795v() {
        return ((Boolean) f187896W.getValue()).booleanValue();
    }

    private C84191b() {
    }

    /* renamed from: com.ss.android.ugc.playerkit.exp.b$a */
    static final class C84192a extends AbstractC89220m implements AbstractC89171a<C84190a<Integer>> {

        /* renamed from: a */
        public static final C84192a f187923a = new C84192a();

        static {
            Covode.recordClassIndex(98095);
        }

        C84192a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C84190a<Integer> invoke() {
            return new C84190a("player_setting_test", (Type) Integer.class, (Object) 0);
        }
    }

    static {
        Covode.recordClassIndex(98094);
        Boolean.valueOf(false);
        Boolean.valueOf(true);
        Integer.valueOf(540);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
        Boolean.valueOf(false);
        NativeBitrateSelectConfig nativeBitrateSelectConfig = new NativeBitrateSelectConfig(false, false, 0);
        new NativeBitrateSelectConfig(false, false, 0);
        f187921y = C84193c.m144797b("native_bitrate_select_config", nativeBitrateSelectConfig);
        Boolean.valueOf(true);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Integer.valueOf(-1);
        Integer.valueOf(-1);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Integer.valueOf(0);
        Integer.valueOf(0);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(false);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
        Integer.valueOf(-1);
        Boolean.valueOf(true);
        Integer.valueOf(0);
        Boolean.valueOf(true);
        Integer.valueOf(0);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
        Boolean.valueOf(true);
    }
}
