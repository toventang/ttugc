package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bw */
final /* synthetic */ class C73539bw implements AbstractC31071f.AbstractC31073b {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity f165219a;

    static {
        Covode.recordClassIndex(86276);
    }

    C73539bw(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f165219a = vEVideoPublishPreviewActivity;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f.AbstractC31073b
    /* renamed from: a */
    public final void mo56404a(int i) {
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f165219a;
        String a = vEVideoPublishPreviewActivity.f164722i.mo118854a(i);
        if (TextUtils.isEmpty(a)) {
            vEVideoPublishPreviewActivity.f164732s.setVisibility(4);
            return;
        }
        vEVideoPublishPreviewActivity.f164732s.setVisibility(0);
        vEVideoPublishPreviewActivity.f164732s.setText(a);
    }
}
