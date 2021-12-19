package com.bytedance.android.livesdk.model;

import com.bytedance.android.livesdk.p561j.C9139u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: com.bytedance.android.livesdk.model.k */
public enum EnumC9592k {
    PREVIEW,
    VIDEO,
    OBS,
    GAME,
    END,
    AUDIENCE;

    static {
        Covode.recordClassIndex(11131);
    }

    public final void config() {
        DataChannelGlobal.f42558d.mo28325b(C9139u.class, this);
    }

    public final boolean isAudience() {
        if (this == AUDIENCE) {
            return true;
        }
        return false;
    }

    public final boolean isEndPage() {
        if (this == END) {
            return true;
        }
        return false;
    }

    public final boolean isGamePage() {
        if (this == GAME) {
            return true;
        }
        return false;
    }

    public final boolean isOBSPage() {
        if (this == OBS) {
            return true;
        }
        return false;
    }

    public final boolean isPreviewPage() {
        if (this == PREVIEW) {
            return true;
        }
        return false;
    }

    public final boolean isVideoPage() {
        if (this == VIDEO) {
            return true;
        }
        return false;
    }
}
