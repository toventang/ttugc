package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bp */
public final /* synthetic */ class View$OnClickListenerC48213bp implements View.OnClickListener {

    /* renamed from: a */
    private final VideoViewCell f111696a;

    static {
        Covode.recordClassIndex(56955);
    }

    View$OnClickListenerC48213bp(VideoViewCell videoViewCell) {
        this.f111696a = videoViewCell;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111696a.mo80181aL();
    }
}
