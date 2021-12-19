package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65409cs;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.PreviewFakeFeedView;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3879b.C73483a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3879b.C73484b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3879b.C73485c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bs */
final /* synthetic */ class View$OnClickListenerC73535bs implements View.OnClickListener {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity f165212a;

    static {
        Covode.recordClassIndex(86272);
    }

    View$OnClickListenerC73535bs(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f165212a = vEVideoPublishPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f165212a;
        if (!C65409cs.m117124b()) {
            vEVideoPublishPreviewActivity.mo115952m();
            vEVideoPublishPreviewActivity.mo87538j();
        } else if (vEVideoPublishPreviewActivity.f164724k == C73485c.f165112a) {
            vEVideoPublishPreviewActivity.mo115948c(true);
            vEVideoPublishPreviewActivity.f164719f.mo142799d();
            vEVideoPublishPreviewActivity.f164728o.setVisibility(0);
            vEVideoPublishPreviewActivity.f164724k = C73484b.f165111a;
        } else if (vEVideoPublishPreviewActivity.f164724k == C73484b.f165111a) {
            vEVideoPublishPreviewActivity.mo115948c(true);
            vEVideoPublishPreviewActivity.f164719f.mo142800e();
            vEVideoPublishPreviewActivity.f164728o.setVisibility(4);
            vEVideoPublishPreviewActivity.f164724k = C73485c.f165112a;
        } else if (vEVideoPublishPreviewActivity.f164724k == C73483a.f165110a) {
            vEVideoPublishPreviewActivity.mo115948c(false);
            vEVideoPublishPreviewActivity.f164723j.setVisibility(0);
            vEVideoPublishPreviewActivity.f164727n.setVisibility(0);
            vEVideoPublishPreviewActivity.f164726m.setVisibility(0);
            vEVideoPublishPreviewActivity.f164730q.setVisibility(0);
            vEVideoPublishPreviewActivity.f164731r.setVisibility(0);
            if (vEVideoPublishPreviewActivity.f164725l == C73484b.f165111a) {
                vEVideoPublishPreviewActivity.f164728o.setVisibility(0);
            }
            if (vEVideoPublishPreviewActivity.f164723j != null) {
                PreviewFakeFeedView previewFakeFeedView = vEVideoPublishPreviewActivity.f164723j;
                previewFakeFeedView.getUiHandler().post(new PreviewFakeFeedView.RunnableC73319c(previewFakeFeedView));
            }
            vEVideoPublishPreviewActivity.f164724k = vEVideoPublishPreviewActivity.f164725l;
        }
    }
}
