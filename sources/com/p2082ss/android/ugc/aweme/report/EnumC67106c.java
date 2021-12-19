package com.p2082ss.android.ugc.aweme.report;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.report.c */
public enum EnumC67106c {
    PAGE_SELECT_TOTAL("page_select_total"),
    PAGE_SELECT_BEFORE("page_select_before"),
    PAGE_SELECT_INVOKE_SELECT("page_select_invoke_select"),
    PAGE_SELECT_PLAYER("page_select_player"),
    PAGE_SELECT_AFTER("page_select_after"),
    PLAYER_PAUSE("player_pause"),
    PLAYER_PREPARE("player_prepare"),
    PLAYER_STOP("player_stop"),
    PLAYER_RENDER_READY("player_render_ready"),
    PLAYER_RENDER_FIRST("player_render_first"),
    PLAYER_RENDER_FIRST_DELAY("player_render_first_delay");
    

    /* renamed from: a */
    private final String f150494a;

    public final String getType() {
        return this.f150494a;
    }

    static {
        Covode.recordClassIndex(78688);
    }

    private EnumC67106c(String str) {
        this.f150494a = str;
    }
}
