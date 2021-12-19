package com.p2082ss.android.ugc.aweme.share.gif.p3751ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.h */
final /* synthetic */ class View$OnClickListenerC68952h implements View.OnClickListener {

    /* renamed from: a */
    private final VideoShare2GifPreviewActivity f154258a;

    static {
        Covode.recordClassIndex(81264);
    }

    View$OnClickListenerC68952h(VideoShare2GifPreviewActivity videoShare2GifPreviewActivity) {
        this.f154258a = videoShare2GifPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VideoShare2GifPreviewActivity videoShare2GifPreviewActivity = this.f154258a;
        if (view.getId() == R.id.esp) {
            C39162r.m79460a("gif_re_edit", new HashMap());
            videoShare2GifPreviewActivity.setResult(0);
            videoShare2GifPreviewActivity.finish();
        }
    }
}
