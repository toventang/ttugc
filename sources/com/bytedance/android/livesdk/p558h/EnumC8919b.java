package com.bytedance.android.livesdk.p558h;

import com.bytedance.android.livesdkapi.AbstractC11748e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.h.b */
public enum EnumC8919b implements AbstractC11748e.AbstractC11749a {
    GIFT_LIST("gift_list", AbstractC11748e.EnumC11750b.String, ""),
    LAST_SHARE_CHANNEL("last_share_channel", AbstractC11748e.EnumC11750b.String, ""),
    SHOW_LIVE_PORTRAIT_GUIDE("show_live_portrait_guide", AbstractC11748e.EnumC11750b.Boolean, false),
    SHOW_LIVE_LANDSCAPE_GUIDE("show_live_landscape_guide", AbstractC11748e.EnumC11750b.Boolean, false),
    FIRST_ENTER_LIVE_START("first_enter_live_start", AbstractC11748e.EnumC11750b.Boolean, true),
    CLICK_RECORD_BUTTON_IN_END_LIVE("click_record_button_in_end_live", AbstractC11748e.EnumC11750b.Boolean, false),
    HAS_SHOW_FILTER_GUIDE("has_show_filter_guide", AbstractC11748e.EnumC11750b.Boolean, false),
    FAST_GIFT_HIDE_CONFIRM_GIFT("fast_gift_hide_confirm_gift", AbstractC11748e.EnumC11750b.Long, 0L),
    DECORATION_ANCHOR_ID("room_decoration_anchor_id", AbstractC11748e.EnumC11750b.Long, 0L),
    DECORATION_TEXT_PASS_LEVEL("room_decoration_text_pass_level", AbstractC11748e.EnumC11750b.Integer, 31),
    DECORATION_CUSTOMIZE_TEXT("room_decoration_customize_text", AbstractC11748e.EnumC11750b.String, ""),
    DECORATION_LIST("room_decoration_list", AbstractC11748e.EnumC11750b.String, ""),
    SHOW_INTERACT_GUIDE("has_shown_interact_guide", AbstractC11748e.EnumC11750b.Long, 0L),
    SEND_DELAY_RED_ENVELOPE("send_delay_red_envelope", AbstractC11748e.EnumC11750b.Boolean, true),
    NEED_FAST_GIFT_HINT("need_fast_gift_hint", AbstractC11748e.EnumC11750b.Boolean, true),
    SHOW_ROOM_DECORATION_TOAST("show_room_decoration_toast", AbstractC11748e.EnumC11750b.Boolean, true),
    LIVE_INTERACT_SETTING_RED_POINT("live_interact_red_point", AbstractC11748e.EnumC11750b.Boolean, true),
    LIVE_INTERACT_PK_SETTING_RED_POINT("live_interact_pk_red_point", AbstractC11748e.EnumC11750b.Boolean, true),
    LIVE_INTERACT_PK_AUTO_MATCH("live_interact_pk_auto_match", AbstractC11748e.EnumC11750b.Boolean, true),
    LIVE_INTERACT_PK_AUTO_START_MATCH("live_interact_pk_auto_start_match", AbstractC11748e.EnumC11750b.Boolean, false),
    LIVE_INTERACT_PK_THEME("live_interact_pk_theme", AbstractC11748e.EnumC11750b.String, ""),
    LIVE_INTERACT_PK_TIME_INDEX("live_interact_pk_time_index", AbstractC11748e.EnumC11750b.Integer, 1),
    LIVE_LAST_SHOW_RED_POINT_TIME("live_last_show_red_point_time", AbstractC11748e.EnumC11750b.Long, 0),
    LIVE_INTERACT_BEAUTY_LEVEL("live_interact_beauty_level", AbstractC11748e.EnumC11750b.Integer, 2);
    

    /* renamed from: a */
    private final String f21983a;

    /* renamed from: b */
    private final AbstractC11748e.EnumC11750b f21984b;

    /* renamed from: c */
    private final Object f21985c;

    /* renamed from: d */
    private final boolean f21986d = true;

    @Override // com.bytedance.android.livesdkapi.AbstractC11748e.AbstractC11749a
    public final Object defValue() {
        return this.f21985c;
    }

    @Override // com.bytedance.android.livesdkapi.AbstractC11748e.AbstractC11749a
    public final String key() {
        return this.f21983a;
    }

    @Override // com.bytedance.android.livesdkapi.AbstractC11748e.AbstractC11749a
    public final boolean supportPersist() {
        return this.f21986d;
    }

    @Override // com.bytedance.android.livesdkapi.AbstractC11748e.AbstractC11749a
    public final AbstractC11748e.EnumC11750b type() {
        return this.f21984b;
    }

    static {
        Covode.recordClassIndex(9804);
    }

    private EnumC8919b(String str, AbstractC11748e.EnumC11750b bVar, Object obj) {
        this.f21983a = str;
        this.f21984b = bVar;
        this.f21985c = obj;
    }
}
