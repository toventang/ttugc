package com.p2082ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50105bd;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.PhotosensitiveVideoMaskWidget */
public final class PhotosensitiveVideoMaskWidget extends AbsAsyncFeedWidget {

    /* renamed from: a */
    private C50105bd f113938a;

    static {
        Covode.recordClassIndex(58361);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    /* renamed from: a */
    public final void mo60180a(C33942b bVar) {
        C50105bd bdVar = this.f113938a;
        if (bdVar != null) {
            bdVar.onChanged(bVar);
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
        if (this.f113938a == null) {
            this.f113938a = new C50105bd(view);
        }
        C50105bd bdVar = this.f113938a;
        Objects.requireNonNull(bdVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.PhotosensitiveVideoMaskView");
        return bdVar;
    }
}
