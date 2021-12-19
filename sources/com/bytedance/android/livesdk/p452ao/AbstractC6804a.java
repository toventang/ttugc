package com.bytedance.android.livesdk.p452ao;

import android.util.LongSparseArray;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.ao.a */
public interface AbstractC6804a {

    /* renamed from: A */
    public static final C6805b<Integer> f16872A = new C6805b<>("broadcast_pause_times_per_each", (Integer) 3);

    /* renamed from: B */
    public static final C6805b<Integer> f16873B = new C6805b<>("live_ctrl_window_x", (Integer) -1);

    /* renamed from: C */
    public static final C6805b<Integer> f16874C = new C6805b<>("live_ctrl_window_y", (Integer) -1);

    /* renamed from: D */
    public static final C6805b<Boolean> f16875D = new C6805b<>("live_game_msg_enabled", (Boolean) true);

    /* renamed from: E */
    public static final C6805b<Integer> f16876E = new C6805b<>("show_screen_record_notification_tips_permission_count", (Integer) 0);

    /* renamed from: F */
    public static final C6805b<Boolean> f16877F = new C6805b<>("live_inroom_pk_tips", (Boolean) true);

    /* renamed from: G */
    public static final C6805b<Boolean> f16878G = new C6805b<>("live_inroom_pk_animation", (Boolean) false);

    /* renamed from: H */
    public static final C6805b<Set<Long>> f16879H = new C6805b<>("gift_panel_showed_manual", new HashSet());

    /* renamed from: I */
    public static final C6805b<Set<String>> f16880I = new C6805b<>("gift_panel_opened_guide_url", new HashSet());

    /* renamed from: J */
    public static final C6805b<Boolean> f16881J = new C6805b<>("showed_doodle_template_popup_tip", (Boolean) false);

    /* renamed from: K */
    public static final C6805b<Boolean> f16882K = new C6805b<>("gift_animation_enable_landscape", (Boolean) true);

    /* renamed from: L */
    public static final C6805b<Long> f16883L = new C6805b<>("live_start_live_anchor", (Long) 0L);

    /* renamed from: M */
    public static final C6805b<Map<String, String>> f16884M = new C6805b<>("live_start_live_tag", new HashMap());

    /* renamed from: N */
    public static final C6805b<Boolean> f16885N = new C6805b<>("live_beauty_feedback_clicked", (Boolean) false);

    /* renamed from: O */
    public static final C6805b<Integer> f16886O = new C6805b<>("live_filter_id", (Integer) -1);

    /* renamed from: P */
    public static final C6805b<Float> f16887P;

    /* renamed from: Q */
    public static final C6805b<Float> f16888Q;

    /* renamed from: R */
    public static final C6805b<Float> f16889R;

    /* renamed from: S */
    public static final C6805b<Float> f16890S;

    /* renamed from: T */
    public static final C6805b<Integer> f16891T = new C6805b<>("beauty_level", (Integer) 3);

    /* renamed from: U */
    public static final C6805b<Set<Long>> f16892U = new C6805b<>("prop_panel_showed_red_point", new HashSet());

    /* renamed from: V */
    public static final C6805b<Set<String>> f16893V = new C6805b<>("fast_gift_hide_confirm_gift", new HashSet());

    /* renamed from: W */
    public static final C6805b<Set<String>> f16894W = new C6805b<>("mt_fast_gift_hide_confirm_gift", new HashSet());

    /* renamed from: X */
    public static final C6805b<Float> f16895X;

    /* renamed from: Y */
    public static final C6805b<Float> f16896Y;

    /* renamed from: Z */
    public static final C6805b<Integer> f16897Z = new C6805b<>("barrage_local_type", (Integer) 2);

    /* renamed from: a */
    public static final C6805b<Boolean> f16898a = new C6805b<>("jump_to_room_dialog", (Boolean) false);

    /* renamed from: aA */
    public static final C6805b<Boolean> f16899aA = new C6805b<>("recharge_dialog_big_deal_hint_shown", (Boolean) false);

