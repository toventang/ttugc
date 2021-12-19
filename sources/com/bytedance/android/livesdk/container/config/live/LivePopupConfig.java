package com.bytedance.android.livesdk.container.config.live;

import com.bytedance.android.livesdk.container.p503a.AbstractC8211a;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

public final class LivePopupConfig extends LiveHybridConfig {
    @AbstractC8211a(mo14464a = "min_margin_top")
    private int minMarginTop;
    @AbstractC8211a(mo14464a = "pull_down_close_containers")
    private JSONArray pullDownCloseIds;
    @AbstractC8211a(mo14464a = "variable_height")
    private int variableHeight;

    static {
        Covode.recordClassIndex(9066);
    }

    public final int getMinMarginTop() {
        return this.minMarginTop;
    }

    public final JSONArray getPullDownCloseIds() {
        return this.pullDownCloseIds;
    }

    public final int getVariableHeight() {
        return this.variableHeight;
    }

    public final void setMinMarginTop(int i) {
        this.minMarginTop = i;
    }

    public final void setPullDownCloseIds(JSONArray jSONArray) {
        this.pullDownCloseIds = jSONArray;
    }

    public final void setVariableHeight(int i) {
        this.variableHeight = i;
    }
}
