package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.VideoMedia */
public final class VideoMedia implements MediaInfo {
    private Bundle extraBundle;
    private final String filePath;

    static {
        Covode.recordClassIndex(79884);
    }

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }

    public VideoMedia(String str) {
        C89219l.m154721d(str, "");
        this.filePath = str;
    }
}