    /* renamed from: aB */
    public static final C6805b<Long> f16900aB = new C6805b<>("drawer_anim_show", (Long) 0L);

    /* renamed from: aC */
    public static final C6805b<Integer> f16901aC = new C6805b<>("drawer_anim_show_count", (Integer) 0);

    /* renamed from: aD */
    public static final C6805b<Boolean> f16902aD = new C6805b<>("live_comment_danmu_state", (Boolean) false);

    /* renamed from: aE */
    public static final C6805b<String> f16903aE = new C6805b<>("room_decoration_customize_text", "");

    /* renamed from: aF */
    public static final C6805b<Integer> f16904aF = new C6805b<>("room_decoration_text_pass_level", (Integer) 31);

    /* renamed from: aG */
    public static final C6805b<Long> f16905aG = new C6805b<>("room_decoration_anchor_id", (Long) 0L);

    /* renamed from: aH */
    public static final C6805b<String> f16906aH = new C6805b<>("room_decoration_list", "");

    /* renamed from: aI */
    public static final C6805b<Boolean> f16907aI = new C6805b<>("show_room_decoration_toast", (Boolean) true);

    /* renamed from: aJ */
    public static final C6805b<Boolean> f16908aJ = new C6805b<>("showed_pay_channel_scroll_tip", (Boolean) false);

    /* renamed from: aK */
    public static final C6805b<Boolean> f16909aK = new C6805b<>("show_enter_other_live_room_dialog", (Boolean) true);

    /* renamed from: aL */
    public static final C6805b<Boolean> f16910aL = new C6805b<>("show_enter_other_live_room_dialog_of_hour_rank", (Boolean) true);

    /* renamed from: aM */
    public static final C6805b<Long> f16911aM = new C6805b<>("mobile_flow_show_time", (Long) 0L);

    /* renamed from: aN */
    public static final C6805b<String> f16912aN = new C6805b<>("last_first_charge_bubble_show_time", "");

    /* renamed from: aO */
    public static final C6805b<String> f16913aO = new C6805b<>("last_first_charge_bubble_text", "");

    /* renamed from: aP */
    public static final C6805b<List<String>> f16914aP = new C6805b<>("last_first_charge_bubble_show_info", new ArrayList());

    /* renamed from: aQ */
    public static final C6805b<Integer> f16915aQ = new C6805b<>("recharge_dialog_content_height", (Integer) 0);

    /* renamed from: aR */
    public static final C6805b<Boolean> f16916aR = new C6805b<>("show_question_guide_bubble", (Boolean) true);

    /* renamed from: aS */
    public static final C6805b<Boolean> f16917aS = new C6805b<>("show_close_question_tip", (Boolean) true);

    /* renamed from: aT */
    public static final C6805b<Boolean> f16918aT = new C6805b<>("show_pause_live_tip", (Boolean) true);

    /* renamed from: aU */
    public static final C6805b<String> f16919aU = new C6805b<>("tool_bar_first_charge_shake_times", "");

    /* renamed from: aV */
    public static final C6805b<Long> f16920aV = new C6805b<>("recharge_reward_popup_in_gift_dialog_timestamp", (Long) 0L);

    /* renamed from: aW */
    public static final C6805b<String> f16921aW = new C6805b<>("live_last_turntable_bubble", "");

    /* renamed from: aX */
    public static final C6805b<Long> f16922aX = new C6805b<>("live_last_new_drive_count", (Long) 0L);

    /* renamed from: aY */
    public static final C6805b<Boolean> f16923aY = new C6805b<>("live_showd_drive_panel", (Boolean) false);

    /* renamed from: aZ */
    public static final C6805b<Double> f16924aZ = new C6805b<>("live_last_healthy_score", Double.valueOf(0.0d));

    /* renamed from: aa */
    public static final C6805b<Boolean> f16925aa = new C6805b<>("barrage_enable", (Boolean) true);

    /* renamed from: ab */
    public static final C6805b<Boolean> f16926ab = new C6805b<>("room_auto_gift_thanks", (Boolean) false);

