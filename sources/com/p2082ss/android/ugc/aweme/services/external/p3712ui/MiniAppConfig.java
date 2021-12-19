package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.MiniAppConfig */
public final class MiniAppConfig implements Serializable {
    private Serializable appClass;
    private C71518t appInfo;
    private String stickerId;

    static {
        Covode.recordClassIndex(79869);
    }

    public final Serializable getAppClass() {
        return this.appClass;
    }

    public final C71518t getAppInfo() {
        return this.appInfo;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final void setAppClass(Serializable serializable) {
        this.appClass = serializable;
    }

    public final void setAppInfo(C71518t tVar) {
        this.appInfo = tVar;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }
}
