package com.p2082ss.android.ugc.aweme.ftc;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.ftc.s */
final /* synthetic */ class RunnableC52799s implements Runnable {

    /* renamed from: a */
    private final FTCVideoRecordNewActivity f121495a;

    static {
        Covode.recordClassIndex(62198);
    }

    RunnableC52799s(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f121495a = fTCVideoRecordNewActivity;
    }

    public final void run() {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f121495a;
        if (fTCVideoRecordNewActivity.f119431w) {
            fTCVideoRecordNewActivity.f119431w = false;
            C84911q.m145921a("VideoRecordNewActivity => addFragment by postDelay");
            fTCVideoRecordNewActivity.mo87539k();
            fTCVideoRecordNewActivity.mo87538j();
        }
    }
}
