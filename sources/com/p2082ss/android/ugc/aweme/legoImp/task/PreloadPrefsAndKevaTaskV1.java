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

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadPrefsAndKevaTaskV1 */
public class PreloadPrefsAndKevaTaskV1 implements AbstractC58084a, AbstractC58264w {

    /* renamed from: a */
    private Context f132931a;

    static {
        Covode.recordClassIndex(68575);
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
    private void m106374a(String str) {
        C34822d.m71158a(this.f132931a, str, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        this.f132931a = context;
        m106374a("applog_stats");
        m106374a("aweme-app");
        m106374a("key_language_sp_key");
        m106374a("KEY_NEED_UPLOAD_LAUNCHLOG");
        m106374a("default_config");
        m106374a("TeenageModeSetting");
        m106374a("app_setting");
        Keva.getRepoSync("keva_switch_repo", 0);
        Keva.getRepoSync("preinsatll_appflyer", 0);
        Keva.getRepoSync("network_keva", 0);
        Keva.getRepoSync("pendant_global_timer_reducer", 0);
        Keva.getRepoSync("new_user_journey", 0);
        Keva.getRepoSync("NewUserUtils", 0);
        Keva.getRepoSync("repo_new_version_journey", 0);
        Keva.getRepoSync("praise_keva", 0);
        Keva.getRepoSync("age_gate_service_repo", 0);
        Keva.getRepoSync("repo_story_cold_start", 0);
        Keva.getRepoSync("account_security_keva_name", 0);
        Keva.getRepoSync("ies_im_core", 0);
        Keva.getRepoSync("interest_select", 0);
        Keva.getRepoSync("setting_repo_sp", 0);
        Keva.getRepoSync("fe-storage", 0);
        Keva.getRepoSync("keva_repo_profile_component", 0);
        Keva.getRepoSync("settings_v3_config", 1);
        Keva.getRepoSync("ab_iorap_repo", 0);
        Keva.getRepoSync("av_ab_vesdk.xml", 0);
        Keva.getRepoSync("appsflyer-data", 0);
        Keva.getRepoSync("token_shared_preference", 0);
        Keva.getRepoSync("com.ss.spipe_setting", 0);
        Keva.getRepoSync("account_sec_share_data", 0);
        Keva.getRepoSync("VideoRecord", 0);
        Keva.getRepoSync("sp_stay_home_guide_cache", 0);
        Keva.getRepoSync("sp_show_share_guide_cache", 0);
        Keva.getRepoSync("MainTabPreferences", 0);
        Keva.getRepoSync("ttlive_sdk_shared_pref_cache", 0);
        Keva.getRepoSync("pendant_lottie_keva", 0);
    }
}
