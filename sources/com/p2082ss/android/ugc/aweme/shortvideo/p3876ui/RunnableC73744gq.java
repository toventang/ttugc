package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.DialogC73767d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gq */
public final /* synthetic */ class RunnableC73744gq implements Runnable {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f165582a;

    /* renamed from: b */
    private final String[] f165583b;

    /* renamed from: c */
    private final DialogC73767d f165584c;

    static {
        Covode.recordClassIndex(86482);
    }

    RunnableC73744gq(VideoRecordPermissionActivity videoRecordPermissionActivity, String[] strArr, DialogC73767d dVar) {
        this.f165582a = videoRecordPermissionActivity;
        this.f165583b = strArr;
        this.f165584c = dVar;
    }

    public final void run() {
        this.f165582a.mo116012a(this.f165583b, this.f165584c);
    }
}
