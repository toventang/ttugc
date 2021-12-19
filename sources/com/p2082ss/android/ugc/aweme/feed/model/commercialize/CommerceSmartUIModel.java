package com.p2082ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel */
public class CommerceSmartUIModel implements Serializable {
    @AbstractC27891c(mo46611a = "playtime_ml")
    private CommerceSmartUIPlayTime playTime;
    @AbstractC27891c(mo46611a = "commerce_ml_ui_strategy")
    private CommerceSmartUIStrategyConfig uiStrategy;

    static {
        Covode.recordClassIndex(58780);
    }

    public final CommerceSmartUIPlayTime getPlayTime() {
        return this.playTime;
    }

    public final CommerceSmartUIStrategyConfig getUiStrategy() {
        return this.uiStrategy;
    }

    public final void setPlayTime(CommerceSmartUIPlayTime commerceSmartUIPlayTime) {
        this.playTime = commerceSmartUIPlayTime;
    }

    public final void setUiStrategy(CommerceSmartUIStrategyConfig commerceSmartUIStrategyConfig) {
        this.uiStrategy = commerceSmartUIStrategyConfig;
    }
}
