package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73765b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73772f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.DialogC73767d;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gu */
public final /* synthetic */ class C73748gu implements AbstractC63264v.AbstractC63265a {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f165588a;

    /* renamed from: b */
    private final DialogC73767d f165589b;

    static {
        Covode.recordClassIndex(86486);
    }

    C73748gu(VideoRecordPermissionActivity videoRecordPermissionActivity, DialogC73767d dVar) {
        this.f165588a = videoRecordPermissionActivity;
        this.f165589b = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v.AbstractC63265a
    /* renamed from: a */
    public final void mo87657a(String[] strArr, int[] iArr) {
        String[] strArr2;
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f165588a;
        DialogC73767d dVar = this.f165589b;
        C73765b.m129814a(strArr, iArr, videoRecordPermissionActivity);
        if (C73772f.m129824a(iArr)) {
            videoRecordPermissionActivity.f164838a.mo116380a(new RunnableC73742go(videoRecordPermissionActivity));
            return;
        }
        dVar.mo9590b();
        if (dVar.f165619a) {
            strArr2 = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
        } else {
            strArr2 = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        if (C73772f.m129822a(dVar.f165623e, strArr2)) {
            TuxTextView tuxTextView = dVar.f165620b;
            if (tuxTextView != null) {
                tuxTextView.setText(dVar.getContext().getString(R.string.g7i));
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = dVar.f165620b;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(dVar.getContext().getString(R.string.g7k));
        }
    }
}
