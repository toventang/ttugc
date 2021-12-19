package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.preference.PreferenceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.experiment.C46855dv;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadTask */
public class SharePreferencePreloadTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68602);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        m106545a(context, "key_language_sp_key");
        m106545a(context, "KEY_NEED_UPLOAD_LAUNCHLOG");
        m106545a(context, "pref_language_key");
        m106545a(context, "preinsatll_appflyer");
        m106545a(context, "appsflyer-data");
        m106545a(context, "ab_test_model");
        m106545a(context, "default_config");
        m106545a(context, "custom_channels");
        m106545a(context, "aweme-app");
        m106545a(context, "aweme_user");
        m106545a(context, "av_ab.xml");
        m106545a(context, "av_settings.xml");
        m106545a(context, "x2c_error");
        m106545a(context, "current_foreground_uid");
        m106545a(context, "USER_PROFILE");
        m106545a(context, "MainTabPreferences");
        m106545a(context, "share_theme_data");
        m106545a(context, "prefs_feed_check");
        PreferenceManager.getDefaultSharedPreferences(context).getAll();
        m106545a(context, "guide");
        m106545a(context, "main_swipere_fresh");
        m106545a(context, "VideoRecord");
        m106545a(context, "long_video_mock");
        m106545a(context, "last_version_code");
        m106545a(context, "appsflyer-data");
        m106545a(context, "app_bundle_session_ids");
        m106545a(context, "sp_show_share_guide_cache");
        m106545a(context, "apps_flyer_cache");
        m106545a(context, "com.google.android.gms.measurement.prefs");
        m106545a(context, "com.google.firebase.common.prefs");
        m106545a(context, "google_ads_flags");
        m106545a(context, "InitialChooseLanguagePreferences");
        m106545a(context, "share_setting_preference");
        m106545a(context, "TabStatus");
        m106545a(context, "ttnet_tnc_config");
        m106545a(context, "ai_music");
        m106545a(context, "com.zhiliaoapp.musically");
        m106545a(context, "DeviceSettingSp");
        m106545a(context, "settings");
        m106545a(context, "new_sp_ad_config");
        m106545a(context, "imbase_0");
        Keva.getRepoSync("money_growth", 0);
        Keva.getRepoSync("money_growth_read_task", 0);
        Keva.getRepoSync("SelectOldCities", 0);
        Keva.getRepoSync("ug_coupon_repo", 0);
        Keva.getRepoSync("TTSettingData", 0);
        Keva.getRepoSync("USER_RETAIN", 0);
        Keva.getRepoSync("first_install_version", 0);
        Keva.getRepoSync("repo_mapping_url", 0);
        Keva.getRepoFromSpSync(context, "music_sp", 0);
        Keva.getRepoFromSpSync(context, "test_sp", 0);
        Keva.getRepoFromSpSync(context, "HateFulPreferences", 0);
        Keva.getRepoFromSpSync(context, "setting_repo_sp", 0);
        if (C49907s.m93685a().booleanValue()) {
            Keva.getRepoSync("new_user_journey", 0);
        }
    }

    /* renamed from: a */
    private static void m106545a(Context context, String str) {
        if (C46855dv.m90167b()) {
            C34822d.m71158a(context, str, 0);
        } else {
            C34822d.m71158a(context, str, 0).getInt("tiktok", 0);
        }
    }
}
