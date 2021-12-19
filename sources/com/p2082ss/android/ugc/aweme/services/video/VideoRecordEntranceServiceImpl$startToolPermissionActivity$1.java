package com.p2082ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$startToolPermissionActivity$1 */
public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$1 implements AbstractC63212bb.AbstractC63213a {
    final /* synthetic */ Activity $context;
    final /* synthetic */ Intent $intent;

    static {
        Covode.recordClassIndex(80038);
    }

    public final void onCancel() {
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
    public final void onSuccess() {
        C74007f.m130161a(this.$context, this.$intent);
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$1(Activity activity, Intent intent) {
        this.$context = activity;
        this.$intent = intent;
    }
}