    /* renamed from: ac */
    public static final C6805b<Boolean> f16927ac = new C6805b<>("game_quiz_anchor_tip_show", (Boolean) false);

    /* renamed from: ad */
    public static final C6805b<Long> f16928ad = new C6805b<>("live_guide_to_feed_show_time", (Long) 0L);

    /* renamed from: ae */
    public static final C6805b<Boolean> f16929ae = new C6805b<>("live_game_quit_click", (Boolean) false);

    /* renamed from: af */
    public static final C6805b<Boolean> f16930af = new C6805b<>("live_share_get_diamonds_tip", (Boolean) true);

    /* renamed from: ag */
    public static final C6805b<Integer> f16931ag = new C6805b<>("live_game_msg_state", (Integer) 0);

    /* renamed from: ah */
    public static final C6805b<Boolean> f16932ah = new C6805b<>("live_game_comment_msg_push", (Boolean) true);

    /* renamed from: ai */
    public static final C6805b<Boolean> f16933ai = new C6805b<>("live_game_gift_msg_push", (Boolean) true);

    /* renamed from: aj */
    public static final C6805b<Boolean> f16934aj = new C6805b<>("live_anchor_show_fans_club_push", (Boolean) false);

    /* renamed from: ak */
    public static final C6805b<Boolean> f16935ak = new C6805b<>("live_anchor_show_fans_club_auto_light_4_anchor_push", (Boolean) false);

    /* renamed from: al */
    public static final C6805b<Boolean> f16936al = new C6805b<>("live_anchor_show_fans_club_auto_light_4_audience_push", (Boolean) false);

    /* renamed from: am */
    public static final C6805b<Boolean> f16937am = new C6805b<>("gesture_magic_guide_flag", (Boolean) true);

    /* renamed from: an */
    public static final C6805b<Map<String, Boolean>> f16938an = new C6805b<>("gesture_magic_guide_v2", new HashMap());

    /* renamed from: ao */
    public static final C6805b<Boolean> f16939ao = new C6805b<>("gesture_magic_switch", (Boolean) true);

    /* renamed from: ap */
    public static final C6805b<Boolean> f16940ap = new C6805b<>("gesture_magic_switch_v2", (Boolean) false);

    /* renamed from: aq */
    public static final C6805b<Map<String, String>> f16941aq = new C6805b<>("gesture_magic_old_select_composer_path_map", new HashMap());

    /* renamed from: ar */
    public static final C6805b<Map<String, List<String>>> f16942ar = new C6805b<>("gesture_magic_select_composer_path_map", new HashMap());

    /* renamed from: as */
    public static final C6805b<Map<String, Map<String, Float>>> f16943as = new C6805b<>("live_composer_save_node_tag_value", new HashMap());

    /* renamed from: at */
    public static final C6805b<Integer> f16944at = new C6805b<>("current_sticker_page_position", (Integer) 0);

    /* renamed from: au */
    public static final C6805b<Boolean> f16945au = new C6805b<>("show_backpack_tips", (Boolean) true);

    /* renamed from: av */
    public static final C6805b<Boolean> f16946av = new C6805b<>("vigo_show_start_live_flame_tip", (Boolean) true);

    /* renamed from: aw */
    public static final C6805b<Integer> f16947aw = new C6805b<>("vigo_show_end_live_flame_tip_count", (Integer) 0);

    /* renamed from: ax */
    public static final C6805b<Boolean> f16948ax = new C6805b<>("package_purchase_showed", (Boolean) false);

    /* renamed from: ay */
    public static final C6805b<String> f16949ay = new C6805b<>("last_pay_channel", "");

    /* renamed from: az */
    public static final C6805b<Boolean> f16950az = new C6805b<>("recharge_dialog_balance_change_tip_shown", (Boolean) false);

    /* renamed from: b */
    public static final C6805b<Set<String>> f16951b = new C6805b<>("gift_list_type", new HashSet());

