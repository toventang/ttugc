package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3879b.C73483a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bq */
final /* synthetic */ class View$OnClickListenerC73533bq implements View.OnClickListener {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity f165210a;

    static {
        Covode.recordClassIndex(86270);
    }

    View$OnClickListenerC73533bq(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f165210a = vEVideoPublishPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f165210a;
        vEVideoPublishPreviewActivity.f164723j.setVisibility(4);
        vEVideoPublishPreviewActivity.f164727n.setVisibility(4);
        vEVideoPublishPreviewActivity.f164726m.setVisibility(4);
        vEVideoPublishPreviewActivity.f164728o.setVisibility(4);
        vEVideoPublishPreviewActivity.f164730q.setVisibility(4);
        vEVideoPublishPreviewActivity.f164731r.setVisibility(4);
        C39162r.m79460a("click_delete_virtual_feed_button", vEVideoPublishPreviewActivity.mo115949d(true).f188764a);
        vEVideoPublishPreviewActivity.f164725l = vEVideoPublishPreviewActivity.f164724k;
        vEVideoPublishPreviewActivity.f164724k = C73483a.f165110a;
    }
}
