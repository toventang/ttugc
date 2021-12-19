package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73765b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gp */
public final /* synthetic */ class C73743gp implements AbstractC89171a {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f165580a;

    /* renamed from: b */
    private final String[] f165581b;

    static {
        Covode.recordClassIndex(86481);
    }

    C73743gp(VideoRecordPermissionActivity videoRecordPermissionActivity, String[] strArr) {
        this.f165580a = videoRecordPermissionActivity;
        this.f165581b = strArr;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f165580a;
        String[] strArr = this.f165581b;
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(videoRecordPermissionActivity, "");
        C39162r.m79460a("permission_rationale_page_action_close", C73765b.m129817d(strArr, videoRecordPermissionActivity));
        videoRecordPermissionActivity.finish();
        return C89391z.f203057a;
    }
}
