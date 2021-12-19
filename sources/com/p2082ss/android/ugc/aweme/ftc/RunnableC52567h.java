package com.p2082ss.android.ugc.aweme.ftc;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.p3804d.p3805a.C70626a;

/* renamed from: com.ss.android.ugc.aweme.ftc.h */
final /* synthetic */ class RunnableC52567h implements Runnable {

    /* renamed from: a */
    private final FTCVideoRecordNewActivity f121028a;

    static {
        Covode.recordClassIndex(61963);
    }

    RunnableC52567h(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f121028a = fTCVideoRecordNewActivity;
    }

    public final void run() {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f121028a;
        DefaultGesturePresenter defaultGesturePresenter = new DefaultGesturePresenter(fTCVideoRecordNewActivity, fTCVideoRecordNewActivity, null, fTCVideoRecordNewActivity.f119430v);
        fTCVideoRecordNewActivity.f119401A.mo22834v();
        defaultGesturePresenter.mo23040a(1, new C70626a(fTCVideoRecordNewActivity.f119401A.mo22747A().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) fTCVideoRecordNewActivity.f119401A.mo22750D().getLayoutParams())));
    }
}
