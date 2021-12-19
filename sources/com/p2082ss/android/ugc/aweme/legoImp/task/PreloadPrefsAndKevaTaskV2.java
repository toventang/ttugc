package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadPrefsAndKevaTaskV2 */
public class PreloadPrefsAndKevaTaskV2 implements AbstractC58084a, AbstractC58264w {

    /* renamed from: a */
    private Context f132932a;

    static {
        Covode.recordClassIndex(68576);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: c */
    public final String[] mo28603c() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: d */
    public final int mo28604d() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: e */
    public final EnumC58149ac mo28605e() {
        return EnumC58149ac.IO;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    private void m106386a(String str) {
        C34822d.m71158a(this.f132932a, str, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        this.f132932a = context;
        m106386a("SP_EXPERIMENT_CACHE");
        m106386a("CLIENT_EXPERIMENT_CACHE_TAG");
        m106386a("SP_EXPERIMENT_CACHE");
        m106386a("aweme_user");
        m106386a("applog_stats");
        m106386a("com.ss.spipe_setting");
        m106386a("push_multi_process_config");
        m106386a("push_setting");
        m106386a("default_config");
        m106386a("key_language_sp_key");
        m106386a("KEY_NEED_UPLOAD_LAUNCHLOG");
        m106386a("appsflyer-data");
        m106386a("monitor_switch_config");
        m106386a("app_setting");
        m106386a("test_setting");
        m106386a("aweme-app");
        m106386a("ttlive_sdk_shared_pref_cache");
        m106386a("preinsatll_appflyer");
        m106386a("long_video_mock");
        m106386a("live-app-core-sdk");
        m106386a("ttlive_live_user");
        m106386a("live_fans_comment_guide");
        m106386a("live_fans_club_tips");
        m106386a("extra_group");
        m106386a("pay_controll");
        m106386a("ttlive_sdk_shared_pref_cache");
        m106386a("share_setting_preference");
        m106386a("com.ss.android.deviceregister.utils.Cdid");
        m106386a("performance_sp");
        Keva.getRepoSync("ab_repo_cold_boot", 0);
        Keva.getRepoSync("new_illegal_username_keva", 0);
        Keva.getRepoSync("settings_v3_config", 1);
        Keva.getRepoSync("precise_exposure_repo", 1);
        Keva.getRepoSync("network_keva", 0);
        Keva.getRepoSync("repo_new_version_journey", 0);
        Keva.getRepoSync("compliance_setting", 0);
        Keva.getRepoSync("av-storage-white-list", 0);
        Keva.getRepoSync("pendant_global_timer_reducer", 0);
        Keva.getRepoSync("pendant_global_timer", 0);
        Keva.getRepoSync("repo_parental_platform", 0);
        Keva.getRepoSync("new_user_journey", 0);
        Keva.getRepoSync("NewUserUtils", 0);
        Keva.getRepoSync("age_gate_service_repo", 0);
        Keva.getRepoSync("account_security_keva_name", 0);
        Keva.getRepoSync("special_plus_keva", 0);
        Keva.getRepoSync("MTMainTabPreferences", 0);
        Keva.getRepoSync("InitialChooseLanguagePreferences", 0);
        Keva.getRepoSync("money_growth", 0);
        Keva.getRepoSync("main_process_runstate", 1);
        Keva.getRepoSync("appsflyer_repo", 0);
        Keva.getRepoSync("tcm_pro_account", 0);
        Keva.getRepoSync("imsdk_0", 0);
        Keva.getRepoSync("compliance_privacy_group_chat_cache", 0);
        Keva.getRepoSync("ies_im_core", 0);
        Keva.getRepoSync("lark_cache_file", 0);
        Keva.getRepoSync("interest_select", 0);
        Keva.getRepoSync("player_setting", 0);
        Keva.getRepoSync("VideoRecord", 0);
        Keva.getRepoSync("setting_repo_safe_view", 0);
        Keva.getRepoSync("ab_iorap_repo", 0);
        Keva.getRepoSync("com.facebook.internal.FEATURE_MANAGER", 0);
        Keva.getRepoSync("pendant_lottie_keva", 0);
        Keva.getRepoSync("hybrid_debug_settings", 0);
        Keva.getRepoSync("gecko-debug-tool", 0);
        Keva.getRepoSync("av-storage-white-list", 0);
        Keva.getRepoSync("crash_marker_repo", 0);
        Keva.getRepoSync("jsbridge2-permission", 0);
    }
}
