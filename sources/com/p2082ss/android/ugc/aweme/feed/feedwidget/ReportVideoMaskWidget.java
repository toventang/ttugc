package com.p2082ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50125bk;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.ReportVideoMaskWidget */
public final class ReportVideoMaskWidget extends AbsAsyncFeedWidget {

    /* renamed from: a */
    private C50125bk f113939a;

    static {
        Covode.recordClassIndex(58362);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: a */
    public final void mo60180a(C33942b bVar) {
        C50125bk bkVar = this.f113939a;
        if (bkVar != null) {
            bkVar.onChanged(bVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: b */
    public final /* synthetic */ AbstractC49544a mo81271b(View view) {
        if (this.f113939a == null) {
            this.f113939a = new C50125bk(view);
        }
        C50125bk bkVar = this.f113939a;
        Objects.requireNonNull(bkVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.ReportVideoMaskView");
        return bkVar;
    }
}