    /* renamed from: bA */
    public static final C6805b<Boolean> f16952bA = new C6805b<>("live_show_moderator_setting_red_dot", (Boolean) true);

    /* renamed from: bB */
    public static final C6805b<Boolean> f16953bB = new C6805b<>("live_subscribe_chat_only_switch", (Boolean) false);

    /* renamed from: bC */
    public static final C6805b<Boolean> f16954bC = new C6805b<>("live_subscribe_show_preview_reddot", (Boolean) true);

    /* renamed from: bD */
    public static final C6805b<Boolean> f16955bD = new C6805b<>("live_sucscribe_finished_guide", (Boolean) false);

    /* renamed from: bE */
    public static final C6805b<Boolean> f16956bE = new C6805b<>("live_subscribe_first_get_qualification", (Boolean) true);

    /* renamed from: bF */
    public static final C6805b<Boolean> f16957bF = new C6805b<>("live_show_admin_setting_red_dot", (Boolean) true);

    /* renamed from: bG */
    public static final C6805b<Boolean> f16958bG = new C6805b<>("live_show_comment_setting_red_dot", (Boolean) true);

    /* renamed from: bH */
    public static final C6805b<Boolean> f16959bH = new C6805b<>("live_show_preview_setting_red_dot", (Boolean) true);

    /* renamed from: bI */
    public static final C6805b<Boolean> f16960bI = new C6805b<>("live_show_preview_temporary_mute_setting_update_dialog", (Boolean) true);

    /* renamed from: bJ */
    public static final C6805b<Boolean> f16961bJ = new C6805b<>("live_show_preview_temporary_mute_setting_red_dot", (Boolean) true);

    /* renamed from: bK */
    public static final C6805b<Boolean> f16962bK = new C6805b<>("live_show_manage_temporary_mute_setting_red_dot", (Boolean) true);

    /* renamed from: bL */
    public static final C6805b<Long> f16963bL = new C6805b<>("live_show_room_default_temporary_mute_duration", (Long) Long.MIN_VALUE);

    /* renamed from: bM */
    public static final C6805b<LongSparseArray<String>> f16964bM = new C6805b<>("send_gift_group_count", new LongSparseArray());

    /* renamed from: bN */
    public static final C6805b<LongSparseArray<String>> f16965bN = new C6805b<>("send_prop_group_count", new LongSparseArray());

    /* renamed from: bO */
    public static final C6805b<Boolean> f16966bO = new C6805b<>("official_danmu_enable", (Boolean) true);

    /* renamed from: bP */
    public static final C6805b<Boolean> f16967bP = new C6805b<>("official_gift_enable", (Boolean) true);

    /* renamed from: bQ */
    public static final C6805b<Boolean> f16968bQ = new C6805b<>("show_live_replay_prompt", (Boolean) true);

    /* renamed from: bR */
    public static final C6805b<Boolean> f16969bR = new C6805b<>("anchor_comments_enable", (Boolean) true);

    /* renamed from: bS */
    public static final C6805b<Boolean> f16970bS = new C6805b<>("anchor_is_receive_link", (Boolean) true);

    /* renamed from: bT */
    public static final C6805b<Boolean> f16971bT = new C6805b<>("anchor_is_suggested_to_another_anchor", (Boolean) false);

    /* renamed from: bU */
    public static final C6805b<Boolean> f16972bU = new C6805b<>("link_mic_battle_has_show_guide", (Boolean) false);

    /* renamed from: bV */
    public static final C6805b<Boolean> f16973bV = new C6805b<>("link_mic_battle_has_show_invite_pop_tip", (Boolean) false);

    /* renamed from: bW */
    public static final C6805b<Boolean> f16974bW = new C6805b<>("link_mic_battle_has_anchor_show_rule_pop_tip", (Boolean) false);

    /* renamed from: bX */
    public static final C6805b<Boolean> f16975bX = new C6805b<>("link_mic_battle_has_audience_show_rule_pop_tip", (Boolean) false);

