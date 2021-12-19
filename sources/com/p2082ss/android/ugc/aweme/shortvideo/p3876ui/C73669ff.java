package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ff */
final /* synthetic */ class C73669ff implements AbstractC1214u {

    /* renamed from: a */
    private final VideoRecordNewActivity f165503a;

    static {
        Covode.recordClassIndex(86407);
    }

    C73669ff(VideoRecordNewActivity videoRecordNewActivity) {
        this.f165503a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f165503a;
        if (((Boolean) obj).booleanValue()) {
            videoRecordNewActivity.mo116001q();
        } else if (videoRecordNewActivity.f164817l != null && videoRecordNewActivity.f164817l.isShowing()) {
            videoRecordNewActivity.f164817l.dismiss();
            videoRecordNewActivity.f164817l = null;
        }
    }
}
