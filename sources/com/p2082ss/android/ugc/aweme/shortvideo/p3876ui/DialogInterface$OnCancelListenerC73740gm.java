package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gm */
public final /* synthetic */ class DialogInterface$OnCancelListenerC73740gm implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f165577a;

    static {
        Covode.recordClassIndex(86478);
    }

    DialogInterface$OnCancelListenerC73740gm(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f165577a = videoRecordPermissionActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f165577a;
        VideoRecordPermissionActivity.m129478a();
        videoRecordPermissionActivity.finish();
    }
}
