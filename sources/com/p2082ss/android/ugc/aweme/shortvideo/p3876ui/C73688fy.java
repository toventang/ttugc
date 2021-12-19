package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.fy */
final /* synthetic */ class C73688fy implements AbstractC2565m {

    /* renamed from: a */
    private final VideoRecordNewActivity f165523a;

    static {
        Covode.recordClassIndex(86426);
    }

    C73688fy(VideoRecordNewActivity videoRecordNewActivity) {
        this.f165523a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f165523a;
        if (((Boolean) obj).booleanValue() && videoRecordNewActivity.f164830y) {
            videoRecordNewActivity.f164830y = false;
            C84911q.m145921a("VideoRecordNewActivity => addFragment by getFrameAvailableEvent");
            videoRecordNewActivity.f164813h.post(new RunnableC73687fx(videoRecordNewActivity));
        }
    }
}
