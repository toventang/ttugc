package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bk */
public final /* synthetic */ class View$OnClickListenerC48208bk implements View.OnClickListener {

    /* renamed from: a */
    private final VideoViewCell f111689a;

    /* renamed from: b */
    private final Context f111690b;

    static {
        Covode.recordClassIndex(56950);
    }

    View$OnClickListenerC48208bk(VideoViewCell videoViewCell, Context context) {
        this.f111689a = videoViewCell;
        this.f111690b = context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111689a.mo80159a(this.f111690b);
    }
}
