package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.fo */
final /* synthetic */ class RunnableC73678fo implements Runnable {

    /* renamed from: a */
    private final VideoRecordNewActivity f165513a;

    static {
        Covode.recordClassIndex(86416);
    }

    RunnableC73678fo(VideoRecordNewActivity videoRecordNewActivity) {
        this.f165513a = videoRecordNewActivity;
    }

    public final void run() {
        VideoRecordNewActivity videoRecordNewActivity = this.f165513a;
        if (videoRecordNewActivity.f164830y) {
            videoRecordNewActivity.f164830y = false;
            C84911q.m145921a("VideoRecordNewActivity => addFragment by postDelay");
            videoRecordNewActivity.mo115997o();
            videoRecordNewActivity.mo115996n();
        }
    }
}
