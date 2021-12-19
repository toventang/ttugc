package com.p2082ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$startToolPermissionActivity$2 */
public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$2 implements AbstractC63212bb.AbstractC63213a {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;

    static {
        Covode.recordClassIndex(80039);
    }

    public final void onCancel() {
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
    public final void onSuccess() {
        Context context = this.$context;
        Intent intent = this.$intent;
        if (intent == null || context == null || C74007f.m130173b(intent)) {
            C84911q.m145928d("unable to start activity,isAppBackground " + C40964c.C40968c.f95804a.mo70144a());
        } else if (context instanceof Activity) {
            C74007f.m130161a((Activity) context, intent);
        } else {
            C74007f.m130167a(intent);
            intent.setClass(context, VideoRecordPermissionActivity.class);
            C74007f.m130164a(context, intent);
        }
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$2(Context context, Intent intent) {
        this.$context = context;
        this.$intent = intent;
    }
}
