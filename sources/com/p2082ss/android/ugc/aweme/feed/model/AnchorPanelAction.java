package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorPanelAction */
public final class AnchorPanelAction implements Serializable {
    @AbstractC27891c(mo46611a = "action_type")
    public int actionType;
    @AbstractC27891c(mo46611a = "icon")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = "schema")
    public String schema = "";

    static {
        Covode.recordClassIndex(58606);
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getSchema() {
        return this.schema;
    }
}
