package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73772f;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import dmt.p4542av.video.p4548e.C88253a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gw */
public final /* synthetic */ class C73750gw implements AbstractC63264v.AbstractC63265a {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f165591a;

    static {
        Covode.recordClassIndex(86488);
    }

    C73750gw(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f165591a = videoRecordPermissionActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v.AbstractC63265a
    /* renamed from: a */
    public final void mo87657a(String[] strArr, int[] iArr) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f165591a;
        if (iArr != null) {
            if (!(iArr.length == 0 || strArr == null || strArr.length == 0 || strArr.length != iArr.length)) {
                int length = strArr.length;
                String str = "confirm";
                for (int i = 0; i < length; i++) {
                    String str2 = strArr[i];
                    String str3 = "deny";
                    if (iArr[i] == 0) {
                        str3 = "confirm";
                    } else {
                        str = str3;
                    }
                    C39162r.m79460a("permission_toast_result", new C84425b().mo129406a("permission_type", C88253a.m153362a(str2)).mo129406a("permission_result", str3).mo129406a("enter_from", "video_shoot_page").f188764a);
                }
                C80322d.m139251a("tools_performance_permission", new C84425b().mo129406a("scene", "permission_result").mo129406a("status", str).f188764a);
            }
        }
        if (!C73772f.m129824a(iArr)) {
            videoRecordPermissionActivity.f164838a.mo116380a(new RunnableC73741gn(videoRecordPermissionActivity));
        } else {
            videoRecordPermissionActivity.mo116011a(true);
        }
    }
}