    /* renamed from: bY */
    public static final C6805b<List<Double>> f16976bY = new C6805b<>("rankdom_linkmic_ quickly_disconnected_record", new ArrayList());

    /* renamed from: bZ */
    public static final C6805b<Integer> f16977bZ = new C6805b<>("random_linkmic_time", "random_linkmic_time", 0);

    /* renamed from: ba */
    public static final C6805b<Long> f16978ba = new C6805b<>("live_last_punishment_time", (Long) 0L);

    /* renamed from: bb */
    public static final C6805b<Integer> f16979bb = new C6805b<>("duty_gift_last_rules", (Integer) 0);

    /* renamed from: bc */
    public static final C6805b<String> f16980bc = new C6805b<>("last_first_quit_anchor_dialog", "");

    /* renamed from: bd */
    public static final C6805b<String> f16981bd = new C6805b<>("last_first_more_anchor_guide", "");

    /* renamed from: be */
    public static final C6805b<Integer> f16982be = new C6805b<>("join_fans_comment_guide_times", (Integer) 0);

    /* renamed from: bf */
    public static final C6805b<Long> f16983bf = new C6805b<>("latest_show_join_fans_comment_time", (Long) 0L);

    /* renamed from: bg */
    public static final C6805b<Boolean> f16984bg = new C6805b<>("has_show_live_long_press_clear_screen_tips", (Boolean) false);

    /* renamed from: bh */
    public static final C6805b<Boolean> f16985bh = new C6805b<>("has_slide_to_exit_room", (Boolean) false);

    /* renamed from: bi */
    public static final C6805b<Integer> f16986bi = new C6805b<>("starlight_anim_guide_count", (Integer) 0);

    /* renamed from: bj */
    public static final C6805b<Integer> f16987bj = new C6805b<>("starlight_text_guide_count", (Integer) 0);

    /* renamed from: bk */
    public static final C6805b<Integer> f16988bk = new C6805b<>("hotsoon_wallet_page_guide_shown", (Integer) 0);

    /* renamed from: bl */
    public static final C6805b<String> f16989bl = new C6805b<>("live_group_toolbar_red_dot_local", "");

    /* renamed from: bm */
    public static final C6805b<Boolean> f16990bm = new C6805b<>("show_gift_toolbar_red_dot", (Boolean) false);

    /* renamed from: bn */
    public static final C6805b<Boolean> f16991bn = new C6805b<>("click_gift_toolbar_red_dot", (Boolean) false);

    /* renamed from: bo */
    public static final C6805b<Boolean> f16992bo = new C6805b<>("show_gift_dialog_prop_red_dot", (Boolean) false);

    /* renamed from: bp */
    public static final C6805b<Boolean> f16993bp = new C6805b<>("has_shown_send_red_packet", (Boolean) false);

    /* renamed from: bq */
    public static final C6805b<Boolean> f16994bq = new C6805b<>("official_task_packet_animation", (Boolean) false);

    /* renamed from: br */
    public static final C6805b<Boolean> f16995br = new C6805b<>("has_show_koi_play_description", (Boolean) false);

    /* renamed from: bs */
    public static final C6805b<Set<String>> f16996bs = new C6805b<>("star_room_open_red_packet_rooms", new HashSet());

    /* renamed from: bt */
    public static final C6805b<Set<String>> f16997bt = new C6805b<>("star_room_open_red_packet_uids", new HashSet());

    /* renamed from: bu */
    public static final C6805b<Boolean> f16998bu = new C6805b<>("has_play_gift_failure_on_mediaplayer", (Boolean) false);

    /* renamed from: bv */
    public static final C6805b<Boolean> f16999bv = new C6805b<>("has_shown_portal_gift_guide", (Boolean) false);

    /* renamed from: bw */
    public static final C6805b<Boolean> f17000bw = new C6805b<>("manage_button_tips_show", (Boolean) true);

    /* renamed from: bx */
    public static final C6805b<Boolean> f17001bx = new C6805b<>("block_word_pannel_tips_show", (Boolean) true);

