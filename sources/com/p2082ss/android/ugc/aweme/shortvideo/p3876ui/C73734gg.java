package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73765b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73772f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.DialogC73767d;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gg */
public final /* synthetic */ class C73734gg implements AbstractC89171a {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f165568a;

    /* renamed from: b */
    private final String[] f165569b;

    /* renamed from: c */
    private final DialogC73767d f165570c;

    static {
        Covode.recordClassIndex(86472);
    }

    C73734gg(VideoRecordPermissionActivity videoRecordPermissionActivity, String[] strArr, DialogC73767d dVar) {
        this.f165568a = videoRecordPermissionActivity;
        this.f165569b = strArr;
        this.f165570c = dVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f165568a;
        String[] strArr = this.f165569b;
        DialogC73767d dVar = this.f165570c;
        if (C73772f.m129822a(videoRecordPermissionActivity, strArr)) {
            videoRecordPermissionActivity.mo116012a(strArr, dVar);
        } else {
            C89219l.m154721d(strArr, "");
            C89219l.m154721d(videoRecordPermissionActivity, "");
            C39162r.m79460a("permission_rationale_page_action_setting", C73765b.m129817d(strArr, videoRecordPermissionActivity));
            C63238c.f143566D.mo73307c().mo101675d(videoRecordPermissionActivity);
            videoRecordPermissionActivity.finish();
        }
        return C89391z.f203057a;
    }
}
