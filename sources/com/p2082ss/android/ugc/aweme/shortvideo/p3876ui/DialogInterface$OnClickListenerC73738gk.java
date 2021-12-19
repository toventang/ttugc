package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gk */
public final /* synthetic */ class DialogInterface$OnClickListenerC73738gk implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f165575a;

    static {
        Covode.recordClassIndex(86476);
    }

    DialogInterface$OnClickListenerC73738gk(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f165575a = videoRecordPermissionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f165575a;
        VideoRecordPermissionActivity.m129478a();
        videoRecordPermissionActivity.finish();
    }
}