    /* renamed from: by */
    public static final C6805b<Boolean> f17002by = new C6805b<>("live_show_preview_setting_update_dialog", (Boolean) true);

    /* renamed from: bz */
    public static final C6805b<Boolean> f17003bz = new C6805b<>("live_show_preview_moderator_setting_red_dot", (Boolean) true);

    /* renamed from: c */
    public static final C6805b<Set<String>> f17004c = new C6805b<>("gift_urls", new HashSet());

    /* renamed from: cA */
    public static final C6805b<Long> f17005cA = new C6805b<>("live_finish_page_push_tip_time", (Long) 0L);

    /* renamed from: cB */
    public static final C6805b<Integer> f17006cB = new C6805b<>("live_finish_page_push_tip_count", (Integer) 0);

    /* renamed from: cC */
    public static final C6805b<Boolean> f17007cC = new C6805b<>("live_jsb_show_exchange_dialog", (Boolean) true);

    /* renamed from: cD */
    public static final C6805b<Boolean> f17008cD = new C6805b<>("live_show_exchange_red_dot", (Boolean) true);

    /* renamed from: cE */
    public static final C6805b<Integer> f17009cE = new C6805b<>("live_ug_exchange_click_cancel_count", (Integer) 0);

    /* renamed from: cF */
    public static final C6805b<Integer> f17010cF = new C6805b<>("live_gifts_exchange_click_cancel_count", (Integer) 0);

    /* renamed from: cG */
    public static final C6805b<Integer> f17011cG = new C6805b<>("live_has_exchange_gift_success", (Integer) 0);

    /* renamed from: cH */
    public static final C6805b<Boolean> f17012cH = new C6805b<>("live_show_turn_on_auto_exchange_dialog", (Boolean) true);

    /* renamed from: cI */
    public static final C6805b<Boolean> f17013cI = new C6805b<>("live_center_lottie_guide_animation", (Boolean) true);

    /* renamed from: cJ */
    public static final C6805b<Boolean> f17014cJ = new C6805b<>("live_center_lottie_guide_right_animation", (Boolean) true);

    /* renamed from: cK */
    public static final C6805b<Boolean> f17015cK = new C6805b<>("live_intro_preview_setting_entrance", (Boolean) true);

    /* renamed from: cL */
    public static final C6805b<Boolean> f17016cL = new C6805b<>("live_intro_broadcast  _setting_entrance", (Boolean) true);

    /* renamed from: cM */
    public static final C6805b<Map<String, String>> f17017cM = new C6805b<>(C11115u.m19743a().mo17915b().mo13161c() + "_broadcast_live_game_category_last_select_game", new HashMap());

    /* renamed from: cN */
    public static final C6805b<Map<String, String>> f17018cN = new C6805b<>("broadcast_fetched_game_tag", new HashMap());

    /* renamed from: cO */
    public static final C6805b<Boolean> f17019cO = new C6805b<>("obs_screen_live_audience_click_definition_selection", (Boolean) false);

    /* renamed from: cP */
    public static final C6805b<Map<String, String>> f17020cP = new C6805b<>("obs_screen_live_audience_manually_select_sdk_key", new HashMap());

    /* renamed from: cQ */
    public static final C6805b<Map<String, String>> f17021cQ = new C6805b<>("screen_live_broadcast_manually_select_sdk_key", new HashMap());

    /* renamed from: cR */
    public static final C6805b<Long> f17022cR = new C6805b<>("live_filter_change_time", (Long) -1L);

    /* renamed from: cS */
    public static final C6805b<Map<String, Double>> f17023cS = new C6805b<>("live_filter_level_map", new HashMap());

    /* renamed from: cT */
    public static final C6805b<Boolean> f17024cT = new C6805b<>("live_multi_live_guest_click_beauty_tips", (Boolean) false);

    /* renamed from: cU */
    public static final C6805b<Boolean> f17025cU = new C6805b<>("live_multi_live_anchor_settings_prompt_shown", (Boolean) false);

