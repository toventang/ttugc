package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cd */
final /* synthetic */ class DialogInterface$OnClickListenerC73554cd implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final VideoPublishActivity f165249a;

    static {
        Covode.recordClassIndex(86291);
    }

    DialogInterface$OnClickListenerC73554cd(VideoPublishActivity videoPublishActivity) {
        this.f165249a = videoPublishActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VideoPublishActivity videoPublishActivity = this.f165249a;
        C80285bz.m139185a(videoPublishActivity.f164775e, false);
        videoPublishActivity.mo115988i();
        videoPublishActivity.mo115984a("short_video_draft_music_legality");
        C39162r.m79460a("click_audio_clear_popup", videoPublishActivity.mo115986g().mo129406a("click_type", "select").f188764a);
    }
}
