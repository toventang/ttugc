package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.settings.C68748n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.viewmodel.VideoPublishViewModel;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ce */
public final /* synthetic */ class View$OnClickListenerC73555ce implements View.OnClickListener {

    /* renamed from: a */
    private final VideoPublishActivity f165250a;

    /* renamed from: b */
    private final boolean f165251b;

    static {
        Covode.recordClassIndex(86292);
    }

    View$OnClickListenerC73555ce(VideoPublishActivity videoPublishActivity, boolean z) {
        this.f165250a = videoPublishActivity;
        this.f165251b = z;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VideoPublishActivity videoPublishActivity = this.f165250a;
        boolean z = this.f165251b;
        VideoPublishViewModel h = videoPublishActivity.mo115987h();
        boolean z2 = videoPublishActivity.f164775e.mIsFromDraft;
        if (C68748n.m121185a()) {
            h.mo33690d(new VideoPublishViewModel.C73816c(z, z2));
        } else {
            h.mo33689c(new VideoPublishViewModel.C73817d(z, z2));
        }
    }
}
