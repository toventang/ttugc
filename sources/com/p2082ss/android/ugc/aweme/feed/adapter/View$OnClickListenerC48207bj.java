package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.share.C49914a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56259l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bj */
final /* synthetic */ class View$OnClickListenerC48207bj implements View.OnClickListener {

    /* renamed from: a */
    private final VideoViewCell f111687a;

    /* renamed from: b */
    private final C56259l f111688b;

    static {
        Covode.recordClassIndex(56949);
    }

    View$OnClickListenerC48207bj(VideoViewCell videoViewCell, C56259l lVar) {
        this.f111687a = videoViewCell;
        this.f111688b = lVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VideoViewCell videoViewCell = this.f111687a;
        C56259l lVar = this.f111688b;
        C49914a.m93717a(videoViewCell.f111443av);
        lVar.f128334f.mo92819a();
    }
}
