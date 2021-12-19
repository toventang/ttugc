package com.p2082ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50076ar;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.GeneralVideoMaskWidget */
public final class GeneralVideoMaskWidget extends AbsAsyncFeedWidget {

    /* renamed from: a */
    private C50076ar f113937a;

    static {
        Covode.recordClassIndex(58360);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: a */
    public final void mo60180a(C33942b bVar) {
        C50076ar arVar = this.f113937a;
        if (arVar != null) {
            arVar.onChanged(bVar);
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
        if (this.f113937a == null) {
            this.f113937a = new C50076ar(view);
        }
        C50076ar arVar = this.f113937a;
        Objects.requireNonNull(arVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.GeneralVideoMaskView");
        return arVar;
    }
}