    /* renamed from: cV */
    public static final C6805b<Boolean> f17026cV = new C6805b<>("live_multi_live_anchor_settings_bubble_shown", (Boolean) false);

    /* renamed from: ca */
    public static final C6805b<Boolean> f17027ca = new C6805b<>("has_click_random_linkmic_entrance_when_ban", (Boolean) false);

    /* renamed from: cb */
    public static final C6805b<Boolean> f17028cb = new C6805b<>("link_mic_battle_open_gift_guide_not_show_again", (Boolean) false);

    /* renamed from: cc */
    public static final C6805b<Boolean> f17029cc = new C6805b<>("anchor_show_qa_tutorial", (Boolean) true);

    /* renamed from: cd */
    public static final C6805b<Boolean> f17030cd = new C6805b<>("admin_show_qa_tutorial", (Boolean) true);

    /* renamed from: ce */
    public static final C6805b<Boolean> f17031ce = new C6805b<>("anchor_first_turn_qa", (Boolean) true);

    /* renamed from: cf */
    public static final C6805b<Boolean> f17032cf = new C6805b<>("anchor_first_answer", (Boolean) true);

    /* renamed from: cg */
    public static final C6805b<Boolean> f17033cg = new C6805b<>("anchor_first_switch_question", (Boolean) true);

    /* renamed from: ch */
    public static final C6805b<Boolean> f17034ch = new C6805b<>("anchor_has_show_open_suggested_switch_message", (Boolean) false);

    /* renamed from: ci */
    public static final C6805b<Boolean> f17035ci = new C6805b<>("anchor_is_receive_linkmic_invitation_this_live", (Boolean) true);

    /* renamed from: cj */
    public static final C6805b<Boolean> f17036cj = new C6805b<>("anchor_should_open_guest_linkmic_when_start", (Boolean) true);

    /* renamed from: ck */
    public static final C6805b<Boolean> f17037ck = new C6805b<>("should_show_battle_rule_guide_message", (Boolean) true);

    /* renamed from: cl */
    public static final C6805b<String> f17038cl = new C6805b<>("live_broadcast_game_category", "");

    /* renamed from: cm */
    public static final C6805b<Boolean> f17039cm = new C6805b<>("live_category_bubble_guide_show", (Boolean) false);

    /* renamed from: cn */
    public static final C6805b<Boolean> f17040cn = new C6805b<>("live_game_float_first_show", (Boolean) true);

    /* renamed from: co */
    public static final C6805b<Boolean> f17041co = new C6805b<>("live_game_msg_first_snapped", (Boolean) true);

    /* renamed from: cp */
    public static final C6805b<Integer> f17042cp = new C6805b<>("live_game_msg_state", (Integer) 0);

    /* renamed from: cq */
    public static final C6805b<Boolean> f17043cq = new C6805b<>("live_pip_switcher_open", (Boolean) false);

    /* renamed from: cr */
    public static final C6805b<Boolean> f17044cr = new C6805b<>("live_pip_guide_dialog_has_shown", (Boolean) false);

    /* renamed from: cs */
    public static final C6805b<Boolean> f17045cs = new C6805b<>("live_game_latest_set_landscape", (Boolean) true);

    /* renamed from: ct */
    public static final C6805b<Integer> f17046ct = new C6805b<>("live_last_set_game", (Integer) 0);

    /* renamed from: cu */
    public static final C6805b<Boolean> f17047cu = new C6805b<>("live_first_add_hashtag_in_preview", (Boolean) true);

    /* renamed from: cv */
    public static final C6805b<Boolean> f17048cv = new C6805b<>("live_first_open_hashtag_dialog_in_broadcast", (Boolean) true);

    /* renamed from: cw */
    public static final C6805b<Long> f17049cw = new C6805b<>("live_hashtag_id", (Long) 0L);

    /* renamed from: cx */
    public static final C6805b<String> f17050cx = new C6805b<>("live_hashtag_name", "none");

    /* renamed from: cy */
    public static final C6805b<Boolean> f17051cy = new C6805b<>("live_has_ever_use_hashtag", (Boolean) false);

