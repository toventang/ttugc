package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ies.abmock.d */
public final class C16050d {

    /* renamed from: a */
    public static Map<String, Object> f38667a;

    static {
        Covode.recordClassIndex(18321);
        HashMap hashMap = new HashMap();
        f38667a = hashMap;
        hashMap.put("aot_delay_client_experiment", Integer.valueOf(ClientExpManager.aot_delay_client_experiment(false)));
        f38667a.put("backup_video_opt", Integer.valueOf(ClientExpManager.backup_video_opt(false)));
        f38667a.put("cpu_big_core_bound_client", Integer.valueOf(ClientExpManager.cpu_big_core_bound_client(false)));
        f38667a.put("decompress_so_strategy_client", Integer.valueOf(ClientExpManager.decompress_so_strategy_client(false)));
        f38667a.put("enable_zero_rating_toast", Integer.valueOf(ClientExpManager.enable_zero_rating_toast(false)));
        f38667a.put("first_feed_fallback_enable", Boolean.valueOf(ClientExpManager.first_feed_fallback_enable(false)));
        f38667a.put("fix_active_user_experiment", Boolean.valueOf(ClientExpManager.fix_active_user_experiment(false)));
        f38667a.put("flow_opt_key", Integer.valueOf(ClientExpManager.flow_opt_key(false)));
        f38667a.put("gecko_bytediff_exp_tt_android", Integer.valueOf(ClientExpManager.gecko_bytediff_exp_tt_android(false)));
        f38667a.put("gender_selection_onboarding_countries", Integer.valueOf(ClientExpManager.gender_selection_onboarding_countries(false)));
        f38667a.put("gender_selection_onboarding_gender_sensitive_countries", Integer.valueOf(ClientExpManager.gender_selection_onboarding_gender_sensitive_countries(false)));
        f38667a.put("gm_age_gate_education", Integer.valueOf(ClientExpManager.gm_age_gate_education(false)));
        f38667a.put("gm_btn_appearance_optimize", Integer.valueOf(ClientExpManager.gm_btn_appearance_optimize(false)));
        f38667a.put("is_opt_new_user_boot", Integer.valueOf(ClientExpManager.is_opt_new_user_boot(false)));
        f38667a.put("kr_consent_box_fix", Integer.valueOf(ClientExpManager.kr_consent_box_fix(false)));
        f38667a.put("kr_consent_box_optimization", Integer.valueOf(ClientExpManager.kr_consent_box_optimization(false)));
        f38667a.put("launch_opt_swipeup", Integer.valueOf(ClientExpManager.launch_opt_swipeup(false)));
        f38667a.put("login_default_open_screen", Integer.valueOf(ClientExpManager.login_default_open_screen(false)));
        f38667a.put("miniapp_plugin_install_strategy", Integer.valueOf(ClientExpManager.miniapp_plugin_install_strategy(false)));
        f38667a.put("new_user_did_replace_video", Integer.valueOf(ClientExpManager.new_user_did_replace_video(false)));
        f38667a.put("new_user_feed_total_opt", Integer.valueOf(ClientExpManager.new_user_feed_total_opt(false)));
        f38667a.put("new_user_guide_animation", Integer.valueOf(ClientExpManager.new_user_guide_animation(false)));
        f38667a.put("new_user_video_prerender", Integer.valueOf(ClientExpManager.new_user_video_prerender(false)));
        f38667a.put("onboarding_email_consent", Integer.valueOf(ClientExpManager.onboarding_email_consent(false)));
        f38667a.put("qr_code_login", Boolean.valueOf(ClientExpManager.qr_code_login(false)));
        f38667a.put("remove_onboarding_steps", Integer.valueOf(ClientExpManager.remove_onboarding_steps(false)));
        f38667a.put("remove_vk", Integer.valueOf(ClientExpManager.remove_vk(false)));
        f38667a.put("resso_anchor_installed_vid", Integer.valueOf(ClientExpManager.resso_anchor_installed_vid(false)));
        f38667a.put("resso_anchor_uninstalled_vid", Integer.valueOf(ClientExpManager.resso_anchor_uninstalled_vid(false)));
        f38667a.put("return_fyp_tooltip", Integer.valueOf(ClientExpManager.return_fyp_tooltip(false)));
        f38667a.put("return_user_journey", Integer.valueOf(ClientExpManager.return_user_journey(false)));
        f38667a.put("sea_nonpersonalized_popup", Integer.valueOf(ClientExpManager.sea_nonpersonalized_popup(false)));
        f38667a.put("slogan_login_opt_experiment", Integer.valueOf(ClientExpManager.slogan_login_opt_experiment(false)));
        f38667a.put("topic_interest_selection_style", Integer.valueOf(ClientExpManager.topic_interest_selection_style(false)));
        f38667a.put("use_localized_recommend_group_global_regions", Boolean.valueOf(ClientExpManager.use_localized_recommend_group_global_regions(false)));
        f38667a.put("vmshrink_high_exp", Integer.valueOf(ClientExpManager.vmshrink_high_exp(false)));
    }
}
