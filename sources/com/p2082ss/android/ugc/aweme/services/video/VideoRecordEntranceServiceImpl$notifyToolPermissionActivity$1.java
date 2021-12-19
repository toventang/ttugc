package com.p2082ss.android.ugc.aweme.services.video;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73766c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1 */
public final class VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1 implements AbstractC63212bb.AbstractC63213a {
    final /* synthetic */ boolean $clearOld;
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $isBack2Main;
    final /* synthetic */ boolean $recreateSupport;

    static {
        Covode.recordClassIndex(80036);
    }

    public final void onCancel() {
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
    public final void onSuccess() {
        Context context = this.$context;
        Intent intent = this.$intent;
        boolean z = this.$recreateSupport;
        boolean z2 = this.$clearOld;
        boolean z3 = this.$isBack2Main;
        C84911q.m145921a("notifyToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport" + z + ",clearOld:" + z2);
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        IAVPublishService publishService = AVExternalServiceImpl.m113114a().publishService();
        if (!publishService.isParallelPublishEnabled()) {
            C70005cr.m123611a();
            if (!C70005cr.m123613a(context)) {
                return;
            }
        } else if (!publishService.isPublishable()) {
            return;
        }
        if (!C63238c.m114591a() || !z || !C73766c.m129818a(intent).mo116239a(context)) {
            intent.setClass(context, VideoRecordPermissionActivity.class);
        } else {
            C74007f.m130177c(context, intent);
            if (z2 && C74007f.m130172b(context, intent)) {
                return;
            }
        }
        C74007f.m130164a(context, intent);
    }

    VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        this.$context = context;
        this.$intent = intent;
        this.$recreateSupport = z;
        this.$clearOld = z2;
        this.$isBack2Main = z3;
    }
}
