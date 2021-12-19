package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.experiment.C46913eu;
import com.p2082ss.android.ugc.aweme.experiment.C46928fe;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.experiment.SpecialTopicEntry;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2359ay.p2360a.C34361a;
import com.p2082ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadKevaKeyTask */
public final class PreloadKevaKeyTask implements AbstractC58084a, AbstractC58264w {
    static {
        Covode.recordClassIndex(68574);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
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
        return EnumC58149ac.CPU;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: c */
    public final String[] mo28603c() {
        return new String[]{"ABTask"};
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (C16083j.m29874a().mo25538c()) {
            SettingsManager.m29616a().mo25400a("aab_plugin_fake_install", false);
            SettingsManager.m29616a().mo25400a("aab_plugin_aggressive_download_mode", true);
            C16048b.m29633a().mo25421a(true, "fetch_feed_in_foreground", false);
            SettingsManager.m29616a().mo25400a("use_bridge_engine_v2", true);
            SettingsManager.m29616a().mo25400a("enable_vboost_settings", false);
            C16048b.m29633a().mo25421a(true, "push_init_optimize_enable", false);
            C16048b.m29633a().mo25421a(true, "event_map_builder_optimize", false);
            SettingsManager.m29616a().mo25394a("music_media_player_time", 30000);
            C16048b.m29633a().mo25421a(true, "enable_fast_event_bus", false);
            SettingsManager.m29616a().mo25400a("enable_horae_init", false);
            C16048b.m29633a().mo25421a(true, "page_monitor_service_enable_ab", false);
            C16048b.m29633a().mo25412a(true, "optimize_preloadfeedtype", 0);
            C16048b.m29633a().mo25421a(true, "optimize_asyncinflatefragmentmain", true);
            C16048b.m29633a().mo25421a(true, "optimize_asyncinflatefragmentfeed", true);
            C16048b.m29633a().mo25421a(true, "optimize_asyncinflatefragmentfeed", true);
            C16048b.m29633a().mo25421a(true, "optimize_asyncinflatecoldbootfinish", true);
            C16048b.m29633a().mo25413a(true, "optimize_asyncinflateprofiledelaytime", 800L);
            C16048b.m29633a().mo25412a(true, "player_background_release_codec_res", 0);
            C16048b.m29633a().mo25421a(true, "hpas2sv_dialog_async", false);
            SettingsManager.m29616a().mo25400a("feed_detail_transition_local_enable", true);
            C16048b.m29633a().mo25421a(true, "feed_detail_transition_enable", false);
            C16048b.m29633a().mo25421a(true, "feed_populate_partition_optimize", false);
            C16048b.m29633a().mo25412a(true, "player_ab_block_type", 0);
            C16048b.m29633a().mo25412a(true, "ad_opt_webview_preload", 0);
            C16048b.m29633a().mo25421a(true, "feed_prepare_enable_control_optimize", false);
            C16048b.m29633a().mo25421a(true, "feed_prepare_push_control_optimize", false);
            C16048b.m29633a().mo25421a(true, "for_you_new_translations", false);
            C16048b.m29633a().mo25413a(true, "player_background_release_codec_res_countdown_duration", 30000L);
            C16048b.m29633a().mo25421a(true, "feed_scrool_duration_opt_enable", false);
            C16048b.m29633a().mo25412a(true, "use_new_app_alert", 0);
            C16048b.m29633a().mo25421a(true, "combine_settings_req", true);
            SettingsManager.m29616a().mo25400a("story_container_touch_event_enable", true);
            SettingsManager.m29616a().mo25394a("background_pause_player_setting", 0);
            C16048b.m29633a().mo25412a(true, "tiktok_social_reverse_enable", 0);
            C16048b.m29633a().mo25412a(true, "tt_story_experiment", 0);
            SettingsManager.m29616a().mo25394a("video_play_progress_count", 0);
            C16048b.m29633a().mo25421a(true, "optimize_feed_tab_layout", false);
            C16048b.m29633a().mo25412a(true, "following_foru_swipe_disable_unloginuser", 0);
            C16048b.m29633a().mo25421a(true, "following_red_dot_reverse", false);
            C16048b.m29633a().mo25412a(true, "cancel_other_push", 0);
            SettingsManager.m29616a().mo25394a("inapp_update_switch_strategy", 0);
            C16048b.m29633a().mo25421a(true, "enable_full_screen_read_adaption", true);
            C16048b.m29633a().mo25421a(true, "i18n_following_badge_type_number", false);
            try {
                C16048b.m29633a().mo25415a(true, "special_event_entrypoint", SpecialTopicEntry.class);
                C16048b.m29633a().mo25415a(true, "image_crop_config_v3", C34361a.class);
                C16048b.m29633a().mo25416a(true, "permission_pop_up_frequency_control", C46928fe.class, C46913eu.f109328a);
                C16048b.m29633a().mo25415a(true, "preload_strategy_hp", PreloadStrategyConfig.class);
            } catch (Exception e) {
                String.valueOf(e.getStackTrace());
            }
            C16048b.m29633a().mo25421a(true, "feed_view_page_preload_view_optimize", false);
            SettingsManager.m29616a().mo25400a("feed_handle_generic_motion", true);
            C16048b.m29633a().mo25421a(true, "enable_network_notice", false);
            C16048b.m29633a().mo25421a(true, "view_page_populate_delay_enable", false);
            C16048b.m29633a().mo25421a(true, "view_page_smooth_scroll_enable", false);
            C16048b.m29633a().mo25412a(true, "tt_story_icon_display_strategy", 1);
            C16048b.m29633a().mo25412a(true, "gather_mode", 0);
            SettingsManager.m29616a().mo25394a("vboost_feed_scroll_opt_time", 1500);
            SettingsManager.m29616a().mo25394a("feed_find_bug_setting", 1);
            C16048b.m29633a().mo25412a(true, "feed_adapter_get_view_delay", -1);
            C16048b.m29633a().mo25412a(true, "engine_preloader_pre_connect", 0);
            C16048b.m29633a().mo25412a(true, "player_precreateplayer", 0);
            C16048b.m29633a().mo25412a(true, "optimize_feed_prepare_video_option", 100);
            C16048b.m29633a().mo25412a(true, "optimize_feed_precreate_player_option", 0);
            C16048b.m29633a().mo25417a(true, "helios_anchor_task_plan", "PlanA");
            C16048b.m29633a().mo25412a(true, "btm_switch", 0);
            C16048b.m29633a().mo25412a(true, "feed_adapter_get_view_delay", -1);
            C16048b.m29633a().mo25421a(true, "user_manager_update_optimize", false);
            C16048b.m29633a().mo25412a(true, "full_recommend_live_display_type", 1);
            C16048b.m29633a().mo25421a(true, "preload_feed_item_optimize", false);
            C16048b.m29633a().mo25421a(true, "is_clear_video_background", true);
            C16048b.m29633a().mo25412a(true, "lottie_opt_group_ab", 0);
            C16048b.m29633a().mo25412a(true, "separate_share_more_strategy", 0);
            C16048b.m29633a().mo25412a(true, "feed_user_suggestion_style", 0);
            C16048b.m29633a().mo25421a(true, "enable_benchmark_performance", false);
            C16048b.m29633a().mo25421a(true, "marquee_title_opt", false);
            C16048b.m29633a().mo25421a(true, "feed_Commerce_selected_optimize", false);
            C16048b.m29633a().mo25421a(true, "feed_Commerce_logic_optimize", false);
            SettingsManager.m29616a().mo25400a("expand_the_character_limit_of_video_caption_enable_for_consumers", false);
            C16048b.m29633a().mo25412a(true, "resize_feed_in_small_screen", 0);
            C16048b.m29633a().mo25421a(true, "feed_Commerce_unselected_optimize", false);
            C16048b.m29633a().mo25412a(true, "surface_lifecycle_notification_enabled", 0);
            C16048b.m29633a().mo25412a(true, "player_prerender_cover_need", 1);
            C16048b.m29633a().mo25421a(true, "enable_reuse_external_image_include_static_image", true);
            C16048b.m29633a().mo25412a(true, "follow_live_interaction_style", 0);
            SettingsManager.m29616a().mo25394a("allow_long_video_scrubbing", 0);
            SettingsManager.m29616a().mo25394a("anti_addiction_day_time", 0);
            SettingsManager.m29616a().mo25394a("anti_addiction_night_time", 0);
            C16048b.m29633a().mo25421a(true, "is_preload_process_data", false);
            SettingsManager.m29616a().mo25394a("enable_feed_ad_break_duration_optimize", 0);
            SettingsManager.m29616a().mo25394a("playermanager_background_check", 0);
            C16048b.m29633a().mo25412a(true, "player_schedule_on_render", 0);
            C16048b.m29633a().mo25421a(true, "player_prerender_surface_slow_set_fix", false);
            C16048b.m29633a().mo25412a(true, "viewpager_load_delay_phase", 0);
            C16048b.m29633a().mo25412a(true, "video_caption_line_height", 0);
            C16048b.m29633a().mo25412a(true, "interction_share_button_whatsapp_style", 0);
            C16048b.m29633a().mo25412a(true, "interction_share_button_style", 0);
            C16048b.m29633a().mo25412a(true, "show_play_count", 0);
            C16048b.m29633a().mo25421a(true, "feed_player_load_more_preload_experiment", false);
            C16048b.m29633a().mo25412a(true, "feed_view_page_preload_delay_time_option", 1000);
            C16048b.m29633a().mo25421a(true, "play_time_opt_exp", false);
            C16048b.m29633a().mo25412a(true, "player_play_start_time_storge_opt", 0);
            C16048b.m29633a().mo25412a(true, "player_prerender_enable", 0);
            C16048b.m29633a().mo25412a(true, "feed_palm_rejection_2", 0);
        }
    }
}
