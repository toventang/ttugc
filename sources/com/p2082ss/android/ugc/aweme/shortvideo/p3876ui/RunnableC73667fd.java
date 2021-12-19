package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.p3804d.p3805a.C70626a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.fd */
final /* synthetic */ class RunnableC73667fd implements Runnable {

    /* renamed from: a */
    private final VideoRecordNewActivity f165501a;

    static {
        Covode.recordClassIndex(86405);
    }

    RunnableC73667fd(VideoRecordNewActivity videoRecordNewActivity) {
        this.f165501a = videoRecordNewActivity;
    }

    public final void run() {
        VideoRecordNewActivity videoRecordNewActivity = this.f165501a;
        DefaultGesturePresenter defaultGesturePresenter = new DefaultGesturePresenter(videoRecordNewActivity, videoRecordNewActivity, null, videoRecordNewActivity.f164829x);
        videoRecordNewActivity.f164792F.mo22834v();
        defaultGesturePresenter.mo23040a(1, new C70626a(videoRecordNewActivity.f164792F.mo22747A().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) videoRecordNewActivity.f164792F.mo22750D().getLayoutParams())));
    }
}
