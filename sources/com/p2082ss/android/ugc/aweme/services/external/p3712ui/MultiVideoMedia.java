package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.MultiVideoMedia */
public final class MultiVideoMedia implements MediaInfo {
    private Bundle extraBundle;
    private final ArrayList<MediaModel> videoMedias;

    static {
        Covode.recordClassIndex(79870);
    }

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final ArrayList<MediaModel> getVideoMedias() {
        return this.videoMedias;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }

    public MultiVideoMedia(ArrayList<MediaModel> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.videoMedias = arrayList;
    }
}
