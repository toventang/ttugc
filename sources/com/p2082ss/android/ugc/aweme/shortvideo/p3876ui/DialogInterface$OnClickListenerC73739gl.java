package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gl */
public final /* synthetic */ class DialogInterface$OnClickListenerC73739gl implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f165576a;

    static {
        Covode.recordClassIndex(86477);
    }

    DialogInterface$OnClickListenerC73739gl(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f165576a = videoRecordPermissionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f165576a;
        C63238c.f143566D.mo73307c().mo101675d(videoRecordPermissionActivity);
        videoRecordPermissionActivity.finish();
    }
}
