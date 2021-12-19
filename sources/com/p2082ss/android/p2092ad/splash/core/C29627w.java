package com.p2082ss.android.p2092ad.splash.core;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.w */
public final class C29627w {

    /* renamed from: a */
    public int f70653a;

    /* renamed from: b */
    public boolean f70654b;

    /* renamed from: c */
    public boolean f70655c;

    /* renamed from: d */
    public boolean f70656d;

    /* renamed from: e */
    public boolean f70657e;

    /* renamed from: f */
    public boolean f70658f;

    /* renamed from: g */
    public boolean f70659g;

    /* renamed from: h */
    public boolean f70660h;

    /* renamed from: i */
    public boolean f70661i;

    /* renamed from: j */
    public boolean f70662j;

    /* renamed from: k */
    public boolean f70663k;

    /* renamed from: l */
    public boolean f70664l;

    /* renamed from: m */
    public boolean f70665m;

    /* renamed from: n */
    public long f70666n = 400;

    /* renamed from: o */
    public boolean f70667o;

    /* renamed from: p */
    public boolean f70668p;

    /* renamed from: q */
    public boolean f70669q;

    /* renamed from: r */
    public boolean f70670r;

    /* renamed from: s */
    public boolean f70671s;

    static {
        Covode.recordClassIndex(36023);
    }

    /* renamed from: a */
    public static C29627w m59640a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        C29627w wVar = new C29627w();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i = 2;
        int optInt = jSONObject.optInt("max_crash_time", 2);
        if (optInt > 0) {
            i = optInt;
        }
        wVar.f70653a = i;
        boolean z17 = true;
        if (jSONObject.optInt("enable_refactor_track_method", 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        wVar.f70654b = z;
        if (jSONObject.optInt("enable_safe_cache_path") == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        wVar.f70655c = z2;
        if (jSONObject.optInt("enable_add_show_count_for_empty_array", 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        wVar.f70656d = z3;
        if (jSONObject.optInt("enable_old_view_align", 1) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        wVar.f70659g = z4;
        if (jSONObject.optInt("enable_new_clean_strategy", 1) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        wVar.f70657e = z5;
        if (jSONObject.optInt("enable_send_event_async", 1) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        wVar.f70658f = z6;
        if (jSONObject.optInt("enable_remove_empty_list_return", 1) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        wVar.f70660h = z7;
        if (jSONObject.optInt("enable_remove_default_language", 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        wVar.f70661i = z8;
        if (jSONObject.optInt("enable_cold_launch_interval", 0) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        wVar.f70662j = z9;
        if (jSONObject.optInt("enable_post_stop_video", 0) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        wVar.f70663k = z10;
        if (jSONObject.optInt("enable_video_engine_release_async", 0) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        wVar.f70665m = z11;
        if (jSONObject.optInt("enable_pause_video_on_background", 1) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        wVar.f70664l = z12;
        long j = 400;
        long optLong = jSONObject.optLong("reset_count_down_timer_delay", 400);
        if (optLong >= 0) {
            j = optLong;
        }
        wVar.f70666n = j;
        if (jSONObject.optInt("enable_async_video_controller") == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        wVar.f70667o = z13;
        if (jSONObject.optInt("enable_over_refactor", 0) == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        wVar.f70668p = z14;
        if (jSONObject.optInt("enable_full_screen_height_adapt", 1) == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        wVar.f70670r = z15;
        if (jSONObject.optInt("enable_fix_skip_area", 1) == 1) {
            z16 = true;
        } else {
            z16 = false;
        }
        wVar.f70669q = z16;
        if (jSONObject.optInt("enable_metric", 0) != 1) {
            z17 = false;
        }
        wVar.f70671s = z17;
        return wVar;
    }
}
