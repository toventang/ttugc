package com.p2082ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73766c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$startToolPermissionActivity$3 */
public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$3 implements AbstractC63212bb.AbstractC63213a {
    final /* synthetic */ boolean $clearOld;
    final /* synthetic */ Activity $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $isBack2Main;
    final /* synthetic */ boolean $recreateSupport;

    static {
        Covode.recordClassIndex(80040);
    }

    public final void onCancel() {
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
    public final void onSuccess() {
        Activity activity = this.$context;
        Intent intent = this.$intent;
        boolean z = this.$recreateSupport;
        boolean z2 = this.$clearOld;
        boolean z3 = this.$isBack2Main;
        if (C74007f.m130173b(intent)) {
            C84911q.m145928d("unable to start activity,isAppBackground " + C40964c.C40968c.f95804a.mo70144a());
            return;
        }
        C84911q.m145921a("startToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport" + z + ",clearOld:" + z2);
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        IAVPublishService publishService = AVExternalServiceImpl.m113114a().publishService();
        if (!publishService.isParallelPublishEnabled()) {
            C70005cr.m123611a();
            if (!C70005cr.m123613a(activity)) {
                return;
            }
        } else if (!publishService.isPublishable()) {
            return;
        }
        if (!C63238c.m114591a() || !z || !C73766c.m129818a(intent).mo116239a(activity)) {
            intent.setClass(activity, VideoRecordPermissionActivity.class);
        } else {
            C74007f.m130177c((Context) activity, intent);
            if (z2 && C74007f.m130172b((Context) activity, intent)) {
                return;
            }
        }
        C74007f.m130161a(activity, intent);
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$3(Activity activity, Intent intent, boolean z, boolean z2, boolean z3) {
        this.$context = activity;
        this.$intent = intent;
        this.$recreateSupport = z;
        this.$clearOld = z2;
        this.$isBack2Main = z3;
    }
}