    /* renamed from: cz */
    public static final C6805b<Boolean> f17052cz = new C6805b<>("live_first_open_props_dialog_in_broadcast", (Boolean) true);

    /* renamed from: d */
    public static final C6805b<String> f17053d = new C6805b<>("assets_cache_data", "");

    /* renamed from: e */
    public static final C6805b<String> f17054e = new C6805b<>("disk_present_assets_cache_data", "");

    /* renamed from: f */
    public static final C6805b<String> f17055f = new C6805b<>("assets_cache_data_last_download_time", "");

    /* renamed from: g */
    public static final C6805b<Long> f17056g = new C6805b<>("assets_cache_last_check_time", (Long) 0L);

    /* renamed from: h */
    public static final C6805b<Integer> f17057h = new C6805b<>("live_broadcast_room_type", (Integer) 0);

    /* renamed from: i */
    public static final C6805b<Integer> f17058i = new C6805b<>("live_camera_type", (Integer) 1);

    /* renamed from: j */
    public static final C6805b<Boolean> f17059j = new C6805b<>("live_media_camera_mirror", (Boolean) false);

    /* renamed from: k */
    public static final C6805b<String> f17060k = new C6805b<>("live_resource_current_version", "");

    /* renamed from: l */
    public static final C6805b<Integer> f17061l = new C6805b<>("live_interact_pk_clean_total_count", (Integer) 5);

    /* renamed from: m */
    public static final C6805b<Integer> f17062m = new C6805b<>("live_interact_pk_total_num", (Integer) 5);

    /* renamed from: n */
    public static final C6805b<String> f17063n = new C6805b<>("live_interact_pk_clean_date", "");

    /* renamed from: o */
    public static final C6805b<Boolean> f17064o = new C6805b<>("live_interact_pk_clean_tip", (Boolean) true);

    /* renamed from: p */
    public static final C6805b<Boolean> f17065p = new C6805b<>("live_interact_pk_steal_tower_tip", (Boolean) true);

    /* renamed from: q */
    public static final C6805b<Integer> f17066q = new C6805b<>("live_interact_pk_tip_show_num", (Integer) 0);

    /* renamed from: r */
    public static final C6805b<String> f17067r = new C6805b<>("live_interact_pk_tip_show_date", "");

    /* renamed from: s */
    public static final C6805b<Long> f17068s = new C6805b<>("live_prop_expire_tip_time", (Long) 0L);

    /* renamed from: t */
    public static final C6805b<String> f17069t = new C6805b<>("last_share_channel", "");

    /* renamed from: u */
    public static final C6805b<Boolean> f17070u = new C6805b<>("first_enter_live_start", (Boolean) true);

    /* renamed from: v */
    public static final C6805b<Long> f17071v = new C6805b<>("current_room_id", (Long) 0L);

    /* renamed from: w */
    public static final C6805b<Long> f17072w = new C6805b<>("current_room_start_time", (Long) 0L);

    /* renamed from: x */
    public static final C6805b<Long> f17073x = new C6805b<>("current_preview_start_time", (Long) 0L);

    /* renamed from: y */
    public static final C6805b<Long> f17074y = new C6805b<>("live_last_active_time", (Long) 0L);

    /* renamed from: z */
    public static final C6805b<Long> f17075z = new C6805b<>("live_stream_video_capture_last_time", (Long) 0L);

    static {
        Covode.recordClassIndex(7542);
        Float valueOf = Float.valueOf(-1.0f);
        f16887P = new C6805b<>("brightening_param_v2", valueOf);
        f16888Q = new C6805b<>("beauty_skin_param_v2", valueOf);
        f16889R = new C6805b<>("big_eyes_param", valueOf);
        f16890S = new C6805b<>("face_lift_param", valueOf);
        Float valueOf2 = Float.valueOf(1.0f);
        f16895X = new C6805b<>("barrage_alpha", valueOf2);
        f16896Y = new C6805b<>("barrage_size", valueOf2);
    }
}
