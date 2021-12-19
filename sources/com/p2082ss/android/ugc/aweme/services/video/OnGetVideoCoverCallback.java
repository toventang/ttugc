package com.p2082ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.video.OnGetVideoCoverCallback */
public interface OnGetVideoCoverCallback {
    static {
        Covode.recordClassIndex(80028);
    }

    void onGetVideoCoverFailed(int i);

    void onGetVideoCoverSuccess(Bitmap bitmap);
}
