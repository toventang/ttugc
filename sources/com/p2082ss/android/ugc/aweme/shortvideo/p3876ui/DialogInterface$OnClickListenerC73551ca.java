package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ca */
final /* synthetic */ class DialogInterface$OnClickListenerC73551ca implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final VideoPublishActivity f165246a;

    static {
        Covode.recordClassIndex(86288);
    }

    DialogInterface$OnClickListenerC73551ca(VideoPublishActivity videoPublishActivity) {
        this.f165246a = videoPublishActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VideoPublishActivity videoPublishActivity = this.f165246a;
        C80285bz.m139185a(videoPublishActivity.f164775e, true);
        C39162r.m79460a("click_audio_clear_popup", videoPublishActivity.mo115986g().mo129406a("click_type", "not_now").f188764a);
    }
}
