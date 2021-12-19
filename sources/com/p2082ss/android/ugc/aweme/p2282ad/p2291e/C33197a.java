package com.p2082ss.android.ugc.aweme.p2282ad.p2291e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ad.e.a */
public class C33197a implements Serializable {
    @AbstractC27891c(mo46611a = "ad_landing_page_auto_jump_control_enabled")

    /* renamed from: a */
    boolean f78881a = true;
    @AbstractC27891c(mo46611a = "ad_landing_page_click_jump_control_enabled")

    /* renamed from: b */
    boolean f78882b = true;
    @AbstractC27891c(mo46611a = "ad_landing_page_auto_jump_allow_list")

    /* renamed from: c */
    List<String> f78883c;
    @AbstractC27891c(mo46611a = "ad_splash_landing_page_auto_jump_allow_list")

    /* renamed from: d */
    List<String> f78884d;
    @AbstractC27891c(mo46611a = "ad_landing_page_auto_jump_intercept_list")

    /* renamed from: e */
    List<String> f78885e;
    @AbstractC27891c(mo46611a = "ad_landing_page_click_jump_interval")

    /* renamed from: f */
    int f78886f;
    @AbstractC27891c(mo46611a = "ad_landing_page_click_jump_interval_tips")

    /* renamed from: g */
    String f78887g;
    @AbstractC27891c(mo46611a = "ad_landing_page_click_jump_allow_list")

    /* renamed from: h */
    List<String> f78888h;
    @AbstractC27891c(mo46611a = "ad_landing_page_pause_list")

    /* renamed from: i */
    List<String> f78889i;

    static {
        Covode.recordClassIndex(40017);
    }

    public List<String> getAutoJumpAllowList() {
        return this.f78883c;
    }

    public List<String> getAutoJumpInterceptList() {
        return this.f78885e;
    }

    public int getAutoJumpInterval() {
        return this.f78886f;
    }

    public String getAutoJumpIntervalTips() {
        return this.f78887g;
    }

    public List<String> getClickJumpAllowList() {
        return this.f78888h;
    }

    public List<String> getPauseList() {
        return this.f78889i;
    }

    public List<String> getSplashAdAutoJumpAllowList() {
        return this.f78884d;
    }

    public boolean isClickControlEnabled() {
        return this.f78882b;
    }

    public boolean isJumpControlEnabled() {
        return this.f78881a;
    }

    public void setAutoJumpAllowList(List<String> list) {
        this.f78883c = list;
    }

    public void setAutoJumpInterceptList(List<String> list) {
        this.f78885e = list;
    }

    public void setAutoJumpInterval(int i) {
        this.f78886f = i;
    }

    public void setAutoJumpIntervalTips(String str) {
        this.f78887g = str;
    }

    public void setClickControlEnabled(boolean z) {
        this.f78882b = z;
    }

    public void setClickJumpAllowList(List<String> list) {
        this.f78888h = list;
    }

    public void setJumpControlEnabled(boolean z) {
        this.f78881a = z;
    }

    public void setPauseList(List<String> list) {
        this.f78889i = list;
    }

    public void setSplashAdAutoJumpAllowList(List<String> list) {
        this.f78884d = list;
    }
}
