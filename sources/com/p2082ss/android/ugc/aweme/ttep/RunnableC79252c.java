package com.p2082ss.android.ugc.aweme.ttep;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.p3804d.p3805a.C70626a;

/* renamed from: com.ss.android.ugc.aweme.ttep.c */
final /* synthetic */ class RunnableC79252c implements Runnable {

    /* renamed from: a */
    private final TTEPEffectPreviewActivity f178073a;

    static {
        Covode.recordClassIndex(92439);
    }

    RunnableC79252c(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f178073a = tTEPEffectPreviewActivity;
    }

    public final void run() {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f178073a;
        DefaultGesturePresenter defaultGesturePresenter = new DefaultGesturePresenter(tTEPEffectPreviewActivity, tTEPEffectPreviewActivity, null, tTEPEffectPreviewActivity.f177945v);
        tTEPEffectPreviewActivity.f177914C.mo22834v();
        defaultGesturePresenter.mo23040a(1, new C70626a(tTEPEffectPreviewActivity.f177914C.mo22747A().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) tTEPEffectPreviewActivity.f177934k.getLayoutParams())));
    }
}
